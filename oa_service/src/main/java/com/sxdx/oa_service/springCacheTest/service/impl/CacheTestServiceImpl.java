package com.sxdx.oa_service.springCacheTest.service.impl;

import com.sxdx.oa_service.springCacheTest.dao.DepartmentMapper;
import com.sxdx.oa_service.springCacheTest.model.Department;
import com.sxdx.oa_service.springCacheTest.service.CacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
@CacheConfig(cacheNames = "dept")//抽取缓存的公共配置
public class CacheTestServiceImpl implements CacheTestService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    @CacheEvict(cacheNames = "dept", key="#id")
    public int deleteByPrimaryKey(Integer id) {
        return departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    @Cacheable(cacheNames = {"dept"},//指定缓存组件名字，可以为字符中，也可以为数组
            key = "#root.methodName")
    public Department selectByPrimaryKey(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    @CachePut(cacheNames = {"dept"},key = "#result.id")
    public Department updateByPrimaryKeySelective(Department record) {
        departmentMapper.updateByPrimaryKeySelective(record);
        return record;
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }
}
