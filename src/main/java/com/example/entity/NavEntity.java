package com.example.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class NavEntity implements Serializable {
    private Integer id;
    private String path;
    private String component;
    private String name;
    private List<NavEntity> children;
    private NavMeta meta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NavEntity> getChildren() {
        return children;
    }

    public void setChildren(List<NavEntity> children) {
        this.children = children;
    }

    public NavMeta getMeta() {
        return meta;
    }

    public void setMeta(NavMeta meta) {
        this.meta = meta;
    }
}
