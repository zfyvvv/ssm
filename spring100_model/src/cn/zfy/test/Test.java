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
		//��õ�������
		/*People p=ac.getBean("peo", People.class);
		System.out.println(p);*/
		//�鿴����ac�����еĶ���
		/*String[] names=ac.getBeanDefinitionNames();
		for(String str:names) {
			System.out.println(str);
		}*/
		//ͨ��ʵ��������������
		/*PeopleFactory factory=new PeopleFactory();
		People p=factory.newInstance();
		System.out.println(p);*/
		//ʵ������&DI
		/*People p=ac.getBean("peof", People.class);
		System.out.println(p);*/
		//��̬����
		/*People p=PeopleFactoryS.newInstance();
		System.out.println(p);*/
		//��̬����&DI
		/*People p2=ac.getBean("peos", People.class);
		System.out.println(p2);*/
		
		//����bean��ǩ���Ը�ʵ�������Ը�ֵ
		/*People p=ac.getBean("peo", People.class);
		System.out.println(p);*/
		//sprig����mybatis ��ӡ����bean����
		/*String[] names=ac.getBeanDefinitionNames();
		for(String str:names) {
			System.out.println(str);
		}*/
		//����mybatis���
		/*WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());*/
		
		//�Զ�ע��
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		People p = ac.getBean("peo", People.class);
		System.out.println(p);*/
		
		//���������ļ�
		/*Demo demo = ac.getBean("demo", Demo.class);
		demo.print();*/
		//ͨ�������ļ�����jdbc
		/*WorkerService bean = ac.getBean("workerService", WorkerServiceImpl.class);
		List<Worker> list = bean.show();
		System.out.println(list.toString());*/
		
		//����scop����
		/*Worker worker1 = ac.getBean("worker", Worker.class);
		Worker worker2 = ac.getBean("worker", Worker.class);
		System.out.println(worker1==worker2);*/
		
		//����ʽ����
		
		
		
	}
}
