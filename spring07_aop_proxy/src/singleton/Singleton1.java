package singleton;

public class Singleton1 {
	//懒汉式 
	//属性私有化，防止外部直接获取；在静态方法中，故添加静态修饰；
	private static Singleton1 instance;
	//构造方法必定返回当前对象,故私有化，外面获取不到；
	private Singleton1() {};
	//普通方法需通过对象获取，但构造器已经私有化，故设置方法为静态方法；
	//静态方法中的变量，需为静态变量；
	public static Singleton1 getInstance() {
		//条件逻辑实例化，如果实例化则直接返回；故需要添加全局变量instance；
		if(instance==null) {//如果没有，则重新实例化
			synchronized (Singleton1.class) {//多线程下，可能存在if同时成立的情况，添加锁
				if(instance==null) {//排队进行锁，双重验证 ；
					instance=new Singleton1();
				}
			}
		}
		return instance;
	}
}
