package com.sxdx.oa_service.springCacheTest.service;

import com.sxdx.oa_service.springCacheTest.model.Department;
import org.springframework.stereotype.Service;

public interface CacheTestService {
    public int deleteByPrimaryKey(Integer id);

    public int insert(Department record);

    public int insertSelective(Department record);

    public Department selectByPrimaryKey(Integer id);

    public Department updateByPrimaryKeySelective(Department record);

    public int updateByPrimaryKey(Department record);
}
