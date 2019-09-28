package cn.zfy.service.impl;

import org.apache.ibatis.session.SqlSession;

import cn.zfy.mapper.PeopleMapper;
import cn.zfy.pojo.People;
import cn.zfy.service.PeopleService;
import cn.zfy.util.MybatisUtil;

public class PeopleServiceImpl implements PeopleService{
	
	@Override
	public int insPeo(People people) {
		SqlSession session=MybatisUtil.getSqlSession();
		PeopleMapper pm=session.getMapper(PeopleMapper.class);
		int index=pm.upd(people);
		return index;
	}
}
