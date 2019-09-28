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
 * 1.测试log4j的简单应用；
 * 2.设置配置文件，达到自己想要的结果；
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		//把配置文件读取成流；
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		//使用工厂设计模式
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		//生产SqlSession，
		SqlSession session=factory.openSession();
		//session的三种常用查询方式！
		

	}

}
