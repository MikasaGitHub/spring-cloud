package com.xinshiyun.springcloud.controller;

import com.xinshiyun.springcloud.entities.CommonResult;
import com.xinshiyun.springcloud.entities.Payment;
import com.xinshiyun.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @description:
 * @author: Akira
 * @create: 2021-03-09 14:44
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody  Payment payment) {
        int result = paymentService.create(payment);
        log.info("=====插入结果=====" + result);
        if(result > 0) {
            return new CommonResult(200, "插入数据成功 port" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败 port" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("=====payment=====" + payment);
        if(Objects.nonNull(payment)) {
            return new CommonResult(200, "查询成功 port" + serverPort, payment);
        } else {
            return new CommonResult(444, "查询失败 port" + serverPort, null);
        }
    }

}
