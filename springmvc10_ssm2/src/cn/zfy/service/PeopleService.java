package cn.zfy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.zfy.pojo.People;

public interface PeopleService {
	
	int addPeo(People people);
	int removePeo(People people);
	int updPeo(People people);
	List<People> showPeo();

}
