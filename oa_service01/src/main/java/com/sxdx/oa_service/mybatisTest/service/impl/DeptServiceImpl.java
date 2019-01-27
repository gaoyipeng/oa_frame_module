package com.sxdx.oa_service.mybatisTest.service.impl;

import com.sxdx.oa_service.mybatisTest.bean.Dept;
import com.sxdx.oa_service.mybatisTest.dao.DeptMapper;
import com.sxdx.oa_service.mybatisTest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:45
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptDao;
    @Override
    public List<Dept> getAllDept() {
        return deptDao.getAllDept();
    }
    @Override
    public int insertDept(Dept dept) {
        return deptDao.insertDept(dept);
    }
    @Override
    public Map<String, Object> getDeptReturnMap(Integer id) {
        return deptDao.getDeptReturnMap(id);
    }
    @Override
    public Map<Integer,Object> getDeptsReturnMap(){
        return deptDao.getDeptsReturnMap();
    }

}
