package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zfy.pojo.People;

public interface PeopleMapper {
	//获取全部对象
	List<People> selAll();
	//获取某一个特定ID和NAME的对象
	People selByIdName(int id,String name);
	//获取某一个特定NAME和WORK的对象
	People selOneByNameWork(@Param("name") String name,@Param("work") String work);
	//获取符合条件的所有对象
	List<People> selByNameWork(@Param("name") String name,@Param("work") String work);
	
	int upd(People people);
	
	

}
