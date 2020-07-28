package com.neusoft.messagemaintain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.messagemaintain.model.CustomerModel;

@Mapper
public interface ICustomerMapper {
	public void insert(CustomerModel customerModel) throws Exception;
	public void update(CustomerModel customerModel) throws Exception;
	public void delete(CustomerModel customerModel) throws Exception;
	public List<CustomerModel> list() throws Exception;

}
