package cn.zfy.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

public class MyAdvice {
	
	public void mybefore() {
		System.out.println("mybefore");
	}
	
	public void myafter() {
		System.out.println("myafter");
	}
	public void myaftering() {
		System.out.println("myaftering");
	}
	public void mythrow() {
		System.out.println("mythrow");
	}
	
	public Object myaround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("around");
		System.out.println("around-before");
		Object result = p.proceed();
		System.out.println("around-after");
		return result;
	}
	
	//aspcetj获取参数
	public void mybefore1(String name1,int age1) {
		System.out.println("mybefore"+name1+"-->"+age1);
	}
}
