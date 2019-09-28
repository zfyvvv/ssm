package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import cn.zfy.pojo.People;


public interface PeopleMapper {
	
	//Ôö£»
	int insPeo(People people);
	//É¾£»
	int delPeo(People people);
	//¸Ä
	int updPeo(People people);
	//²é
	List<People> selAll();
}
