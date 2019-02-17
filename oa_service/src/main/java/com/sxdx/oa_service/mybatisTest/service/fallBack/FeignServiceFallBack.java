package com.sxdx.oa_service.mybatisTest.service.fallBack;

import com.sxdx.oa_service.mybatisTest.service.FeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallBack implements FallbackFactory<FeignService> {

    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public String feignTest() {
                return "55555";
            }
        };
    }
}
