package cn.zfy.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	//factory的创建都比较耗内存，故保证只有一个factory；
	private static SqlSessionFactory factory;
	private static ThreadLocal<SqlSession> tl=new ThreadLocal<>();
	static {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取SqlSession,并且保证是同一个；
	 * @return
	 */
	public static SqlSession getSqlSession() {
		SqlSession session=tl.get();
		if (session==null) {
			tl.set(factory.openSession());
		}
		return tl.get();
	}
	/**
	 * 提交并关闭session
	 */
	public static void closeSession() {
		SqlSession session=tl.get();
		if(session!=null) {
			session.close();
		}
		tl.set(null);
	}
	
}
