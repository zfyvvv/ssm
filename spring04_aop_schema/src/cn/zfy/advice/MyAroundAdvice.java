package cn.zfy.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("around advice --before!");
		Object rusult = arg0.proceed();
		System.out.println("around advice --after!");
		return rusult;
	}

}
