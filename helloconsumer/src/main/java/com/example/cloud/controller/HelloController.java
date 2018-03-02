package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Project Name:springcloud
 * Package Name:com.example.cloud.controller
 * File Name:HelloController
 * Date:2018/3/2 0002 8:54
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){

        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }
}
