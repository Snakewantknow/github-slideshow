package com.symbolknow.web;

import com.symbolknow.config.SpringConfiguration;
import com.symbolknow.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = app.getBean(UserService.class);
//        userService.save();

        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.save();
    }
}
