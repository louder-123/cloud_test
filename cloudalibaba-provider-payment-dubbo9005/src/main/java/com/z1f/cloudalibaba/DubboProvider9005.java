package com.z1f.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className DubboProvider9005
 * @date 2022/2/28 10:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboProvider9005 {
    public static void main(String[] args) {
        SpringApplication.run(DubboProvider9005.class, args);
    }
}