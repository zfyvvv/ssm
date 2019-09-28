package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import cn.zfy.pojo.People;

@Repository
public interface PeopleMapper {
	
	//Ôö£»
	@Insert("insert into student values(default,#{name},#{age},#{tid})")
	int insPeo(People people);
	//É¾£»
	@Delete("delete from student where id=#{id}")
	int delPeo(People people);
	//¸Ä
	@Update("update student set name =#{name} where id=#{id}")
	int updPeo(People people);
	//²é
	@Select("select * from people")
	List<People> selAll();
}
