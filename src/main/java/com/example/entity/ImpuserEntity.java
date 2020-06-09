package com.example.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class ImpuserEntity {
    @Excel(name = "账号")
    private Long userid;
    @Excel(name = "用户名")
    private String username;
    @Excel(name = "密码")
    private String password;
    @Excel(name = "班级编号")
    private Integer gradeid;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }
}
