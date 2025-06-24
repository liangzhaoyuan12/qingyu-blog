package com.lzy12.entity;

import lombok.Getter;

public class InfoEntity {
    private Integer id;
    private String info;

    public InfoEntity(String info) {
        this.info = info;
    }

    public InfoEntity(Integer id, String info) {
        this.id = id;
        this.info = info;
    }

    public InfoEntity() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
