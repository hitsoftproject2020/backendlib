package com.neusoft.oa.ht.service;

import java.util.List;

import com.neusoft.oa.ht.model.RoomTypeModel;

public interface IRoomTypeService {
	public void add(RoomTypeModel roomTypeModel) throws Exception;
	//删除客户
	public void delete(RoomTypeModel roomTypeModel) throws Exception;
	//修改客户信息
	public void modify(RoomTypeModel roomTypeModel) throws Exception;
	//查看所有客户信息
	public List<RoomTypeModel> selectByAll() throws Exception;
	//按ID查看客户信息
	public RoomTypeModel seleteById(int id) throws Exception;

}
