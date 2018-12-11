package com.sxdx.oa_service.mybatisTest.dao;

import com.sxdx.oa_service.mybatisTest.bean.Dept;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface DeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> getAllDept();

    int insertDept(Dept record);

    Map<String, Object> getDeptReturnMap(Integer id);
    @MapKey("id")
    Map<Integer, Object> getDeptsReturnMap();

}