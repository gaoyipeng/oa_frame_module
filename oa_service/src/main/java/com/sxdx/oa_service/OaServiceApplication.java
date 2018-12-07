package com.sxdx.oa_service;

import com.sxdx.oa_core.util.DateUtil;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
public class OaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaServiceApplication.class, args);
        DateUtil.formeDate();
    }
}
