package com.fun.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试路由和网关流控 Controller
 */
@RestController
@RequestMapping("/Acme")
public class AcmeController {

    @RequestMapping("/list")
    public String list() {
        return "hello,world";
    }


    @RequestMapping("/list/sentinel")
    public String listsentinel() throws InterruptedException {
        Thread.sleep(500);
        return "hello,sentinel";

    }
    @RequestMapping("/black")
    public String black() {
        return "hello,black";
    }

}
