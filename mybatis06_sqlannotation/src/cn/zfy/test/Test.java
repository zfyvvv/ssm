package cn.zfy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.zfy.mapper.StudentMapper;
import cn.zfy.pojo.Student;
/**
 * 1.使用注解；使用简单的查询；
 * 当查询一个对象的时候需要把关联对象查出来，使用一个SQL语句可以查出来时；
 * 也可以使用注解
 * 多表联合查询时，可以使用注解+resultmap,但是会比较麻烦，建议使用xml;	
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		//使用注解查询
		StudentMapper sm=session.getMapper(StudentMapper.class);
		//查询
		List<Student> list=sm.selAll();
		System.out.println(list.toString());	
		session.commit();
		session.close();
	}
}
