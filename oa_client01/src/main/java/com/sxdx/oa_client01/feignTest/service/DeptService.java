package com.sxdx.oa_client01.feignTest.service;


import com.sxdx.oa_client01.feignTest.service.fallBack.DeptServiceFallBack;
import com.sxdx.oa_client01.ribbonTest.bean.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


/**
 * @author gaoypieng
 * @create 2018-10-28 12:44
 */
@FeignClient(value = "OA-SERVICE",fallbackFactory = DeptServiceFallBack.class)
public interface DeptService {

    @GetMapping(value = "/getDeptMap/{id}")
    Dept getDeptMap(@PathVariable("id") Integer id);

    @GetMapping(value = "/getDeptList")
    List<Dept> getDeptList();
}
