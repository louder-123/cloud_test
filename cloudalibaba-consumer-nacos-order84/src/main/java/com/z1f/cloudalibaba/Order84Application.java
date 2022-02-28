package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zyf
 * @className Order84Application
 * @date 2022/2/27 16:06
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Order84Application {
    public static void main(String[] args) {
        SpringApplication.run(Order84Application.class, args);
    }
}