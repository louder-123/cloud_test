package com.z1f.cloudalibaba.service;

import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zyf
 * @className PaymentFallbackService
 * @date 2022/2/27 17:14
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Integer id) {
        return new CommonResult<>("44444","服务降级返回，---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}