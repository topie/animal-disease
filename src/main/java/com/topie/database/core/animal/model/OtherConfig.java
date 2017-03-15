package com.topie.database.core.animal.model;

import javax.persistence.*;

@Table(name = "a_other_config")
public class OtherConfig {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 配置1
     */
    private String part1;

    /**
     * 配置2
     */
    private String part2;

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
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取配置1
     *
     * @return part1 - 配置1
     */
    public String getPart1() {
        return part1;
    }

    /**
     * 设置配置1
     *
     * @param part1 配置1
     */
    public void setPart1(String part1) {
        this.part1 = part1;
    }

    /**
     * 获取配置2
     *
     * @return part2 - 配置2
     */
    public String getPart2() {
        return part2;
    }

    /**
     * 设置配置2
     *
     * @param part2 配置2
     */
    public void setPart2(String part2) {
        this.part2 = part2;
    }
}