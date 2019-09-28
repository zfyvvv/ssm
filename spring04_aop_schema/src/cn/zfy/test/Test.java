package cn.zfy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zfy.demo.Demo;
/**
 * 1.demo类提供切点；advice提供通知；在全局配置文件中进行配置；配置完成后在test进行测试；
 * 2.测试schema方式的下AOP实现方式，
 * 3.包括异常通知方式；
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//切点测试
		Demo demo = ac.getBean("demo", Demo.class);
		demo.demo();
		
	}
}
