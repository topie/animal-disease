package com.topie.database.core.animal.model;

import javax.persistence.*;

@Table(name = "a_report_type")
public class ReportType {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return type_name - 名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置名称
     *
     * @param typeName 名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}