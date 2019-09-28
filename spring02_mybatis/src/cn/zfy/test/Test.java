package cn.zfy.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.security.util.Password;
import cn.zfy.demo.Demo;
import cn.zfy.mapper.WorkerMapper;
import cn.zfy.pojo.Worker;
import cn.zfy.service.WorkerService;
import cn.zfy.service.impl.WorkerServiceImpl;
/**
 * 1.整合mybatis框架；整合配置文件；
 * 2.
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//使用硬编码整合mybatis框架；
		//sprig整合mybatis 打印所有bean内容
		/*String[] names=ac.getBeanDefinitionNames();
		for(String str:names) {
			System.out.println(str);
		}
		//整合mybatis框架
		WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());*/
		
		//使用软编码整合mybatis框架；
		//加载属性文件
		Demo demo = ac.getBean("demo", Demo.class);
		demo.print();
		//通过属性文件加载jdbc
		WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());
	}
}
