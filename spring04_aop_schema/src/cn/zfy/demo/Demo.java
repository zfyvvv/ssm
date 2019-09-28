package cn.zfy.demo;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class Demo {
	
	
	public void demo() {
//		int i=5/0;
		System.out.println("this is demo!");
	}

	public void demo1(String name,int age) {
		System.out.println("this is demo1!");
	}
}
