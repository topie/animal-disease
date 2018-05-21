package com.topie.common.tools.tabletoxls;

import com.topie.common.tools.tabletoxls.css.CssApplier;
import com.topie.common.tools.tabletoxls.css.support.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shaun Chyxion <br>
 *         chyxion@163.com <br>
 *         Oct 24, 2014 2:09:02 PM
 * @version 0.0.1
 * @since 0.0.1
 */
public class TableToXls {

    private static final Logger log = LoggerFactory.getLogger(TableToXls.class);

    private static final List<CssApplier> STYLE_APPLIERS = new LinkedList<CssApplier>();

    // static init
    static {
        STYLE_APPLIERS.add(new AlignApplier());
        STYLE_APPLIERS.add(new BackgroundApplier());
        STYLE_APPLIERS.add(new WidthApplier());
        STYLE_APPLIERS.add(new HeightApplier());
        STYLE_APPLIERS.add(new BorderApplier());
        STYLE_APPLIERS.add(new TextApplier());
    }

    private HSSFWorkbook workBook = new HSSFWorkbook();

    private HSSFSheet sheet;

    private Map<String, Object> cellsOccupied = new HashMap<String, Object>();

    private Map<String, HSSFCellStyle> cellStyles = new HashMap<String, HSSFCellStyle>();

    private HSSFCellStyle defaultCellStyle;

    private int maxRow = 0;

    // init
    {
        sheet = workBook.createSheet();
        defaultCellStyle = workBook.createCellStyle();
        defaultCellStyle.setWrapText(true);
        defaultCellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        // border
        short black = new HSSFColor.BLACK().getIndex();
        short thin = CellStyle.BORDER_THIN;
        // top
        defaultCellStyle.setBorderTop(thin);
        defaultCellStyle.setTopBorderColor(black);
        // right
        defaultCellStyle.setBorderRight(thin);
        defaultCellStyle.setRightBorderColor(black);
        // bottom
        defaultCellStyle.setBorderBottom(thin);
        defaultCellStyle.setBottomBorderColor(black);
        // left
        defaultCellStyle.setBorderLeft(thin);
        defaultCellStyle.setLeftBorderColor(black);
    }

    /**
     * process html to xls
     *
     * @param html html char sequence
     * @return xls bytes
     */
    public static byte[] process(CharSequence html) {
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            process(html, baos);
            return baos.toByteArray();
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    log.error("Close Byte Array Inpout Stream Error Caused.", e);
                }
            }
        }
    }

    /**
     * process html to output stream
     *
     * @param html   html char sequence
     * @param output output stream
     */
    public static void process(CharSequence html, OutputStream output) {
        new TableToXls().doProcess(html instanceof String ? (String) html : html.toString(), output);
    }

    // --
    // private methods

    private void processTable(Element table) {
        int rowIndex = 0;
        if (maxRow > 0) {
            // blank row
            maxRow += 2;
            rowIndex = maxRow;
        }
        for (Element row : table.select("tr")) {
            int colIndex = 0;
            for (Element td : row.select("td, th")) {
                // skip occupied cell
                while (cellsOccupied.get(rowIndex + "_" + colIndex) != null) {
                    ++colIndex;
                }
                int rowSpan = 0;
                String strRowSpan = td.attr("rowspan");
                if (StringUtils.isNotBlank(strRowSpan) && StringUtils.isNumeric(strRowSpan)) {
                    rowSpan = Integer.parseInt(strRowSpan);
                }
                int colSpan = 0;
                String strColSpan = td.attr("colspan");
                if (StringUtils.isNotBlank(strColSpan) && StringUtils.isNumeric(strColSpan)) {
                    colSpan = Integer.parseInt(strColSpan);
                }
                // col span & row span
                if (colSpan > 1 && rowSpan > 1) {
                    spanRowAndCol(td, rowIndex, colIndex, rowSpan, colSpan);
                    colIndex += colSpan;
                }
                // col span only
                else if (colSpan > 1) {
                    spanCol(td, rowIndex, colIndex, colSpan);
                    colIndex += colSpan;
                }
                // row span only
                else if (rowSpan > 1) {
                    spanRow(td, rowIndex, colIndex, rowSpan);
                    ++colIndex;
                }
                // no span
                else {
                    createCell(td, getOrCreateRow(rowIndex), colIndex).setCellValue(td.text());
                    ++colIndex;
                }
            }
            ++rowIndex;
        }
    }

    private void doProcess(String html, OutputStream output) {
        Element style = Jsoup.parseBodyFragment(html).select("style").first();
        Map<String, String> styleMap = new HashMap<>();
        if(style!=null){
            Matcher cssMatcher = Pattern.compile("[.](\\w+)\\s*[{]([^}]+)[}]").matcher(style.html());
            while (cssMatcher.find()) {
                String cls = cssMatcher.group(1);
                String st = cssMatcher.group(2);
                styleMap.put(cls, st);
            }
        }
        for (Element table : Jsoup.parseBodyFragment(html).select("table")) {
            Iterator<Map.Entry<String, String>> entries = styleMap.entrySet().iterator();
            while (entries.hasNext()) {
                Map.Entry<String, String> entry = entries.next();
                table.select("." + entry.getKey()).attr("style", entry.getValue());
            }
            processTable(table);
        }
        try {
            workBook.write(output);
        } catch (IOException e) {
            throw new IllegalStateException("Table To XLS, IO ERROR.", e);
        }
    }

    private void spanRow(Element td, int rowIndex, int colIndex, int rowSpan) {
        mergeRegion(rowIndex, rowIndex + rowSpan - 1, colIndex, colIndex);
        for (int i = 0; i < rowSpan; ++i) {
            HSSFRow row = getOrCreateRow(rowIndex + i);
            createCell(td, row, colIndex);
            cellsOccupied.put((rowIndex + i) + "_" + colIndex, true);
        }
        getOrCreateRow(rowIndex).getCell(colIndex).setCellValue(td.text());
    }

    private void spanCol(Element td, int rowIndex, int colIndex, int colSpan) {
        mergeRegion(rowIndex, rowIndex, colIndex, colIndex + colSpan - 1);
        HSSFRow row = getOrCreateRow(rowIndex);
        for (int i = 0; i < colSpan; ++i) {
            createCell(td, row, colIndex + i);
        }
        row.getCell(colIndex).setCellValue(td.text());
    }

    private void spanRowAndCol(Element td, int rowIndex, int colIndex, int rowSpan, int colSpan) {
        mergeRegion(rowIndex, rowIndex + rowSpan - 1, colIndex, colIndex + colSpan - 1);
        for (int i = 0; i < rowSpan; ++i) {
            HSSFRow row = getOrCreateRow(rowIndex + i);
            for (int j = 0; j < colSpan; ++j) {
                createCell(td, row, colIndex + j);
                cellsOccupied.put((rowIndex + i) + "_" + (colIndex + j), true);
            }
        }
        getOrCreateRow(rowIndex).getCell(colIndex).setCellValue(td.text());
    }

    private HSSFCell createCell(Element td, HSSFRow row, int colIndex) {
        HSSFCell cell = row.getCell(colIndex);
        if (cell == null) {
            cell = row.createCell(colIndex);
        }
        return applyStyle(td, cell);
    }

    private HSSFCell applyStyle(Element td, HSSFCell cell) {
        String style = td.attr(CssApplier.STYLE);
        HSSFCellStyle cellStyle = null;
        if (StringUtils.isNotBlank(style)) {
            if (cellStyles.size() < 4000) {
                Map<String, String> mapStyle = parseStyle(style.trim());
                Map<String, String> mapStyleParsed = new HashMap<String, String>();
                for (CssApplier applier : STYLE_APPLIERS) {
                    mapStyleParsed.putAll(applier.parse(mapStyle));
                }
                cellStyle = cellStyles.get(styleStr(mapStyleParsed));
                if (cellStyle == null) {
                    cellStyle = workBook.createCellStyle();
                    cellStyle.cloneStyleFrom(defaultCellStyle);
                    for (CssApplier applier : STYLE_APPLIERS) {
                        applier.apply(cell, cellStyle, mapStyleParsed);
                    }
                    // cache style
                    cellStyles.put(styleStr(mapStyleParsed), cellStyle);
                }
            } else {
                cellStyle = defaultCellStyle;
            }
        } else {
            cellStyle = defaultCellStyle;
        }
        cell.setCellStyle(cellStyle);
        return cell;
    }

    private String styleStr(Map<String, String> style) {
        StringBuilder sbStyle = new StringBuilder();
        Object[] keys = style.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            sbStyle.append(key).append(':').append(style.get(key)).append(';');
        }
        return sbStyle.toString();
    }

    private Map<String, String> parseStyle(String style) {
        Map<String, String> mapStyle = new HashMap<String, String>();
        for (String s : style.split("\\s*;\\s*")) {
            if (StringUtils.isNotBlank(s)) {
                String[] ss = s.split("\\s*\\:\\s*");
                if (ss.length == 2 && StringUtils.isNotBlank(ss[0]) && StringUtils.isNotBlank(ss[1])) {
                    String attrName = ss[0].toLowerCase();
                    String attrValue = ss[1];
                    // do not change font name
                    if (!CssApplier.FONT.equals(attrName) && !CssApplier.FONT_FAMILY.equals(attrName)) {
                        attrValue = attrValue.toLowerCase();
                    }
                    mapStyle.put(attrName, attrValue);
                }
            }
        }
        return mapStyle;
    }

    private HSSFRow getOrCreateRow(int rowIndex) {
        HSSFRow row = sheet.getRow(rowIndex);
        if (row == null) {
            row = sheet.createRow(rowIndex);
            if (rowIndex > maxRow) {
                maxRow = rowIndex;
            }
        }
        return row;
    }

    private void mergeRegion(int firstRow, int lastRow, int firstCol, int lastCol) {
        sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
    }
}
