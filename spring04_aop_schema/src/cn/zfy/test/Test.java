package cn.zfy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zfy.demo.Demo;
/**
 * 1.demo���ṩ�е㣻advice�ṩ֪ͨ����ȫ�������ļ��н������ã�������ɺ���test���в��ԣ�
 * 2.����schema��ʽ����AOPʵ�ַ�ʽ��
 * 3.�����쳣֪ͨ��ʽ��
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//�е����
		Demo demo = ac.getBean("demo", Demo.class);
		demo.demo();
		
	}
}
