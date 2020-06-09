package com.example.entity;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class AddEntity {
    private Long userid;
    private String addname;
    private String addtype;
    private String adddate;
    private Integer addmark;
    private String adddesc;
    private String addpath;
    private String tag;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public String getAddtype() {
        return addtype;
    }

    public void setAddtype(String addtype) {
        this.addtype = addtype;
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate;
    }

    public Integer getAddmark() {
        return addmark;
    }

    public void setAddmark(Integer addmark) {
        this.addmark = addmark;
    }

    public String getAdddesc() {
        return adddesc;
    }

    public void setAdddesc(String adddesc) {
        this.adddesc = adddesc;
    }

    public String getAddpath() {
        return addpath;
    }

    public void setAddpath(String addpath) {
        this.addpath = addpath;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public  String toString(){
        return "userid:"+this.userid+","+
                "addname:"+this.addname+","+
                "addtype:"+this.addtype+","+
                "adddate:"+this.adddate+","+
                "addvalue:"+this.addmark+","+
                "adddesc:"+this.adddesc+","+
                "addpath:"+this.addpath+","+
                "tag:"+this.tag;
    }
}
