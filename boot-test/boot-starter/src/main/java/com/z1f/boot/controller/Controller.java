package com.z1f.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyf
 * @date 2022/3/2 15:37
 */
@RestController
@RequestMapping("/controller")
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}