package com.github.springmybatis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springmybatis.model.User;
import com.github.springmybatis.service.UserService;

public class UserServiceTest extends SpringTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest() {
        User user = userService.selectUserById(1);
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }
}
