package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zfy.pojo.People;

public interface PeopleMapper {
	//��ȡȫ������
	List<People> selAll();
	//��ȡĳһ���ض�ID��NAME�Ķ���
	People selByIdName(int id,String name);
	//��ȡĳһ���ض�NAME��WORK�Ķ���
	People selOneByNameWork(@Param("name") String name,@Param("work") String work);
	//��ȡ�������������ж���
	List<People> selByNameWork(@Param("name") String name,@Param("work") String work);
	
	int upd(People people);
	
	

}
