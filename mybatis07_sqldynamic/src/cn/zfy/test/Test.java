package  cn.zfy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import cn.zfy.mapper.PeopleMapper;
import cn.zfy.pojo.People;

/**
 * 1.��̬SQL��������������̬SQL���÷���
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		
		//��̬sql
		PeopleMapper peopleMapper=session.getMapper(PeopleMapper.class);
		
		//������Ŀ����ԣ�
		/*List<People> list=peopleMapper.selAll();
		System.out.println(list.toString());*/
		
		//�����ѯ����������̬SQL��
		Scanner input=new Scanner(System.in);
		System.out.println("������������");
		String name=input.nextLine();//����д��д������ֻҪ��س����Ϳ����ύ
		//String name=input.next();//ʶ��ո�ͻس���
		System.out.println("�����빤����");
		String work=input.nextLine();
		//���ݲ�ѯ�����������ݿ��л�ȡ���ݣ�û����Ϊ�գ�
		List<People> list=peopleMapper.selByNameWork(name, work);
		System.out.println(list.toString());
		
		//���ݶ��󣬲�����󣻶�̬SQL
		People p4=new People();
		p4.setId(1);
		p4.setName(name);
		p4.setWork(work);
		int index=peopleMapper.upd(p4);
		System.out.println(index);
				
		session.commit();
		session.close();
		System.out.println("���������");
	}
}
