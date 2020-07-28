package com.neusoft.oa.ht.model;

import java.io.Serializable;
import java.sql.Date;

public class RoomOrderModel implements Serializable {
	private int roid = 0;
	private int cid = 0;
	private int rid = 0;
	private Date rodate = null;
	private Date checkinDate = null;
	private Date checkoutDate = null;
	private String rostate = null;
	private String roremark = null;
	public int getRoid() {
		return roid;
	}
	public void setRoid(int roid) {
		this.roid = roid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
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
	
	

}
