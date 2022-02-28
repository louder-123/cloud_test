package com.z1f.cloudalibiaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.z1f.springcloud.domain.CommonResult;
import com.z1f.springcloud.domain.Payment;

/**
 * @author zyf
 * @className CustomerBlockHandler
 * @date 2022/2/27 15:21
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult("4444", "按客户自定义，全局异常处理-------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult("4444", "按客户自定义，全局异常处理-------s2");
    }
}