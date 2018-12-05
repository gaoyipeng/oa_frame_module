package com.sxdx.oa_service.mybatisTest.service;

import com.sxdx.oa_service.mybatisTest.bean.Dept;

import java.util.List;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:44
 */

public interface DeptService {
    public List<Dept> list() ;

    public boolean add(Dept vo) ;
}
