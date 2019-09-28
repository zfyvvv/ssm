package cglibdypro;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Scretary implements MethodInterceptor{
	
	//子类重写父类方法
	//参数分别为 生成子类对象 代理方法 参数 子类生成代理方法
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) 
			throws Throwable {
		System.out.println("book a hotel!");
		//Invoke() 调用父类需要代理的方法
		//Object result = arg1.invoke(arg0, arg2);
		//invokesuper() 通过子类的父类方法进行调用，二选一即可
		Object result =arg3.invokeSuper(arg0, arg2);
		//一直调用自己本身
		//arg3.invoke(arg0, arg2);
		System.out.println("meeting record!");
		return result;
	}
}
