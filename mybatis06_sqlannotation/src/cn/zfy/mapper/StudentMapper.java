package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zfy.pojo.Student;

public interface StudentMapper {
	
	//Ê¹ÓÃ×¢½â
	@Select("select * from student")
	List<Student> selAll();
	@Insert("insert into student values(default,#{name},#{age},#{tid})")
	int insStudent(Student student);
	@Update("update student set name =#{name} where id=#{id}")
	int updStudent(Student student);
	@Delete("delete from student where id=#{id}")
	int delStudent(Student student);
}
