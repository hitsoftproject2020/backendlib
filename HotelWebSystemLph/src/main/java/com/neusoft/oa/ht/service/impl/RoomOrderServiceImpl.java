package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.mapper.IRoomOrderMapper;
import com.neusoft.oa.ht.model.CustomerAndRoomModel;
import com.neusoft.oa.ht.model.RoomOrderModel;
import com.neusoft.oa.ht.service.IRoomOrderService;
@Service
@Transactional  //环绕事务Advice的切入点
public class RoomOrderServiceImpl implements IRoomOrderService {
	@Autowired
	private IRoomOrderMapper iRoomOrderMapper = null;
	@Override
	public void add(RoomOrderModel roomOrderModel) throws Exception {
		// TODO Auto-generated method 
		this.iRoomOrderMapper.insert(roomOrderModel);
		

	}

	@Override
	public void delete(RoomOrderModel roomOrderModel) throws Exception {
		// TODO Auto-generated method stub
		iRoomOrderMapper.delete(roomOrderModel);

	}

	@Override
	public void modify(RoomOrderModel roomOrderModel) throws Exception {
		// TODO Auto-generated method stub
		iRoomOrderMapper.update(roomOrderModel);

	}

	@Override
	public List<RoomOrderModel> selectByAll() throws Exception {
		// TODO Auto-generated method stub
		return iRoomOrderMapper.selectByAll();
	}

	@Override
	public RoomOrderModel seleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return iRoomOrderMapper.selectById(id);
	}

	@Override
	public List<CustomerAndRoomModel> selectCustomerAndRoom(int id) throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}

}
