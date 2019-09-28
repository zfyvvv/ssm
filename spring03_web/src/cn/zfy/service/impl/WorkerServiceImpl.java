package cn.zfy.service.impl;

import java.util.List;

import cn.zfy.mapper.WorkerMapper;
import cn.zfy.pojo.Worker;
import cn.zfy.service.WorkerService;

public class WorkerServiceImpl implements WorkerService{
	private WorkerMapper workerMapper;
	
	
	public WorkerMapper getWorkerMapper() {
		return workerMapper;
	}


	public void setWorkerMapper(WorkerMapper workerMapper) {
		this.workerMapper = workerMapper;
	}


	@Override
	public List<Worker> show() {
		// TODO Auto-generated method stub
		return workerMapper.selAll();
	}

}
