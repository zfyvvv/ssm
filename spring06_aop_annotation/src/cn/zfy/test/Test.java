package cn.zfy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zfy.demo.Demo;
/**
 * 1.aop-aspectj-ע�ⷽʽ��
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//�е����
		Demo demo = ac.getBean("demo", Demo.class);
		//
		demo.demo();
		
	}
}
