package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.CustomerModel;

@Mapper
public interface ICustomerMapper {
	//增加客户
	public void insert(CustomerModel customerModel) throws Exception;
	//更新客户
	public void update(CustomerModel customerModel) throws Exception;
	//删除客户
	public void delete(CustomerModel customerModel) throws Exception;
	//查询所有客户
	public List<CustomerModel> selectByAll() throws Exception;
	//查询单个客户
	public CustomerModel selectById(int id) throws Exception;
}
