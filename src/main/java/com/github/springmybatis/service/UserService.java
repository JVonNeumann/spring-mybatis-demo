package com.github.springmybatis.service;

import com.github.springmybatis.model.User;

public interface UserService {
	User selectUserById(Integer userId);
}
