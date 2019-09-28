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
 * 1.����springIOC��DI��
 * 2.��ͬ����ȴ�������ķ�ʽ����ͨ����������������������̬����������
 * 3.DI������ע�룻
 * 4.�Զ�����ע�룻
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��õ�������
		/*People p1=ac.getBean("peo", People.class);
		System.out.println(p1);
		
		//ͨ��ʵ��������������
		PeopleFactory factory=new PeopleFactory();
		People p2=factory.newInstance();
		System.out.println(p2);
		
		//ʵ������&DI
		People p3=ac.getBean("peof", People.class);
		System.out.println(p3);
		//��̬����
		People p4=PeopleFactoryS.newInstance();
		System.out.println(p4);
		
		//��̬����&DI
		People p5=ac.getBean("peos", People.class);
		System.out.println(p5);
		
		//�鿴����ac�����еĶ���
		String[] names2=ac.getBeanDefinitionNames();
		for(String str:names2) {
			System.out.println(str);
		}*/
		
		//����bean��ǩ���Ը�ʵ�������Ը�ֵ
		//����������Ҫע������һ������ʱ��ʹ�ø��ַ�ʽ���ԣ�
		/*People p6=ac.getBean("peod", People.class);
		System.out.println(p6);*/
		
		//�Զ�ע�룬byName;
		//����Ĭ�ϵ����Զ���null��
		People p7=ac.getBean("peoz", People.class);
		System.out.println(p7);
		
	}
}
