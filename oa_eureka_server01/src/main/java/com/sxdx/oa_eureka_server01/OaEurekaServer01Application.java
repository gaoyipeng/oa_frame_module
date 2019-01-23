package com.sxdx.oa_eureka_server01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OaEurekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(OaEurekaServer01Application.class, args);
    }

}

