package com.sxdx.oa_service.springCacheTest.controller;

import com.sxdx.oa_service.bootTest.bean.JsonResult;
import com.sxdx.oa_service.springCacheTest.model.Department;
import com.sxdx.oa_service.springCacheTest.service.CacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CacheTestController {
    @Autowired
    private CacheTestService cacheTestService;

    /**
     * 通过id查询部门信息
     * @param id
     * @return
     */
    @GetMapping(value = "selectDeptById/{id}")
    @ResponseBody
    public ResponseEntity<JsonResult> selectByPrimaryKey(@PathVariable Integer id){
        JsonResult r = new JsonResult();
        try {
            Department department = cacheTestService.selectByPrimaryKey(id);
            r.setResult(department);
            r.setStatus("success");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("failure");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 修改部门信息
     * @param dept
     * @return
     */
    @PostMapping(value = "updateByPrimaryKeySelective")
    @ResponseBody
    public ResponseEntity<JsonResult> updateByPrimaryKeySelective(@RequestBody Department dept){
        JsonResult r = new JsonResult();
        try {
            Department department = cacheTestService.updateByPrimaryKeySelective(dept);
            r.setResult(department);
            r.setStatus("success");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("failure");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 通过id 删除部门
     * @param id
     * @return
     */
    @GetMapping (value = "deleteDeptById/{id}")
    @ResponseBody
    public ResponseEntity<JsonResult> updateByPrimaryKeySelective(@PathVariable Integer id){
        JsonResult r = new JsonResult();
        try {
            int num = cacheTestService.deleteByPrimaryKey(id);
            r.setResult("已删除");
            r.setStatus("success");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("failure");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }



}
