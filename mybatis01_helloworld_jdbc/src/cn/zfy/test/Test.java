package cn.zfy.test;

import java.util.ArrayList;
import java.util.List;

import cn.zfy.dao.FlowerDao;
import cn.zfy.daoimpl.FlowerDaoJDBCImpl;
import cn.zfy.pojo.Flower;
/**
 * 1.ԭ��JDBCʵ�����ݿ����ӣ�CURD������
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		List<Flower> list=new ArrayList<>();
		FlowerDao fd=new FlowerDaoJDBCImpl();
		list=fd.selAll();
		for(Flower f:list) {
			System.out.println(f.toString());
		}
	}

}
