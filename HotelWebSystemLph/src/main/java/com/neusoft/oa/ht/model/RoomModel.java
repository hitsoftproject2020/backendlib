package com.neusoft.oa.ht.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("Room")
public class RoomModel implements Serializable {
	private int rid = 0;
	private int floor = 0;
	
	private String rstate = null;
	private String rremark = null;
	
	
	//与RoomTypeModel相关联，tid从这调用
	private RoomTypeModel roomtype = null;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public String getRstate() {
		return rstate;
	}
	public void setRstate(String rstate) {
		this.rstate = rstate;
	}
	public String getRremark() {
		return rremark;
	}
	public void setRremark(String rremark) {
		this.rremark = rremark;
	}
	public RoomTypeModel getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(RoomTypeModel roomtype) {
		this.roomtype = roomtype;
	}
	
	

}
