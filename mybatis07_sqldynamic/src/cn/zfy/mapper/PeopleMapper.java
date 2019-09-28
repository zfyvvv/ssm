package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import  cn.zfy.pojo.People;

public interface PeopleMapper {
	//获取全部对象
	List<People> selAll();
	
	//获取符合条件的所有对象
	List<People> selByNameWork(@Param("name") String name,@Param("work") String work);
	
	//修改一个对象；
	int upd(People people);
	
	

}
