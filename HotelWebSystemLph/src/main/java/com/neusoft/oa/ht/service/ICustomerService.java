package com.neusoft.oa.ht.service;

import java.util.List;

import com.neusoft.oa.ht.model.CustomerModel;

public interface ICustomerService {
	//增加客户
	public void add(CustomerModel customerModel) throws Exception;
	//删除客户
	public void delete(CustomerModel customerModel) throws Exception;
	//修改客户信息
	public void modify(CustomerModel customerModel) throws Exception;
	//查看所有客户信息
	public List<CustomerModel> seleByAll() throws Exception;
	//按ID查看客户信息
	public CustomerModel seleteById(int id) throws Exception;

}
