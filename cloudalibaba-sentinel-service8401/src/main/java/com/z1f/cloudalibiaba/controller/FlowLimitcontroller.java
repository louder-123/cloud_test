package com.z1f.cloudalibiaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 使用Sentinel做流量控制
 *
 * @author zyf
 * @className FlowLimitcontroller
 * @date 2022/2/25 7:43
 */
@RestController
public class FlowLimitcontroller {

    @GetMapping("/testA")
    public String testA() {
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "====testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "====testB";
    }

    @GetMapping("/testC")
    public String testC() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("testC 测试RT");
        return "====testC";
    }


    /**
     * sentinel热点数据测试+自定义兜底方法练习
     * 热点限流一定要加@SentinelResource 且指定value和blockHandler，有两个作用：
     * 1.指定资源名称。用路径作为资源，热点规则不能正常生效。
     * 2.自定义兜底方法。自定义兜底方法一定要加blockHandler属性，不然异常会暴露到前端页面，而不是显示sentinel默认的异常页
     *  2.1自定义兜底方法不会处理代码本身的异常，不会影响运行时异常
     *
     * @param p1 参数，用来做热点数据
     * @param p2 参数，用来做热点数据
     * @return "=======testHotKey"
     */
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value="p1", required = false) String p1,@RequestParam(value = "p2",required = false) String p2){
        return "=======testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "=======deal_testHotKey: blocked";

    }
}