package com.sxdx.oa_service.springCacheTest.service.impl;

import com.sxdx.oa_service.springCacheTest.dao.DepartmentMapper;
import com.sxdx.oa_service.springCacheTest.model.Department;
import com.sxdx.oa_service.springCacheTest.service.CacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class CacheTestServiceImpl implements CacheTestService {

    @Autowired
    RedisTemplate redisTemplate;

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
    @Cacheable(cacheNames = {"dept"},key = "#id")
    public Department selectByPrimaryKey(Integer id) {
        Department department = departmentMapper.selectByPrimaryKey(id);
        redisTemplate.opsForValue().set("key1",department);
        redisTemplate.opsForValue().set("key2","1234",30, TimeUnit.SECONDS);

        return department;
    }

    @Override
    @CachePut(cacheNames = {"dept"},key = "#record.id")
    public Department updateByPrimaryKeySelective(Department record) {
        departmentMapper.updateByPrimaryKeySelective(record);
        return record;
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }
}
