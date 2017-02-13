package com.topie.common.tools.filemanager;

/**
 * Created by chenguojun on 2016/10/18.
 */
public class FileDto implements Comparable {

    private String name;

    private String path;

    private String type;

    private Boolean isDirectory;

    private Boolean hashFile;

    private Long fileSize;

    private String lastModified;

    private String hashKey;

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Boolean getHashFile() {
        return hashFile;
    }

    public void setHashFile(Boolean hashFile) {
        this.hashFile = hashFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getIsDirectory() {
        return isDirectory;
    }

    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    @Override
    public int compareTo(Object o) {
        FileDto fileDto = (FileDto) o;
        return fileDto.getIsDirectory().compareTo(this.getIsDirectory());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FileDto) {
            return this.hashKey != null && this.hashKey.equals(((FileDto) obj).getHashKey());
        } else {
            return false;
        }
    }
}
