package com.xinshiyun.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Akira
 * @create: 2021-04-21 11:36
 **/
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();// 定义为随机
    }
 }
