package com.z1f.cloudalibaba.service;

import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;

/**
 * @author zyf
 * @className ProviderService
 * @date 2022/2/28 10:36
 */
public interface ProviderService {
    /**
     * 获取payment
     *
     * @param id payment主键id
     * @return CommonResult<Payment>
     */
    CommonResult<Payment> getPayment(Integer id);
}