package com.sxdx.oa_service.mybatisTest.service.impl;

import com.sxdx.oa_service.mybatisTest.bean.Dept;
import com.sxdx.oa_service.mybatisTest.dao.DeptMapper;
import com.sxdx.oa_service.mybatisTest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:45
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptDao;

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    @Transactional
    public boolean add(Dept vo) {
        boolean aa = deptDao.doCreate(vo);
        return aa;
    }
}
