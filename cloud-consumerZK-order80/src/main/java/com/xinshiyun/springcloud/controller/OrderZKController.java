package com.xinshiyun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Akira
 * @create: 2021-04-15 15:12
 **/

@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderZKController {

    private static final String INVOKE_URL = "http://cloud-provider-service";

    private final RestTemplate restTemplate;

    public OrderZKController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping(value = "/payment/zk")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }

}
