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
 * 1.����mybatis��ܣ����������ļ���
 * 2.
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ʹ��Ӳ��������mybatis��ܣ�
		//sprig����mybatis ��ӡ����bean����
		/*String[] names=ac.getBeanDefinitionNames();
		for(String str:names) {
			System.out.println(str);
		}
		//����mybatis���
		WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());*/
		
		//ʹ�����������mybatis��ܣ�
		//���������ļ�
		Demo demo = ac.getBean("demo", Demo.class);
		demo.print();
		//ͨ�������ļ�����jdbc
		WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());
	}
}
