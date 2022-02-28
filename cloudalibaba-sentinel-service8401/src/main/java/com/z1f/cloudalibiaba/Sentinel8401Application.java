package com.z1f.cloudalibiaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className Sentinel8401Application
 * @date 2022/2/25 7:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Sentinel8401Application {
    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401Application.class, args);
    }
}