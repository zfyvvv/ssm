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
 * 1.ʹ��ע�⣻ʹ�ü򵥵Ĳ�ѯ��
 * ����ѯһ�������ʱ����Ҫ�ѹ�������������ʹ��һ��SQL�����Բ����ʱ��
 * Ҳ����ʹ��ע��
 * ������ϲ�ѯʱ������ʹ��ע��+resultmap,���ǻ�Ƚ��鷳������ʹ��xml;	
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		//ʹ��ע���ѯ
		StudentMapper sm=session.getMapper(StudentMapper.class);
		//��ѯ
		List<Student> list=sm.selAll();
		System.out.println(list.toString());	
		session.commit();
		session.close();
	}
}
