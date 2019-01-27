package com.sxdx.oa_service.hessian.controller;


import com.sxdx.oa_service.hessian.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Controller;

@Controller
public class HessianController {

    @Autowired
    private HelloWorldService helloWorldService;

    //发布服务
    @Bean(name = "/HelloWorldService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(helloWorldService);
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }
}
