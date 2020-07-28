package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.RoomModel;

@Mapper
public interface IRoomMapper {
	public void insert(RoomModel roomModel) throws Exception;
	public void update(RoomModel roomModel) throws Exception;
	public void delete(RoomModel roomModel) throws Exception;
	public List<RoomModel> selectByAll() throws Exception;
	public RoomModel selectById(int id) throws Exception;
}
