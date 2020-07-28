package com.neusoft.oa.ht.model;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;
@Alias("RoomOrder")
public class RoomOrderModel implements Serializable {
	private int roid = 0;
	
	private Date rodate = null;
	private Date checkinDate = null;
	private Date checkoutDate = null;
	private String rostate = null;
	private String roremark = null;
	
	
	//与CustomerModel和RoomModel相关联，cid和rid从这取出调用
	private CustomerModel customer = null;
	private RoomModel room = null;
	
	
	public int getRoid() {
		return roid;
	}
	public void setRoid(int roid) {
		this.roid = roid;
	}
	
	public Date getRodate() {
		return rodate;
	}
	public void setRodate(Date rodate) {
		this.rodate = rodate;
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public String getRostate() {
		return rostate;
	}
	public void setRostate(String rostate) {
		this.rostate = rostate;
	}
	public String getRoremark() {
		return roremark;
	}
	public void setRoremark(String roremark) {
		this.roremark = roremark;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	public RoomModel getRoom() {
		return room;
	}
	public void setRoom(RoomModel room) {
		this.room = room;
	}
	
	

}
