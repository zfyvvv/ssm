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
import cn.zfy.util.MybatisUtil;

/**
 * 1.��װ��
 * 2.����ģʽ��factory�Ĵ������ȽϺ��ڴ棬�ʱ�ֻ֤��һ��factory��
 * factory�Ĵ��������٣��ǿ����ܴ�Ĺ��̣�
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		//��װ
		SqlSession session=MybatisUtil.getSqlSession();
		
		//����һ��List����
		List<Flower> list=session.selectList("cn.zfy.mapper.FlowerMapper.selAll");
		for(Flower flower:list) {
			System.out.println(flower.toString());
		}
	}

}
