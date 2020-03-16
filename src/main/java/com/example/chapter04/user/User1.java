package com.example.chapter04.user;

import java.util.List;

public class User1 {
    private String username;
    private Integer password;
    private List<String> list;
//1。使用构造注入
    //1.1提供带所有参数的参构造方法

    public User1(String username, Integer password, List<String> list) {
        super();
        this.username = username;
        this.password = password;
        this.list = list;
    }
    //2.使用设值注入
    //2.1提供默认空参构造
    //2.2为所有路径提供setter方法


    public User1() {
        super();

    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(Integer password) {
        this.password = password;
    }


    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
