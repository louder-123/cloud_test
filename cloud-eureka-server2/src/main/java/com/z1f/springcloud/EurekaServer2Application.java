package com.z1f.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zyf
 * @className EurekaServer2Application
 * @date 2022/2/22 21:09
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }
}