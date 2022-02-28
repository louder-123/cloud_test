package com.z1f.springcloud.controller;

import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import com.z1f.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zyf
 * @date 2022/2/19 11:52
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/createPayment")
    public CommonResult<?> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：{}", result);
        if (result > 0) {
            return new CommonResult("200", "插入成功", result);
        }
        return new CommonResult("500", "插入失败");
    }


    @GetMapping("/getPayment/{id}")
    public CommonResult<?> getPayment(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getPayment(id);
        if (null != payment) {
            return new CommonResult<>("200", "查询成功", payment);
        }
        return new CommonResult("500", "查询失败,没有对应记录");
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getPayment(id);
        if (payment != null) {
            return new CommonResult<>("200", "查询成功，serverPort： " + serverPort, payment);
        } else {
            return new CommonResult<>("444", "没有对应记录，查询ID： " + id, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}