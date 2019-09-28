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
		System.out.println("前置通知");
	}
	
	@After("cn.zfy.demo.Demo.demo()")
	public void myafter() {
		System.out.println("后置通知");
	}
	
	@AfterThrowing("cn.zfy.demo.Demo.demo()")
	public void mythrow() {
		System.out.println("异常通知");
	}
	
	@Around("cn.zfy.demo.Demo.demo()")
	public Object myaroud(ProceedingJoinPoint p) throws Throwable {
		System.out.println("环绕-前置通知");
		Object result=p.proceed();
		System.out.println("环绕-后置通知；");
		return result;
	}
	
}
