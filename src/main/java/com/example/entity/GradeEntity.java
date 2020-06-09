package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class GradeEntity {
    private Integer deptid;
    private Integer gradeid;
    private String gradename;

    @JsonIgnore
    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }
}
