package com.sxdx.oa_service.mybatisTest.controller;

import com.sxdx.oa_service.mybatisTest.bean.Dept;
import com.sxdx.oa_service.mybatisTest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:03
 */
@RestController
public class MybatisController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getDeptList")
    public List<Dept> getDeptList() {
        List<Dept> deptList = this.deptService.getAllDept();
        return deptList;
    }

    /**
     * ribbon 互相调用
     * @return
     */
    @GetMapping(value = "/getOther")
    public String getOther() {
        return restTemplate.getForObject("http://OA-CLIENT"+"/consumer/dept/getOther",String.class);
    }

    @PostMapping(value = "insertDept")
    public int insertDept(@RequestBody Dept dept){
        int num = this.deptService.insertDept(dept);
        return dept.getId();
    }

    /**
     * 返回map，key:字段名称 value:字段值,
     * @return
     */
    @GetMapping(value = "/getDeptMap/{id}")
    public Map<String,Object> getDeptReturnMap(@PathVariable Integer id){
        Map<String,Object> map = this.deptService.getDeptReturnMap(id);
        return map;
    }

    /**
     * 返回map，key:主键(可指定) value:数据记录,
     * @return
     */
    @GetMapping(value = "/getDeptsMap")
    public Map<Integer,Object> getDeptsReturnMap(){
        Map<Integer,Object> map = this.deptService.getDeptsReturnMap();
        return map;
    }
}
