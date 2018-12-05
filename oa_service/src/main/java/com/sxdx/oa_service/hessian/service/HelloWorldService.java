package com.sxdx.oa_service.hessian.service;

import org.springframework.stereotype.Service;

@Service
public interface HelloWorldService {
    String sayHello(String name);
}
