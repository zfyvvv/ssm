package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import  cn.zfy.pojo.People;

public interface PeopleMapper {
	//��ȡȫ������
	List<People> selAll();
	
	//��ȡ�������������ж���
	List<People> selByNameWork(@Param("name") String name,@Param("work") String work);
	
	//�޸�һ������
	int upd(People people);
	
	

}
