package com.sxdx.oa_service.mybatisTest.controller;

import com.sxdx.oa_service.mybatisTest.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/service/feignTest")
    public String feignTest() {
        return feignService.feignTest();
    }
}
