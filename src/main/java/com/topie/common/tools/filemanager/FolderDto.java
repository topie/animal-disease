package com.topie.common.tools.filemanager;

import java.util.List;

/**
 * Created by chenguojun on 2017/1/14.
 */
public class FolderDto {

    private String moveUpDirPath;

    private String currentDirPath;

    private String currentUrl;

    private Integer total;

    private List<FileDto> files;

    public String getMoveUpDirPath() {
        return moveUpDirPath;
    }

    public void setMoveUpDirPath(String moveUpDirPath) {
        this.moveUpDirPath = moveUpDirPath;
    }

    public String getCurrentDirPath() {
        return currentDirPath;
    }

    public void setCurrentDirPath(String currentDirPath) {
        this.currentDirPath = currentDirPath;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<FileDto> getFiles() {
        return files;
    }

    public void setFiles(List<FileDto> files) {
        this.files = files;
    }
}
