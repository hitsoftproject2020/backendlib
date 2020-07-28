package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.ServiceOrderModel;

@Mapper
public interface IServiceOrderMapper {
	public void insert(ServiceOrderModel serviceOrderModel) throws Exception;
	public void update(ServiceOrderModel serviceOrderModel) throws Exception;
	public void delete(ServiceOrderModel serviceOrderModel) throws Exception;
	public List<ServiceOrderModel> selectByAll() throws Exception;
	public ServiceOrderModel selectById(int id) throws Exception;
}
