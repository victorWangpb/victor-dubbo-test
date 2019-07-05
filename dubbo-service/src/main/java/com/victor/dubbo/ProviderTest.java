package com.victor.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:provider.xml");
        applicationContext.start();
        System.out.println("server is on");
        System.in.read();
    }

}
