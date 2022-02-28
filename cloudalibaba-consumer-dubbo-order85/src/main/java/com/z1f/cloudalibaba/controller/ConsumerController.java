package com.z1f.cloudalibaba.controller;

import com.z1f.cloudalibaba.service.ProviderService;
import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyf
 * @className ConsumerController
 * @date 2022/2/28 11:08
 */
@RestController
public class ConsumerController {

    @DubboReference
    ProviderService providerService;

    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Integer id) {
        return providerService.getPayment(id);
    }
}