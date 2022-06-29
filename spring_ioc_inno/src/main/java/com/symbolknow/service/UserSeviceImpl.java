package com.symbolknow.service;

import com.symbolknow.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
//<bean id="iduserService" class="com.symbolknow.service.UserSeviceImpl">

@Component("userService")
public class UserSeviceImpl implements UserService {
//      <property name="userDao" ref="userDao"></property>
//   @Autowired
//   @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override

    public void save() {
        System.out.println("saving..");
    }
}
