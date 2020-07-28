package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.RoomOrderModel;
import com.neusoft.oa.ht.model.ServiceModel;

@Mapper
public interface IServiceMapper {
	public void insert(ServiceModel serviceModel) throws Exception;
	public void update(ServiceModel serviceModel) throws Exception;
	public void delete(ServiceModel serviceModel) throws Exception;
	public List<ServiceModel> selectByAll() throws Exception;
	public ServiceModel selectById(int id) throws Exception;
}
