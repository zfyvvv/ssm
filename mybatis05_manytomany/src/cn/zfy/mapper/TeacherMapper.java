package cn.zfy.mapper;

import java.util.List;

import cn.zfy.pojo.Student;
import cn.zfy.pojo.Teacher;


public interface TeacherMapper {
	//��ѯ������ʦ��
	List<Teacher> selAll();
	
	//manytoone�У�������ѯһ��ѧ���������ʦ���󣻣�
	Teacher selById(int index);
	
	//��ѯ������ʦ���Զ���ѧ�����ϣ�
	List<Teacher> selAllOneToMany();

}
