package cn.zfy.advice;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

import com.sun.istack.internal.logging.Logger;

public class MyAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
			System.out.println("this is after advice!!");
			System.out.println("前置通知！");
			Logger logger=Logger.getLogger(MyAfterAdvice.class);
			logger.info("周方杨在"+new Date().toLocaleString()+"进行登录！");
	}

}
