package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className DubboCunsumer85
 * @date 2022/2/28 11:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboCunsumer85 {
    public static void main(String[] args) {
        SpringApplication.run(DubboCunsumer85.class, args);
    }
}