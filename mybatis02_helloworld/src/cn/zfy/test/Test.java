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
 * 1.mybatis实现数据库简单连接，
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
		
		//返回一个List对象；
/*		List<Flower> list=session.selectList("cn.zfy.mapper.FlowerMapper.selAll");
		for(Flower flower:list) {
			System.out.println(flower.toString());
		}*/
		
		//返回一个对象
/*		int count=session.selectOne("cn.zfy.mapper.FlowerMapper.selById");
		System.out.println(count);*/
		
		//返回一个集合；
		//yinhua=Flower [id=5, name=yinhua, price=20, produce=japan]？
		//map的tostring()是 value=key？
/*		Map<Object, Object> map=session.selectMap("cn.zfy.mapper.FlowerMapper.selMapByName", "name");
		System.out.println(map);
		session.close();*/
	}

}
