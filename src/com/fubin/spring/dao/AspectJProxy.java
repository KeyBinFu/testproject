package com.fubin.spring.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJProxy {

    @Pointcut("execution(* com.fubin.spring.dao.AspectJ.add(..))")
    public void pointCut(){}

    @Before("AspectJProxy.pointCut()")
    public void before(){
        System.out.println("增强 add...");
    }

    @Around("AspectJProxy.pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕before...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕after...");
    }

    @After("AspectJProxy.pointCut()")
    public void after(){
        System.out.println("增强after...");
    }
}
