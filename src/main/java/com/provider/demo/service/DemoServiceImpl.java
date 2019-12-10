package com.provider.demo.service;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl {

    @Value("${test.info}")
    private String testInfo;

    public String hello(String name) {
        String str = "hello " + name + ",testInfo:" + testInfo;
        System.out.println(str);
        return str;
    }

    public void received(String data) {
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(data));
        } catch (IOException e) {
            e.printStackTrace();
        }
        testInfo = properties.getProperty("test.info");
    }
}
