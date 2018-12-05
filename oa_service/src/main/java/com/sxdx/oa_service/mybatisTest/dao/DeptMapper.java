package com.sxdx.oa_service.mybatisTest.dao;

import com.sxdx.oa_service.mybatisTest.bean.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:43
 */
@Mapper
@Repository
public interface DeptMapper {

    public List<Dept> findAll() ;

    public boolean doCreate(Dept vo) ;
}
