package com.example.entity;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class RespEntity {
    private Integer status;
    private String msg;
    private Object obj;

    private  RespEntity(){}

    public static RespEntity success(String msg,Object obj){
        return new RespEntity(200,msg,obj);
    }
    public  static RespEntity success(String msg){
        return new RespEntity(200,msg,null);
    }

    public static RespEntity falied(String msg,Object obj){
        return new RespEntity(500,msg,obj);
    }
    public  static RespEntity falied(String msg){
        return new RespEntity(500,msg,null);
    }

    private RespEntity(Integer status,String msg,Object obj){
        this.status=status;
        this.msg=msg;
        this.obj=obj;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
