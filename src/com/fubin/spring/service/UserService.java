package com.fubin.spring.service;

import com.fubin.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;
    private String[] strings;
    private List<String> list;
    private Map<String, String> map;
    private List<UserDao> userDaos;

    public void setUserDaos(List<UserDao> userDaos) {
        this.userDaos = userDaos;
    }


    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void f() {

        System.out.println("UserService f()...");
        System.out.println(userDao.add(1, 2));
        userDao.update();
        System.out.println(userDaos + "\t" + Arrays.toString(strings) + "\t" + list + "\t" + map + "\t" + userDao);
        //System.out.println(userDao);
    }

    public void acting(){

        Class[] interfaces = {UserDao.class};//创建接口实现类代理对象
        System.out.println(UserService.class);//==getClass();
        UserDao userDao1 = (UserDao)Proxy.newProxyInstance(UserService.class.getClassLoader(), interfaces, new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("add前...." + method.getName() + " " + Arrays.toString(args));
                Object res = method.invoke(userDao, args);
                System.out.println("add后..." + userDao);
                return res;
            }
        });
        System.out.println(userDao1.add(1,2));
    }

}
