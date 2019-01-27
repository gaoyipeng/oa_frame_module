package com.sxdx.oa_service.springCacheTest.controller;

import com.sxdx.oa_service.bootTest.bean.JsonResult;
import com.sxdx.oa_service.springCacheTest.model.Department;
import com.sxdx.oa_service.springCacheTest.service.CacheTestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "缓存练习接口",tags = {"缓存练习接口"},description="用于练习spring缓存及redis",hidden = false)
public class CacheTestController {
    @Autowired
    private CacheTestService cacheTestService;

    @ApiOperation(
            value = "通过id查询部门信息",
            notes="通过id查询部门信息")
    @GetMapping(value = "selectDeptById/{id}")
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


    @ApiOperation(value = "修改部门信息", notes="修改部门信息")
    @PostMapping(value = "updateByPrimaryKeySelective")
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


    @ApiOperation(value = "通过id 删除部门", notes="通过id 删除部门")
    @GetMapping (value = "deleteDeptById/{id}")
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
