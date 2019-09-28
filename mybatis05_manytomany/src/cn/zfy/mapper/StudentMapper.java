package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zfy.pojo.Student;
import cn.zfy.pojo.Teacher;

/**
 * 1.������ϲ�ѯ��
 * @author DELL
 *
 */
public interface StudentMapper {
	//��ѯ����ѧ����
	List<Student> selAll();
	
	//onetomany�У�������ѯһ����ʦ��ѧ�����ϣ�
	List<Student> selByTid(int tid);
	
	//��ѯ����ѧ�����Զ�����ʦ����
	List<Student> selAllOneToOne();
	

}
