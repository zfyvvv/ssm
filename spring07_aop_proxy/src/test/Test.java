package test;




import cglibdypro.Boss;
import cglibdypro.Scretary;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import singleton.Singleton1;



public class Test {
	public static void main(String[] args) {
		//静态代理
		/*Scretary s=new Scretary();
		s.chat();*/
		
		//使用JDK，动态代理
//		Scretary s=new Scretary();
		//参数1 反射时使用的类加载器 方便反射，加载类
		//参数2 Proxy需要实现的接口
		//参数3 通过接口对象调用方法时，需要调用哪个类(处理程序)的invoke() 调用谁的invoke()
		//Business b=(Business) Proxy.newProxyInstance(Test.class.getClassLoader(), 
			//			new Class[] {Business.class}, s);
		//当调用b.chat()时，产生实现Business接口的Proxy对象，调用的是Proxy.chat();
		//每次Proxy.chat()时，都会回调s.invoke()，故不需要每次配置方法
		//s.invoke()中可以扩展功能，实现boss.chat(),
		//故每次动态生产代理类时，需要上面三个参数！
		//b.chat();
		
		//使用cglib，动态代理
		/*Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Boss.class);
		enhancer.setCallback(new Scretary());
		Boss boss = (Boss) enhancer.create();
		boss.chat();*/
		
		//单例模式验证
		/*Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		System.out.println(s1==s2);*/
		
	}
}
