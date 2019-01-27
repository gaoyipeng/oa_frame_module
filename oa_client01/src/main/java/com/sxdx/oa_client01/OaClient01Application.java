package com.sxdx.oa_client01;

import com.sxdx.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@EnableEurekaClient
@SpringBootApplication
//@RibbonClient(name = "OA-SERVICE", configuration = MySelfRule.class)
public class OaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(OaClient01Application.class, args);
    }

}

