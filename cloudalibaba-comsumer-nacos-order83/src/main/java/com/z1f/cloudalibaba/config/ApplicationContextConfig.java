package com.z1f.cloudalibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyf
 * @className ApplicationContextConfig
 * @date 2022/2/23 21:31
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * nacos结合ribbon做负载均衡，用RestTemplate结合ribbon做负载均衡需要加@LoadBalanced注解
     * @return restTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}