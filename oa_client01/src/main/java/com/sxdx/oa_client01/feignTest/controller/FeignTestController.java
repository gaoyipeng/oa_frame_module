package com.sxdx.oa_client01.feignTest.controller;

import com.sxdx.oa_client01.feignTest.service.DeptService;
import com.sxdx.oa_client01.ribbonTest.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignTestController {
    @Autowired
    private DeptService deptService;


    @GetMapping(value = "/feign/consumer/dept/get/{id}")
    public Dept getDeptMap(@PathVariable("id") Integer id){
        return deptService.getDeptMap(id);
    }

    @GetMapping(value = "/feign/consumer/dept/list")
    public List<Dept> getDeptList(){
        return deptService.getDeptList();
    }

    @GetMapping(value = "/feign/consumer/feignTest")
    public String feignTest(){
        return "feign：service调client成功";
    }
}
