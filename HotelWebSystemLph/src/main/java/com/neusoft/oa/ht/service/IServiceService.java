package com.neusoft.oa.ht.service;

import java.util.List;

import com.neusoft.oa.ht.model.ServiceModel;

public interface IServiceService {
	public void add(ServiceModel serviceModel) throws Exception;
	//删除客户
	public void delete(ServiceModel serviceModel) throws Exception;
	//修改客户信息
	public void modify(ServiceModel serviceModel) throws Exception;
	//查看所有客户信息
	public List<ServiceModel> selectByAll() throws Exception;
	//按ID查看客户信息
	public ServiceModel seleteById(int id) throws Exception;
}
