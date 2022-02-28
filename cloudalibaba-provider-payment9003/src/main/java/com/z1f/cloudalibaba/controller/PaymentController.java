package com.z1f.cloudalibaba.controller;

import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zyf
 * @className PaymentController
 * @date 2022/2/27 15:46
 */
@RestController
public class PaymentController {

    public static HashMap<Integer, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1, new Payment(1, "serial001"));
        hashMap.put(2, new Payment(2, "serial002"));
        hashMap.put(3, new Payment(3, "serial003"));
    }

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Integer id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>("200","success, serverPort: "+serverPort,payment);
        return result;
    }
}