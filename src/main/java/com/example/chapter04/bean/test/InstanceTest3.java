package com.example.chapter04.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
    public static void main(String[] args) {
        String xmlPath = "beans3.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("bean3"));
    }
}
