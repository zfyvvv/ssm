package cn.zfy.mapper;

import java.util.List;

import cn.zfy.pojo.Flower;
/**
 * 1.接口绑定方案；简化CURD操作；
 * @author DELL
 *
 */
public interface FlowerMapper {
	//查；
	List<Flower> selAll();
	//统计；
	int countAll();
	//查一个；
	Flower selById(int id);
	//插入；
	int insByOne(Flower flower);
	//删
	int delById(int id);
	//改
	int updByName(Flower flower);

}
