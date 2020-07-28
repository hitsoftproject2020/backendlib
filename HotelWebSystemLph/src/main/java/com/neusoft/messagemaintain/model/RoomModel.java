package com.neusoft.messagemaintain.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Room")
public class RoomModel implements Serializable {
	
	//房间编号
	private String roomcode = null;
	//房间类型
	private String roomtype = null;
	//房间价格
	private float roomprice = 0;
	
	
	public String getRoomcode() {
		return roomcode;
	}
	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public float getRoomprice() {
		return roomprice;
	}
	public void setRoomprice(float roomprice) {
		this.roomprice = roomprice;
	}
	
	

}
