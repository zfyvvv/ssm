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
 * 1.����log4j�ļ�Ӧ�ã�
 * 2.���������ļ����ﵽ�Լ���Ҫ�Ľ����
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
		

	}

}
