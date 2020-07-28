package com.neusoft.oa.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.ht.model.RoomTypeModel;

@Mapper
public interface IRoomTypeMapper {
	public void insert(RoomTypeModel roomTypeModel) throws Exception;
	public void update(RoomTypeModel roomTypeModel) throws Exception;
	public void delete(RoomTypeModel roomTypeModel) throws Exception;
	public List<RoomTypeModel> selectByAll() throws Exception;
	public RoomTypeModel selectById(int id) throws Exception;
}
