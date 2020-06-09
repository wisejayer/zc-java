package com.example.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class CountEntity {
    @Excel(name = "账户")
    private Long userid;
    @Excel(name = "姓名")
    private String username;
    @Excel(name = "种类1")
    private Integer type1;
    @Excel(name = "种类2")
    private Integer type2;
    @Excel(name = "种类3")
    private Integer type3;
    @Excel(name = "种类4")
    private Integer type4;
    @Excel(name = "种类5")
    private Integer type5;
    @Excel(name = "总分")
    private Integer mark;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Integer getType3() {
        return type3;
    }

    public void setType3(Integer type3) {
        this.type3 = type3;
    }

    public Integer getType4() {
        return type4;
    }

    public void setType4(Integer type4) {
        this.type4 = type4;
    }

    public Integer getType5() {
        return type5;
    }

    public void setType5(Integer type5) {
        this.type5 = type5;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
