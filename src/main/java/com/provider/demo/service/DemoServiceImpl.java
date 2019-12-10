package com.provider.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl {

    @Value("${test.info:testInfo}")
    private String testInfo;

    public String hello(String name) {
        String str = "hello " + name + ",testInfo:" + testInfo;
        System.out.println(str);
        return str;
    }

}
