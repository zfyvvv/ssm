package cn.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.zfy.pojo.Worker;

public interface WorkerMapper {
	@Select("select * from worker")
	List<Worker> selAll();
	
}
