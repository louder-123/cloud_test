package com.z1f.cloudalibaba.service.impl;

import com.z1f.cloudalibaba.service.ProviderService;
import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zyf
 * @className ProvierServiceImpl
 * @date 2022/2/28 10:39
 */
@DubboService
public class ProvierServiceImpl implements ProviderService {
    /**
     * 获取payment
     *
     * @param id payment主键id
     * @return CommonResult<Payment>
     */
    @Override
    public CommonResult<Payment> getPayment(Integer id) {
        return new CommonResult<>("200","成功获取Payment。paymentId："+id,new Payment(id,"serial"+id));
    }
}