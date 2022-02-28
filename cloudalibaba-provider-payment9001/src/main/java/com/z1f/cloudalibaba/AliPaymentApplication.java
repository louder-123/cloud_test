package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className AliPaymentApplication
 * @date 2022/2/23 21:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(AliPaymentApplication.class, args);
    }
}