package test;




import cglibdypro.Boss;
import cglibdypro.Scretary;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import singleton.Singleton1;



public class Test {
	public static void main(String[] args) {
		//��̬����
		/*Scretary s=new Scretary();
		s.chat();*/
		
		//ʹ��JDK����̬����
//		Scretary s=new Scretary();
		//����1 ����ʱʹ�õ�������� ���㷴�䣬������
		//����2 Proxy��Ҫʵ�ֵĽӿ�
		//����3 ͨ���ӿڶ�����÷���ʱ����Ҫ�����ĸ���(�������)��invoke() ����˭��invoke()
		//Business b=(Business) Proxy.newProxyInstance(Test.class.getClassLoader(), 
			//			new Class[] {Business.class}, s);
		//������b.chat()ʱ������ʵ��Business�ӿڵ�Proxy���󣬵��õ���Proxy.chat();
		//ÿ��Proxy.chat()ʱ������ص�s.invoke()���ʲ���Ҫÿ�����÷���
		//s.invoke()�п�����չ���ܣ�ʵ��boss.chat(),
		//��ÿ�ζ�̬����������ʱ����Ҫ��������������
		//b.chat();
		
		//ʹ��cglib����̬����
		/*Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Boss.class);
		enhancer.setCallback(new Scretary());
		Boss boss = (Boss) enhancer.create();
		boss.chat();*/
		
		//����ģʽ��֤
		/*Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		System.out.println(s1==s2);*/
		
	}
}
