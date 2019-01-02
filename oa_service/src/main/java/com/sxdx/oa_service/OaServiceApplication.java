package com.sxdx.oa_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableEurekaClient
public class OaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaServiceApplication.class, args);
    }


}
