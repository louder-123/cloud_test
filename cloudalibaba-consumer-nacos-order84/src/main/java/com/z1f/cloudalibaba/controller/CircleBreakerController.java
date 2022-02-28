package com.z1f.cloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.z1f.cloudalibaba.service.PaymentService;
import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;

/**
 * @author zyf
 * @className CircleBreakerController
 * @date 2022/2/27 16:09
 */
@RestController
public class CircleBreakerController {
    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback")//没有配置，出现运行时异常，前端显示error界面
    //@SentinelResource(value = "fallback", fallback = "handlerFallback")//fallback只负责业务异常
    //@SentinelResource(value = "fallback", blockHandler = "blockHandler")//blockHandler只负责sentinel控制台配置违规
    //@SentinelResource(value = "fallback", blockHandler = "blockHandler", fallback = "handlerFallback")//同时配置业务异常与sentinel阻塞异常
    @SentinelResource(value = "fallback", blockHandler = "blockHandler", fallback = "handlerFallback", exceptionsToIgnore = IllegalArgumentException.class)//exceptionsToIgnore中配置的异常，不会走兜底方法
    public CommonResult<Payment> fallback(@PathVariable Integer id) {
        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class, id);

        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException, 非法参数异常.....");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException,该id没有对应记录，空指针异常....");
        }

        return result;
    }

    //本例是fallback
    public CommonResult<Payment> handlerFallback(@PathVariable Integer id, Throwable e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult<>("444", "兜底异常handlerFallback，exception内容:  " + e.getMessage(), payment);
    }

    //本例是blockHandler
    public CommonResult blockHandler(@PathVariable Integer id, BlockException exception) {
        Payment payment = new Payment(id, "null");
        return new CommonResult<>("445", "blockHandler限流，无此流水：blockException  " + exception.getMessage(), payment);
    }

    //=====================集成openfeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Integer id){
        return paymentService.paymentSQL(id);
    }
}