package com.topie.poi;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author y
 */
public class XlsToHtmlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PoiUtil.excelToHtml("/Users/chenguojun/Downloads/OKR汇总20170708.xls", "/Users/chenguojun/Downloads/OKR_SUMMARIY.html");
        } catch (IOException ex) {
            Logger.getLogger(XlsToHtmlTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XlsToHtmlTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XlsToHtmlTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
