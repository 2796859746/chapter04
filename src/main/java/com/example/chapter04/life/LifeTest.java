package com.example.chapter04.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
    public static void main(String[] args) {
        String xmlPath = "life.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        context.close();
    }
}
