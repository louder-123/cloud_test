package com.z1f.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zyf
 * @className PaymentApplicaiton
 * @date 2022/2/19 11:08
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.z1f.springcloud.mapper")
public class PaymentApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicaiton.class, args);
    }
}