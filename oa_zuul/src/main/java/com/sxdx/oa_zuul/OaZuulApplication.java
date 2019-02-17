package com.sxdx.oa_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class OaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaZuulApplication.class, args);
    }

}

