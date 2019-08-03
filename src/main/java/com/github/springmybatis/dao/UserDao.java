package com.github.springmybatis.dao;

import org.springframework.stereotype.Repository;

import com.github.springmybatis.model.User;

@Repository
public interface UserDao {

	public User selectUserById(Integer userId);

}