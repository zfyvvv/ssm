package cn.zfy.advice;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

import com.sun.istack.internal.logging.Logger;

import cn.zfy.pojo.User;

public class MyBefore implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		User user=(User)arg1[0];
		System.out.println("ǰ��֪ͨ��");
		Logger logger=Logger.getLogger(MyBefore.class);
		logger.info(user.getName()+"��"+new Date().toLocaleString()+"���е�¼��");
	}
}
