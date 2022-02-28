package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @date 2022/2/23 21:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliPaymentApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(AliPaymentApplication2.class, args);
    }
}