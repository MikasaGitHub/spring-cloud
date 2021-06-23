package com.xinshiyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: Akira
 * @create: 2021-06-03 14:43
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignHystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrix80.class,args);
    }
}
