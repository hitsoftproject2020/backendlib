package com.neusoft.oa.ht.service;

import java.util.List;

import com.neusoft.oa.ht.model.ServiceOrderModel;

public interface IServiceOrderService {
	public void add(ServiceOrderModel serviceOrderModel) throws Exception;
	//删除客户
	public void delete(ServiceOrderModel serviceOrderModel) throws Exception;
	//修改客户信息
	public void modify(ServiceOrderModel serviceOrderModel) throws Exception;
	//查看所有客户信息
	public List<ServiceOrderModel> selectByAll() throws Exception;
	//按ID查看客户信息
	public ServiceOrderModel seleteById(int id) throws Exception;

}
