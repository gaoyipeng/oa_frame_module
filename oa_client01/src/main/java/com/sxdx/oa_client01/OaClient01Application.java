package com.sxdx.oa_client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(OaClient01Application.class, args);
    }

}

