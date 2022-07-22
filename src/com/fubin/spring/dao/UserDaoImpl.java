package com.fubin.spring.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Value("c++")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public int add(int number1, int number2){
        System.out.println("add本体方法执行了...");
        return number1 + number2;
    }

    @Override
    public void update() {
        System.out.println("UserDaoImpl update....");
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
