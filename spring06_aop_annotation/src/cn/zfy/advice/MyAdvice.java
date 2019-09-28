package cn.zfy.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	
	@Before("cn.zfy.demo.Demo.demo()")
	public void mybefore() {
		System.out.println("ǰ��֪ͨ");
	}
	
	@After("cn.zfy.demo.Demo.demo()")
	public void myafter() {
		System.out.println("����֪ͨ");
	}
	
	@AfterThrowing("cn.zfy.demo.Demo.demo()")
	public void mythrow() {
		System.out.println("�쳣֪ͨ");
	}
	
	@Around("cn.zfy.demo.Demo.demo()")
	public Object myaroud(ProceedingJoinPoint p) throws Throwable {
		System.out.println("����-ǰ��֪ͨ");
		Object result=p.proceed();
		System.out.println("����-����֪ͨ��");
		return result;
	}
	
}
