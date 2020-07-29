package com.neusoft.oa.ht.service;

import java.util.List;

import com.neusoft.oa.ht.model.RoomModel;

public interface IRoomService {
	//增加客户
	public void add(RoomModel roomModel) throws Exception;
	//删除客户
	public void delete(RoomModel roomModel) throws Exception;
	//修改客户信息
	public void modify(RoomModel roomModel) throws Exception;
	//查看所有客户信息
	public List<RoomModel> selectByAll() throws Exception;
	//按ID查看客户信息
	public RoomModel seleteById(int id) throws Exception;

}
