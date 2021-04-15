package com.xinshiyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: Akira
 * @create: 2021-04-15 15:08
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication80.class,args);
    }
}
