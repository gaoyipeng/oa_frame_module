package com.sxdx.oa_service.mybatisTest.controller;

import com.sxdx.oa_service.bootTest.bean.User;
import com.sxdx.oa_service.mybatisTest.bean.Dept;
import com.sxdx.oa_service.mybatisTest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:03
 */
@Controller
public class MybatisController {
    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/getDeptList")
    @ResponseBody
    public List<Dept> getDeptList() {
        List<Dept> deptList = this.deptService.getAllDept();
        return deptList;
    }

    @PostMapping(value = "insertDept")
    @ResponseBody
    public int insertDept(@RequestBody Dept dept){
        int num = this.deptService.insertDept(dept);
        return dept.getId();
    }

    /**
     * 返回map，key:字段名称 value:字段值,
     * @return
     */
    @GetMapping(value = "/getDeptMap/{id}")
    @ResponseBody
    public Map<String,Object> getDeptReturnMap(@PathVariable Integer id){
        Map<String,Object> map = this.deptService.getDeptReturnMap(id);
        return map;
    }

    /**
     * 返回map，key:主键(可指定) value:数据记录,
     * @return
     */
    @GetMapping(value = "/getDeptsMap")
    @ResponseBody
    public Map<Integer,Object> getDeptsReturnMap(){
        Map<Integer,Object> map = this.deptService.getDeptsReturnMap();
        return map;
    }
}
