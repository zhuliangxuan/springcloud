package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name:springcloud
 * Package Name:com.example.cloud.controller
 * File Name:HelloController
 * Date:2018/3/1 0001 14:24
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println(instance.getHost()+"============="+instance.getServiceId());
        return "hello world";
    }
}
