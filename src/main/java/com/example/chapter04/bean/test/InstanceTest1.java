package com.example.chapter04.bean.test;

import com.example.chapter04.bean.bean1.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args) {
        String xmlPath = "beans1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Bean1 bean = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean);
    }
}
