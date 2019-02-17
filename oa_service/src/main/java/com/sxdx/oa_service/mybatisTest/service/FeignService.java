package com.sxdx.oa_service.mybatisTest.service;

import com.sxdx.oa_service.mybatisTest.service.fallBack.FeignServiceFallBack;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "OA-CLIENT",fallbackFactory = FeignServiceFallBack.class)
public interface FeignService {
    @GetMapping(value = "/feign/consumer/feignTest")
    String feignTest();
}
