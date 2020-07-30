package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.RoomOrderModel;

@Mapper
public interface IRoomOrderMapper {
	public void insert(RoomOrderModel roomOrderModel) throws Exception;
	public void update(RoomOrderModel roomOrderModel) throws Exception;
	public void delete(RoomOrderModel roomOrderModel) throws Exception;
	public List<RoomOrderModel> selectByAll() throws Exception;
	public RoomOrderModel selectById(int id) throws Exception;
//	public void moretable() throws Exception;

}
