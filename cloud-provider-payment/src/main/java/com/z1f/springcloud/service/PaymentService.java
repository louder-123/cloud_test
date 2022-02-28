package com.z1f.springcloud.service;

import com.z1f.springcloud.domain.Payment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
* @author admin
* @description 针对表【payment】的数据库操作Service
* @createDate 2022-02-19 11:21:53
*/
public interface PaymentService extends IService<Payment> {

    int create(Payment payment);

    Payment getPayment( Integer id);
}
