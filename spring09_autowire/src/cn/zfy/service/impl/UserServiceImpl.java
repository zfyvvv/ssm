package cn.zfy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import cn.zfy.mapper.UserMapper;
import cn.zfy.pojo.User;
import cn.zfy.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Value("${demo.demo}")
	private String test;
	
	private UserMapper userMapper;
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public User Login(User user) {
		System.out.println(test);
		return userMapper.selByName(user);
	}


}
