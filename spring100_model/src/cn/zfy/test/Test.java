package cn.zfy.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.security.util.Password;
import cn.zfy.demo.Demo;
import cn.zfy.mapper.WorkerMapper;
import cn.zfy.pojo.People;
import cn.zfy.pojo.PeopleFactory;
import cn.zfy.pojo.PeopleFactoryS;
import cn.zfy.pojo.Worker;
import cn.zfy.service.WorkerService;
import cn.zfy.service.impl.WorkerServiceImpl;

public class Test {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得单个对象
		/*People p=ac.getBean("peo", People.class);
		System.out.println(p);*/
		//查看容器ac中所有的对象
		/*String[] names=ac.getBeanDefinitionNames();
		for(String str:names) {
			System.out.println(str);
		}*/
		//通过实例工厂创建对象
		/*PeopleFactory factory=new PeopleFactory();
		People p=factory.newInstance();
		System.out.println(p);*/
		//实例工厂&DI
		/*People p=ac.getBean("peof", People.class);
		System.out.println(p);*/
		//静态工厂
		/*People p=PeopleFactoryS.newInstance();
		System.out.println(p);*/
		//静态工厂&DI
		/*People p2=ac.getBean("peos", People.class);
		System.out.println(p2);*/
		
		//利用bean标签属性给实体类属性赋值
		/*People p=ac.getBean("peo", People.class);
		System.out.println(p);*/
		//sprig整合mybatis 打印所有bean内容
		/*String[] names=ac.getBeanDefinitionNames();
		for(String str:names) {
			System.out.println(str);
		}*/
		//整合mybatis框架
		/*WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());*/
		
		//自动注入
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		People p = ac.getBean("peo", People.class);
		System.out.println(p);*/
		
		//加载属性文件
		/*Demo demo = ac.getBean("demo", Demo.class);
		demo.print();*/
		//通过属性文件加载jdbc
		/*WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());*/
		
		//测试scop属性
		/*Worker worker1 = ac.getBean("worker", Worker.class);
		Worker worker2 = ac.getBean("worker", Worker.class);
		System.out.println(worker1==worker2);*/
		
		//声明式事务
		
		
		
	}
}
