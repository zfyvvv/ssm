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
 * 1.������ϲ�ѯ��
 * ����SQL����Ķ�����ϲ�ѯ��ʹ��resultmapʱ�������Զ�����
 * ����SQL����Ķ�����ϲ�ѯ��ֻ�е�����Ϊһ������ʱ��ʹ��resultType�Ϸ��㣻
 * 2.���������Ĳ�ͬ���������ڸ�Ϊһ�������Ĳ�����
 * 3.��service������󶨵Ķ�������ǰ��dao�㣻
 * 
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		
		
		//������ϲ�ѯ-�ڲ�ѯ�����ʵ�ֹ�����many to one;
		//Ϊÿһ��ѧ����һ����ʦ��
		/*StudentMapper sm=session.getMapper(StudentMapper.class);
		TeacherMapper tm=session.getMapper(TeacherMapper.class);
		List<Student> list=sm.selAll();
		// Student [id=2, name=ѧ��2, age=12, tid=1, teacher=null],
		//����У���ʦ������Ϊ�գ�
		System.out.println(list.toString());
		for(Student stu:list) {
			//����tm�ķ�����ѯ��ʦ����ʦ��id��Դ�ڲ�ѯ����ѧ����tid��
			Teacher teacher=tm.selById(stu.getTid());
			//Ȼ���ٽ���Ӧ����ʦ�󶨵�ѧ���������ʦ�����У�
			stu.setTeacher(teacher);
		}
		//Student [id=2, name=ѧ��2, age=12, tid=1, teacher=Teacher [id=1, name=����ʦ, list=null]],
		//���������ʦ�Ķ�������ԣ�
		System.out.println(list.toString());*/
		
		//��service������Ķ�������ǰ��dao�㣻
		//������ʹ�õ������������в�ѯ�������Ż�Ϊ��
		//ʹ��resultmap��association����ʵ�ֶ�����ϲ�ѯ�а�һ������
		/*StudentMapper sm=session.getMapper(StudentMapper.class);
		List<Student> list=sm.selAllOneToOne();
		System.out.println(list.toString());*/
		
		
		
		
		
		//������ϲ�ѯ-�ڲ�ѯ�����ʵ�ֹ�����one to many;
		//Ϊÿһ����ʦ��һ��ѧ������,
		/*TeacherMapper tm=session.getMapper(TeacherMapper.class);
		StudentMapper sm=session.getMapper(StudentMapper.class);
		List<Teacher> list2=tm.selAll();
		//[Teacher [id=1, name=����ʦ, list=null], Teacher [id=2, name=����ʦ, list=null]]
		System.out.println(list2.toString());
		for(Teacher tea:list2) {
			//����tm�ķ�����ѯ��ʦ����ʦ��id��Դ�ڲ�ѯ����ѧ����tid��
			List<Student> sutList=sm.selByTid(tea.getId());
			//Ȼ���ٽ���Ӧ����ʦ�󶨵�ѧ���������ʦ�����У�
			tea.setList(sutList);
		}
		//Teacher [id=1, name=����ʦ, list=[Student [id=2,...
		//���������ʦ�Ķ�������ԣ�
		System.out.println(list2.toString());*/
		
		//��service������Ķ�������ǰ��dao�㣻
		//������ʹ�õ������������в�ѯ�������Ż�Ϊ��
		//ʹ��resultmap��collection����ʵ�ֶ�����ϲ�ѯ�а�һ������
		/*TeacherMapper tm=session.getMapper(TeacherMapper.class);
		List<Teacher> list2=tm.selAllOneToMany();
		System.out.println(list2.toString());*/
				
		session.commit();
		session.close();
	}
}
