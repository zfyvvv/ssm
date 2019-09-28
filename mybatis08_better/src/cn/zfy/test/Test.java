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
 * 1.封装；
 * 2.单例模式，factory的创建都比较耗内存，故保证只有一个factory；
 * factory的创建和销毁，是开销很大的过程；
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		//封装
		SqlSession session=MybatisUtil.getSqlSession();
		
		//返回一个List对象；
		List<Flower> list=session.selectList("cn.zfy.mapper.FlowerMapper.selAll");
		for(Flower flower:list) {
			System.out.println(flower.toString());
		}
	}

}
