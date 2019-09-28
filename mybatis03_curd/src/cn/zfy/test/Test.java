package cn.zfy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.zfy.pojo.Flower;
/**
 * 1.mybatisʵ��CURD������
 * 2.�����������룻
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		
		//����һ�����ϣ�
		//yinhua=Flower [id=5, name=yinhua, price=20, produce=japan]��
		//map��tostring()�� value=key��
/*		Map<Object, Object> map=session.selectMap("cn.zfy.mapper.FlowerMapper.selMapByName", "name");
		System.out.println(map);
		session.close();*/
		
		//���ݿ�������һ�����ݣ�
		/*Flower f=new Flower();
		f.setName("hehua");
		f.setPrice(26);
		f.setProduce("china");
		int count=session.insert("cn.zfy.mapper.FlowerMapper.insByOne", f);
		System.out.println(count);
		session.commit();
		session.close();*/
		
		//ɾ��ָ�����ݣ�
/*		int count=session.delete("cn.zfy.mapper.FlowerMapper.delById", 3);
		System.out.println(count);
		session.commit();
		session.close();*/
		
		//�޸�ָ�����ݣ�
/*		int count=session.delete("cn.zfy.mapper.FlowerMapper.updByName", "lanhua");
		System.out.println(count);
		session.commit();
		session.close();*/
	}

}
