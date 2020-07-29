package com.neusoft.oa.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.ht.mapper.IRoomTypeMapper;
import com.neusoft.oa.ht.model.RoomTypeModel;
import com.neusoft.oa.ht.service.IRoomTypeService;
@Service
@Transactional  //环绕事务Advice的切入点
public class RoomTypeIServicempl implements IRoomTypeService {
	@Autowired
	private IRoomTypeMapper irt = null;
	@Override
	public void add(RoomTypeModel roomTypeModel) throws Exception {
		// TODO Auto-generated method stub
		irt.insert(roomTypeModel);

	}

	@Override
	public void delete(RoomTypeModel roomTypeModel) throws Exception {
		// TODO Auto-generated method stub
		irt.delete(roomTypeModel);

	}

	@Override
	public void modify(RoomTypeModel roomTypeModel) throws Exception {
		// TODO Auto-generated method stub
		irt.update(roomTypeModel);

	}

	@Override
	public List<RoomTypeModel> selectByAll() throws Exception {
		// TODO Auto-generated method stub
		return irt.selectByAll();
	}

	@Override
	public RoomTypeModel seleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return irt.selectByid(id);
	}

}
