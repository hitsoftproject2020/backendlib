package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.mapper.ICustomerMapper;
import com.neusoft.oa.ht.model.CustomerModel;
import com.neusoft.oa.ht.service.ICustomerService;
@Service("customerService")
@Transactional  //环绕事务Advice的切入点
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerMapper iCustomerMapper = null;
	
	public void setDepartmentMapper(ICustomerMapper iCustomerMapper1) {
		this.iCustomerMapper = iCustomerMapper1;
	}
	
	@Override
	public void add(CustomerModel customerModel) throws Exception {
		// TODO Auto-generated method stub
		this.iCustomerMapper.insert(customerModel);

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
