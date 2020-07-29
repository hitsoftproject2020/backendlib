package com.neusoft.oa.ht.service;

import java.util.List;

import com.neusoft.oa.ht.model.RoomOrderModel;

public interface IRoomOrderService {
	//增加客户
	public void add(RoomOrderModel roomOrderModel) throws Exception;
	//删除客户
	public void delete(RoomOrderModel roomOrderModel) throws Exception;
	//修改客户信息
	public void modify(RoomOrderModel roomOrderModel) throws Exception;
	//查看所有客户信息
	public List<RoomOrderModel> selectByAll() throws Exception;
	//按ID查看客户信息
	public RoomOrderModel seleteById(int id) throws Exception;

}
