package com.neusoft.messagemaintain.service;

import java.util.List;

import com.neusoft.messagemaintain.model.ConsumeModel;
import com.neusoft.messagemaintain.model.CustomerModel;

public interface ICustomerService {
	public void add(CustomerModel customerModel) throws Exception;
	public void modify(CustomerModel customerModel) throws Exception;
	public void delete(CustomerModel customerModel) throws Exception;
	public List<CustomerModel> list() throws Exception;

	
}
