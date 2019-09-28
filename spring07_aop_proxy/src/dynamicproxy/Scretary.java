package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import staticproxy.Business;

public class Scretary implements InvocationHandler{
	private Boss boss=new Boss();

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("book a hotel!");
		Object result=method.invoke(boss, args);
		System.out.println("meeting record!");
		return result;
	}

	

}
