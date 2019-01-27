package com.sxdx.oa_service.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Cloud Ribbon
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //RoundRobinRule();轮询
        //RandomRule() 随机
        //RetryRule();默认轮询，服务宕机，多次访问错误后，不再访问
        return new RandomRule();

    }
}
