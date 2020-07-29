package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.mapper.IRoomMapper;
import com.neusoft.oa.ht.model.RoomModel;
import com.neusoft.oa.ht.service.IRoomService;
@Service
@Transactional  //环绕事务Advice的切入点
public class RoomServiceImpl implements IRoomService {
	
	@Autowired
	private IRoomMapper room = null;
	@Override
	public void add(RoomModel roomModel) throws Exception {
		// TODO Auto-generated method stub
		room.insert(roomModel);

	}

	@Override
	public void delete(RoomModel roomModel) throws Exception {
		// TODO Auto-generated method stub
		room.delete(roomModel);

	}

	@Override
	public void modify(RoomModel roomModel) throws Exception {
		// TODO Auto-generated method stub
		room.update(roomModel);

	}

	@Override
	public List<RoomModel> selectByAll() throws Exception {
		// TODO Auto-generated method stub
		return room.selectByAll();
	}

	@Override
	public RoomModel seleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return room.selectById(id);
	}

}
