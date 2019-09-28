package cn.zfy.mapper;

import java.util.List;

import cn.zfy.pojo.Student;
import cn.zfy.pojo.Teacher;


public interface TeacherMapper {
	//查询所有老师；
	List<Teacher> selAll();
	
	//manytoone中，帮助查询一个学生对象的老师对象；；
	Teacher selById(int index);
	
	//查询所有老师并自动绑定学生集合；
	List<Teacher> selAllOneToMany();

}
