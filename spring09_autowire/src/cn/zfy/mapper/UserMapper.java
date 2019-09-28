package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.zfy.pojo.User;

public interface UserMapper {
	User selByName(User user);
	
}
