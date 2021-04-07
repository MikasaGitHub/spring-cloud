package com.xinshiyun.springcloud.service.impl;

import com.xinshiyun.springcloud.dao.PaymentDao;
import com.xinshiyun.springcloud.entities.Payment;
import com.xinshiyun.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Akira
 * @create: 2021-03-09 14:39
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
