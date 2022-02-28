package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className OrderApplication
 * @date 2022/2/23 21:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AliOrderApplication.class, args);
    }
}