package cn.zfy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.zfy.mapper.StudentMapper;
import cn.zfy.mapper.TeacherMapper;
import cn.zfy.pojo.Student;
import cn.zfy.pojo.Teacher;
/**
 * 1.多表联合查询；
 * 对于SQL本身的多表联合查询，使用resultmap时，可以自动分类
 * 对于SQL本身的多表联合查询，只有当关联为一个对象时，使用resultType较方便；
 * 2.两个方法的不同操作，现在改为一个方法的操作；
 * 3.在service层操作绑定的动作；提前至dao层；
 * 
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		
		
		//多表联合查询-在查询结果中实现关联，many to one;
		//为每一个学生绑定一个老师；
		/*StudentMapper sm=session.getMapper(StudentMapper.class);
		TeacherMapper tm=session.getMapper(TeacherMapper.class);
		List<Student> list=sm.selAll();
		// Student [id=2, name=学生2, age=12, tid=1, teacher=null],
		//结果中，老师的属性为空；
		System.out.println(list.toString());
		for(Student stu:list) {
			//根据tm的方法查询老师，老师的id来源于查询出来学生的tid；
			Teacher teacher=tm.selById(stu.getTid());
			//然后再将对应的老师绑定到学生对象的老师属性中；
			stu.setTeacher(teacher);
		}
		//Student [id=2, name=学生2, age=12, tid=1, teacher=Teacher [id=1, name=周老师, list=null]],
		//结果中有老师的对象的属性；
		System.out.println(list.toString());*/
		
		//在service层操作的动作；提前至dao层；
		//以上是使用的两个方法进行查询；可以优化为；
		//使用resultmap中association属性实现多表联合查询中绑定一个对象
		/*StudentMapper sm=session.getMapper(StudentMapper.class);
		List<Student> list=sm.selAllOneToOne();
		System.out.println(list.toString());*/
		
		
		
		
		
		//多表联合查询-在查询结果中实现关联，one to many;
		//为每一个老师绑定一个学生集合,
		/*TeacherMapper tm=session.getMapper(TeacherMapper.class);
		StudentMapper sm=session.getMapper(StudentMapper.class);
		List<Teacher> list2=tm.selAll();
		//[Teacher [id=1, name=周老师, list=null], Teacher [id=2, name=刘老师, list=null]]
		System.out.println(list2.toString());
		for(Teacher tea:list2) {
			//根据tm的方法查询老师，老师的id来源于查询出来学生的tid；
			List<Student> sutList=sm.selByTid(tea.getId());
			//然后再将对应的老师绑定到学生对象的老师属性中；
			tea.setList(sutList);
		}
		//Teacher [id=1, name=周老师, list=[Student [id=2,...
		//结果中有老师的对象的属性；
		System.out.println(list2.toString());*/
		
		//在service层操作的动作；提前至dao层；
		//以上是使用的两个方法进行查询；可以优化为；
		//使用resultmap中collection属性实现多表联合查询中绑定一个集合
		/*TeacherMapper tm=session.getMapper(TeacherMapper.class);
		List<Teacher> list2=tm.selAllOneToMany();
		System.out.println(list2.toString());*/
				
		session.commit();
		session.close();
	}
}
