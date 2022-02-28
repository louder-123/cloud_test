package com.z1f.cloudalibaba.service;

import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zyf
 * @className PaymentService
 * @date 2022/2/27 17:10
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Integer id);
}