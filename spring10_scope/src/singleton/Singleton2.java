package singleton;

/**
 * 1.����ʽ��
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
