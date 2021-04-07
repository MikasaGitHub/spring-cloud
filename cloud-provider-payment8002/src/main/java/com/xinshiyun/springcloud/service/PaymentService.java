package com.xinshiyun.springcloud.service;

import com.xinshiyun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Akira
 * @create: 2021-03-09 14:39
 **/
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
