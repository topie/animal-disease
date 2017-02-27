package com.topie.database.core.template.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name = "b_filedownload")
public class FileDownload {

    @Id
    @Column(name = "FileId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fileid;

    @Column(name = "FileType")
    private String filetype;

    @Column(name = "FileName")
    private String filename;

    @Column(name = "FileTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date filetime;

    @Column(name = "AgenciesId")
    private String agenciesid;

    @Column(name = "FilePath")
    private String filepath;

    /**
     * @return FileId
     */
    public String getFileid() {
        return fileid;
    }

    /**
     * @param fileid
     */
    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    /**
     * @return FileType
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * @param filetype
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    /**
     * @return FileName
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return FileTime
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    public Date getFiletime() {
        return filetime;
    }

    /**
     * @param filetime
     */
    public void setFiletime(Date filetime) {
        this.filetime = filetime;
    }

    /**
     * @return AgenciesId
     */
    public String getAgenciesid() {
        return agenciesid;
    }

    /**
     * @param agenciesid
     */
    public void setAgenciesid(String agenciesid) {
        this.agenciesid = agenciesid;
    }

    /**
     * @return FilePath
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * @param filepath
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}
