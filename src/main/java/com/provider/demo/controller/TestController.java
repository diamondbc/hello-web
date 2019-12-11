package com.provider.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provider.demo.service.DemoServiceImpl;

@RestController
public class TestController {

    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping("/hello")
    public String demo(String name) {
        return demoService.hello(name);
    }

    @RequestMapping("/hello2")
    public String demo2(String name) {
        return "hello2:" + demoService.hello(name);
    }

    @RequestMapping("/hello3")
    public String demo3(String name) {
        return "hello3:" + demoService.hello(name);
    }

}
