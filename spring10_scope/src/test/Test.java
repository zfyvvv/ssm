package test;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import singleton.Singleton1;



public class Test {
	public static void main(String[] args) {
		
		//单例模式验证
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		System.out.println(s1==s2);
		
	}
}
