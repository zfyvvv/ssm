package singleton;

/**
 * 1.¶öººÊ½£»
 * @author DELL
 *
 */
public class Singleton2 {
	private static Singleton2 instance=new Singleton2();
	private Singleton2() {};
	public static Singleton2 getinstance() {
		return instance;
	}
}
