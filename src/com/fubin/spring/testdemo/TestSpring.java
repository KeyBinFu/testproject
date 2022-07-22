package com.fubin.spring.testdemo;

import com.fubin.spring.dao.AspectJ;
import com.fubin.spring.service.SpringAnnotation;
import com.fubin.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testUser(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.f();
    }

    @Test
    public void testUser0(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotation.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.f();
    }

    @Test
    public void testUser1(){

        //JDK动态代理(有接口)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotation.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.acting();
    }

    @Test
    public void testUser2(){

        //CGLIB代理(无接口)
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectj.xml");
        AspectJ aspectJ = context.getBean("aspectJ", AspectJ.class);
        aspectJ.add();
    }

}
