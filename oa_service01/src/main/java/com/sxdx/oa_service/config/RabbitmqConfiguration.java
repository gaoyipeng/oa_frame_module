package com.sxdx.oa_service.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaoypieng
 * @create 2018-11-18 11:09
 * Rabbitmq 序列化器
 */

@Configuration
public class RabbitmqConfiguration {

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
