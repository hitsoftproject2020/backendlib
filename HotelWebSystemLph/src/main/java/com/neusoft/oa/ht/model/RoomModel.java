package com.neusoft.oa.ht.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("Room")
public class RoomModel implements Serializable {
	private int rid = 0;
	private int floor = 0;
	private int tid = 0;
	private String rstate = null;
	private String rremark = null;
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
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
	
	

}
