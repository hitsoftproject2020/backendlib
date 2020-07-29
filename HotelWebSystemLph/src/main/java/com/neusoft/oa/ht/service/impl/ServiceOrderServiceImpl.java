package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.mapper.IServiceOrderMapper;
import com.neusoft.oa.ht.model.ServiceOrderModel;
import com.neusoft.oa.ht.service.IServiceOrderService;
@Service
@Transactional  //环绕事务Advice的切入点
public class ServiceOrderServiceImpl implements IServiceOrderService {
	@Autowired
	private IServiceOrderMapper iso = null;
	@Override
	public void add(ServiceOrderModel serviceOrderModel) throws Exception {
		// TODO Auto-generated method stub
		iso.insert(serviceOrderModel);
	}

	@Override
	public void delete(ServiceOrderModel serviceOrderModel) throws Exception {
		// TODO Auto-generated method stub
		iso.delete(serviceOrderModel);

	}

	@Override
	public void modify(ServiceOrderModel serviceOrderModel) throws Exception {
		// TODO Auto-generated method stub
		iso.update(serviceOrderModel);

	}

	@Override
	public List<ServiceOrderModel> selectByAll() throws Exception {
		// TODO Auto-generated method stub
		return iso.selectByAll();
	}

	@Override
	public ServiceOrderModel seleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return iso.selectById(id);
	}

}
