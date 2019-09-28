package com.zfy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zfy.mapper.PeopleMapper;
import com.zfy.pojo.People;
import com.zfy.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService{
	
	@Resource
	private PeopleMapper peopleMapper;

	@Override
	public int addPeo(People people) {
		// TODO Auto-generated method stub
		return peopleMapper.insPeo(people);
	}

	@Override
	public int removePeo(People people) {
		// TODO Auto-generated method stub
		return peopleMapper.delPeo(people);
	}

	@Override
	public int updPeo(People people) {
		// TODO Auto-generated method stub
		return peopleMapper.updPeo(people);
	}

	@Override
	public List<People> showPeo() {
		// TODO Auto-generated method stub
		return peopleMapper.selAll();
	}
	

}
