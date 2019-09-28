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

import cn.zfy.mapper.FlowerMapper;
import cn.zfy.pojo.Flower;
/**
 * 1.�ӿڰ󶨷�������mybatis�Ŀ�����
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
					
		FlowerMapper fm=session.getMapper(FlowerMapper.class);
		//����һ��List����
		List<Flower> list=fm.selAll();
		System.out.println(list.toString());
		//����һ������
		int count=fm.countAll();
		System.out.println(count);
		//����ķ���������������
	}
}
