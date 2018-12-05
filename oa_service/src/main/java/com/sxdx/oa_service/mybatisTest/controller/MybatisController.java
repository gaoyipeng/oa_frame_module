package com.sxdx.oa_service.mybatisTest.controller;

import com.sxdx.oa_service.bootTest.bean.User;
import com.sxdx.oa_service.mybatisTest.bean.Dept;
import com.sxdx.oa_service.mybatisTest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gaoypieng
 * @create 2018-10-28 12:03
 */
@Controller
public class MybatisController {

    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept")
    @ResponseBody
    public List<Dept> gerDeptList() throws Exception {
        return this.deptService.list();
    }

    @PostMapping(value = "/dept")
    @ResponseBody
    public Boolean addDept(@RequestBody Dept dept) throws Exception {
        return this.deptService.add(dept);
    }

}
