package cglibdypro;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Scretary implements MethodInterceptor{
	
	//������д���෽��
	//�����ֱ�Ϊ ����������� ������ ���� �������ɴ�����
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) 
			throws Throwable {
		System.out.println("book a hotel!");
		//Invoke() ���ø�����Ҫ����ķ���
		//Object result = arg1.invoke(arg0, arg2);
		//invokesuper() ͨ������ĸ��෽�����е��ã���ѡһ����
		Object result =arg3.invokeSuper(arg0, arg2);
		//һֱ�����Լ�����
		//arg3.invoke(arg0, arg2);
		System.out.println("meeting record!");
		return result;
	}
}
