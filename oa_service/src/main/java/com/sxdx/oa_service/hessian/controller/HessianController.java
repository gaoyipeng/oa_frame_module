package com.sxdx.oa_service.hessian.controller;

import com.sxdx.oa_service.bootTest.service.UserService;
import com.sxdx.oa_service.hessian.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HessianController {
//    @Autowired
//    HelloWorldService helloWorldService;
    @Autowired
    UserService userService;
//   @Bean
//    public HessianProxyFactoryBean helloClient() {
//        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
//        factory.setServiceUrl("http://127.0.0.1:8301/car/HelloWorldService");
//        factory.setServiceInterface(HelloWorldService.class);
//        return factory;
//    }
//
//
//    @RequestMapping("/test")
//    @ResponseBody
//    public String test() {
////        return helloWorldService.sayHello("Spring boot with Hessian.");
//        return "";
//    }
}
