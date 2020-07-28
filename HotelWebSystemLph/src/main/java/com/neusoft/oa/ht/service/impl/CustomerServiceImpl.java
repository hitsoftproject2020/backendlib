package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.model.CustomerModel;
import com.neusoft.oa.ht.service.ICustomerService;
@Service
@Transactional  //环绕事务Advice的切入点
public class CustomerServiceImpl implements ICustomerService {

	@Override
	public void add(CustomerModel customerModel) throws Exception {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void delete(CustomerModel customerModel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modify(CustomerModel customerModel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CustomerModel> seleByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerModel seleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
