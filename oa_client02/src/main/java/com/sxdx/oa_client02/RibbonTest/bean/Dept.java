package com.sxdx.oa_client02.RibbonTest.bean;

public class Dept {
    private Integer id;

    private String dname;

    public Dept(Integer id, String dname) {
        this.id = id;
        this.dname = dname;
    }

    public Dept() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}