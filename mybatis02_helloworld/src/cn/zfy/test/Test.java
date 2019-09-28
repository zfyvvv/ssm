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
 * 1.mybatisʵ�����ݿ�����ӣ�
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		//�������ļ���ȡ������
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		//ʹ�ù������ģʽ
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		//����SqlSession��
		SqlSession session=factory.openSession();
		//session�����ֳ��ò�ѯ��ʽ��
		
		//����һ��List����
/*		List<Flower> list=session.selectList("cn.zfy.mapper.FlowerMapper.selAll");
		for(Flower flower:list) {
			System.out.println(flower.toString());
		}*/
		
		//����һ������
/*		int count=session.selectOne("cn.zfy.mapper.FlowerMapper.selById");
		System.out.println(count);*/
		
		//����һ�����ϣ�
		//yinhua=Flower [id=5, name=yinhua, price=20, produce=japan]��
		//map��tostring()�� value=key��
/*		Map<Object, Object> map=session.selectMap("cn.zfy.mapper.FlowerMapper.selMapByName", "name");
		System.out.println(map);
		session.close();*/
	}

}
