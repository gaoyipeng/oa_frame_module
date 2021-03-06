package com.sxdx.oa_service.springCacheTest.model;

import java.io.Serializable;

public class Department implements Serializable {


    private static final long serialVersionUID = -4728619344883719372L;
    private Integer id;

    private String departmentname;

    public Department(Integer id, String departmentname) {
        this.id = id;
        this.departmentname = departmentname;
    }

    public Department() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }
}