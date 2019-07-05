package com.victor.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:consumer.xml");
        applicationContext.start();
        DemoService demoService=(DemoService) applicationContext.getBean("demoService");
        System.out.println(demoService.getSecondRequest());
    }

}
