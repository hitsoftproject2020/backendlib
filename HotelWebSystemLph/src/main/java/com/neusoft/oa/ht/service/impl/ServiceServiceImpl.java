package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.mapper.IServiceMapper;
import com.neusoft.oa.ht.model.ServiceModel;
import com.neusoft.oa.ht.service.IServiceService;
@Service
@Transactional  //环绕事务Advice的切入点
public class ServiceServiceImpl implements IServiceService {
	@Autowired
	private IServiceMapper is = null;
	@Override
	public void add(ServiceModel serviceModel) throws Exception {
		// TODO Auto-generated method stub
		is.insert(serviceModel);
		

	}

	@Override
	public void delete(ServiceModel serviceModel) throws Exception {
		// TODO Auto-generated method stub
		is.delete(serviceModel);

	}

	@Override
	public void modify(ServiceModel serviceModel) throws Exception {
		// TODO Auto-generated method stub
		is.update(serviceModel);

	}

	@Override
	public List<ServiceModel> selectByAll() throws Exception {
		// TODO Auto-generated method stub
		return is.selectByAll();
	}

	@Override
	public ServiceModel seleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return is.selectByid(id);
	}

}
