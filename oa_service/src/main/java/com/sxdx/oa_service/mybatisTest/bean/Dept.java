package com.sxdx.oa_service.mybatisTest.bean;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:33
 */
public class Dept {
    private Long deptno ;
    private String dname ;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }
}
