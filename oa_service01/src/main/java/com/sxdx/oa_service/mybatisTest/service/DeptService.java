package com.sxdx.oa_service.mybatisTest.service;

import com.sxdx.oa_service.mybatisTest.bean.Dept;

import java.util.List;
import java.util.Map;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:44
 */

public interface DeptService {

    List<Dept> getAllDept();
    int insertDept(Dept dept);
    Map<String,Object> getDeptReturnMap(Integer id);
    Map<Integer,Object> getDeptsReturnMap();
}
