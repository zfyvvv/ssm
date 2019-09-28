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
 * 1.动态SQL；常见的三个动态SQL的用法；
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		
		//动态sql
		PeopleMapper peopleMapper=session.getMapper(PeopleMapper.class);
		
		//检测程序的可用性；
		/*List<People> list=peopleMapper.selAll();
		System.out.println(list.toString());*/
		
		//输入查询的条件；动态SQL；
		Scanner input=new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=input.nextLine();//无论写不写东西，只要点回车，就可以提交
		//String name=input.next();//识别空格和回车；
		System.out.println("请输入工作：");
		String work=input.nextLine();
		//根据查询条件，从数据库中获取数据；没有则为空；
		List<People> list=peopleMapper.selByNameWork(name, work);
		System.out.println(list.toString());
		
		//根据对象，插入对象；动态SQL
		People p4=new People();
		p4.setId(1);
		p4.setName(name);
		p4.setWork(work);
		int index=peopleMapper.upd(p4);
		System.out.println(index);
				
		session.commit();
		session.close();
		System.out.println("程序结束！");
	}
}
