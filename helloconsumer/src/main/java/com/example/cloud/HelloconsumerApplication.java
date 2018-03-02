package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//将该应用配置为eureka客户端，用于发现服务
@EnableDiscoveryClient
@SpringBootApplication
public class HelloconsumerApplication {

	//创建RestTemplate实例，开启客户端负载均衡
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloconsumerApplication.class, args);
	}
}
