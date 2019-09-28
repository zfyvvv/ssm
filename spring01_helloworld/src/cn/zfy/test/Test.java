package cn.zfy.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.security.util.Password;
import cn.zfy.pojo.People;
import cn.zfy.pojo.PeopleFactory;
import cn.zfy.pojo.PeopleFactoryS;
import cn.zfy.pojo.Worker;
/**
 * 1.测试springIOC和DI；
 * 2.不同情况先创建对象的方式：普通创建，工厂方法创建，静态工厂创建；
 * 3.DI，依赖注入；
 * 4.自动依赖注入；
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得单个对象
		/*People p1=ac.getBean("peo", People.class);
		System.out.println(p1);
		
		//通过实例工厂创建对象
		PeopleFactory factory=new PeopleFactory();
		People p2=factory.newInstance();
		System.out.println(p2);
		
		//实例工厂&DI
		People p3=ac.getBean("peof", People.class);
		System.out.println(p3);
		//静态工厂
		People p4=PeopleFactoryS.newInstance();
		System.out.println(p4);
		
		//静态工厂&DI
		People p5=ac.getBean("peos", People.class);
		System.out.println(p5);
		
		//查看容器ac中所有的对象
		String[] names2=ac.getBeanDefinitionNames();
		for(String str:names2) {
			System.out.println(str);
		}*/
		
		//利用bean标签属性给实体类属性赋值
		//当对象中需要注入另外一个对象时，使用该种方式测试；
		/*People p6=ac.getBean("peod", People.class);
		System.out.println(p6);*/
		
		//自动注入，byName;
		//但是默认的属性都是null；
		People p7=ac.getBean("peoz", People.class);
		System.out.println(p7);
		
	}
}
