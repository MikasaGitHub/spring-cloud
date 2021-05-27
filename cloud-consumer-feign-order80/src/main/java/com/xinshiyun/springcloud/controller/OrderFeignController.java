package com.xinshiyun.springcloud.controller;

import com.xinshiyun.springcloud.entities.CommonResult;
import com.xinshiyun.springcloud.entities.Payment;
import com.xinshiyun.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Akira
 * @create: 2021-04-25 20:18
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/timeout")
    String  paymentTimeout() {
        // 默认等待一秒钟
        return paymentFeignService.paymentTimeout();
    }
}
