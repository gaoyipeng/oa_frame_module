package com.sxdx.oa_client02.RibbonTest.controller;

import com.sxdx.oa_client02.RibbonTest.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Ribbon restTemplate demo
 */
@RestController
public class RibbonTestController {
    //private static final String REST_URL_PREFIX = "http://localhost:8080";
    private static final String REST_URL_PREFIX = "http://OA-SERVICE";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,ResponseBean.class)
     * 这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> add()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/getDeptList", List.class);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/getDeptMap/" + id, Dept.class);
    }

    @GetMapping(value = "/consumer/dept/getOther")
    public String getOther()
    {
        return "success02";
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    /*@RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }*/
}
