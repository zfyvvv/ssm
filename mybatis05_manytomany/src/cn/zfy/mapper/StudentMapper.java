package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zfy.pojo.Student;
import cn.zfy.pojo.Teacher;

/**
 * 1.多表联合查询；
 * @author DELL
 *
 */
public interface StudentMapper {
	//查询所有学生；
	List<Student> selAll();
	
	//onetomany中，帮助查询一个老师的学生集合；
	List<Student> selByTid(int tid);
	
	//查询所有学生并自动绑定老师对象；
	List<Student> selAllOneToOne();
	

}
