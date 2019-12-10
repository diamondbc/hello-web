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

}
