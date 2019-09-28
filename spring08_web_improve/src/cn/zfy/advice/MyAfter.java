package cn.zfy.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.sun.istack.internal.logging.Logger;

import cn.zfy.pojo.User;
import sun.util.logging.resources.logging;

public class MyAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		Logger logger=Logger.getLogger(MyAfter.class);
		System.out.println("后置通知！");
		User user=(User) arg2[0];
		if(user!=null) {
			logger.info(user.getName()+"登录成功！");
		}else {
			logger.info(user.getName()+"登录失败！");
		}
	}

}
