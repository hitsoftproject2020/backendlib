package com.neusoft.messagemaintain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.neusoft.messagemaintain.model.RoomModel;

@Mapper
public interface IRoomMapper {
	public void insert(RoomModel roomModel) throws Exception;
	public void update(RoomModel roomModel) throws Exception;
	public void delete(RoomModel roomModel) throws Exception;
	public List<RoomModel> list() throws Exception;

}
