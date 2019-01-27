package com.sxdx.oa_service.hessian.service.impl;

import com.sxdx.oa_service.hessian.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello World! " + name;
    }
}