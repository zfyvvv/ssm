package cn.zfy.service.impl;

import java.util.List;

import cn.zfy.mapper.UserMapper;
import cn.zfy.pojo.User;
import cn.zfy.service.UserService;

public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public User Login(User user) {
		return userMapper.selByName(user);
	}


}
