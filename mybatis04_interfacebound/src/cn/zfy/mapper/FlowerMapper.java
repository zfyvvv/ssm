package cn.zfy.mapper;

import java.util.List;

import cn.zfy.pojo.Flower;
/**
 * 1.�ӿڰ󶨷�������CURD������
 * @author DELL
 *
 */
public interface FlowerMapper {
	//�飻
	List<Flower> selAll();
	//ͳ�ƣ�
	int countAll();
	//��һ����
	Flower selById(int id);
	//���룻
	int insByOne(Flower flower);
	//ɾ
	int delById(int id);
	//��
	int updByName(Flower flower);

}
