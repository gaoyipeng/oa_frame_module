package com.sxdx.oa_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaClientApplication.class, args);
    }

}

