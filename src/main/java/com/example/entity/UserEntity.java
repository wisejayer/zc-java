package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class UserEntity {
    private Long userid;
    private String username;
    private String gradename;
    private Integer gradeid;
    private Integer perms;

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

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }

    @JsonIgnore
    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }
    @JsonIgnore
    public Integer getPerms() {
        return perms;
    }

    public void setPerms(Integer perms) {
        this.perms = perms;
    }
}
