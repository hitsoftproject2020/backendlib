package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.CustomerModel;

@Mapper
public interface ICustomerMapper {
	public void insert(CustomerModel customerModel) throws Exception;
	public void update(CustomerModel customerModel) throws Exception;
	public void delete(CustomerModel customerModel) throws Exception;
	public List<CustomerModel> selectByAll() throws Exception;
	public CustomerModel selectByid(int id) throws Exception;
}
