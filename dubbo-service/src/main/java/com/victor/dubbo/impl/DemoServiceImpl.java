package com.victor.dubbo.impl;

import com.victor.dubbo.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String getFirstRequest() {
        System.out.println("I am coming.....");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "first request";
    }

    @Override
    public String getSecondRequest() {
        return "second request";
    }
}
