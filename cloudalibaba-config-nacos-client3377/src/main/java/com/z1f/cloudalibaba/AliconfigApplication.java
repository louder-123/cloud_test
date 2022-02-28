package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className AliconfigApplication
 * @date 2022/2/23 22:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliconfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(AliconfigApplication.class, args);
    }
}