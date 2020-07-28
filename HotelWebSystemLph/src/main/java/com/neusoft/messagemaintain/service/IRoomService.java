package com.neusoft.messagemaintain.service;

import java.util.List;

import com.neusoft.messagemaintain.model.RoomModel;

public interface IRoomService {
	public void add(RoomModel roomModel) throws Exception;
	public void modify(RoomModel roomModel) throws Exception;
	public void delete(RoomModel roomModel) throws Exception;
	public List<RoomModel> list() throws Exception;

}
