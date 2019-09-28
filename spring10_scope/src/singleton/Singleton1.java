package singleton;

public class Singleton1 {
	//����ʽ 
	//����˽�л�����ֹ�ⲿֱ�ӻ�ȡ���ھ�̬�����У�����Ӿ�̬���Σ�
	private static Singleton1 instance;
	//���췽���ض����ص�ǰ����,��˽�л��������ȡ������
	private Singleton1() {};
	//��ͨ������ͨ�������ȡ�����������Ѿ�˽�л��������÷���Ϊ��̬������
	//��̬�����еı�������Ϊ��̬������
	public static Singleton1 getInstance() {
		//�����߼�ʵ���������ʵ������ֱ�ӷ��أ�����Ҫ���ȫ�ֱ���instance��
		if(instance==null) {//���û�У�������ʵ����
			synchronized (Singleton1.class) {//���߳��£����ܴ���ifͬʱ����������������
				if(instance==null) {//�Ŷӽ�������˫����֤ ��
					instance=new Singleton1();
				}
			}
		}
		return instance;
	}
}
