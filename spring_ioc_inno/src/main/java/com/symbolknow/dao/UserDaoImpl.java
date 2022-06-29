package com.symbolknow.dao;

import com.symbolknow.dao.UserDao;
import org.springframework.stereotype.Component;
//<bean id="userDao" class="com.symbolknow.impl.UserDaoImpl"></bean>
@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("saving....");
    }
}
