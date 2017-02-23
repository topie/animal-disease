package com.topie.database.core.animal.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "a_news")
public class News {
    @Id
    @Column(name = "new_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String newId;

    @Column(name = "new_title")
    private String newTitle;

    @Column(name = "new_date")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date newDate;

    @Column(name = "new_count")
    private Integer newCount;

    @Column(name = "new_deleteflag")
    private Integer newDeleteflag;

    @Column(name = "new_body")
    private String newBody;

    /**
     * @return new_id
     */
    public String getNewId() {
        return newId;
    }

    /**
     * @param newId
     */
    public void setNewId(String newId) {
        this.newId = newId;
    }

    /**
     * @return new_title
     */
    public String getNewTitle() {
        return newTitle;
    }

    /**
     * @param newTitle
     */
    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    /**
     * @return new_date
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getNewDate() {
        return newDate;
    }

    /**
     * @param newDate
     */
    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    /**
     * @return new_count
     */
    public Integer getNewCount() {
        return newCount;
    }

    /**
     * @param newCount
     */
    public void setNewCount(Integer newCount) {
        this.newCount = newCount;
    }

    /**
     * @return new_deleteflag
     */
    public Integer getNewDeleteflag() {
        return newDeleteflag;
    }

    /**
     * @param newDeleteflag
     */
    public void setNewDeleteflag(Integer newDeleteflag) {
        this.newDeleteflag = newDeleteflag;
    }

    /**
     * @return new_body
     */
    public String getNewBody() {
        return newBody;
    }

    /**
     * @param newBody
     */
    public void setNewBody(String newBody) {
        this.newBody = newBody;
    }
}
