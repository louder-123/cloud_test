package com.z1f.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.z1f.springcloud.domain.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @description 针对表【payment】的数据库操作Mapper
 * @createDate 2022-02-19 11:21:53
 * @Entity com.z1f.springcloud.domain.Payment
 */
@Repository
public interface PaymentMapper extends BaseMapper<Payment> {

    int create(Payment payment);

    Payment getPayment(@Param("id") Integer id);

}




