package com.neusoft.oa.ht.model;

import java.io.Serializable;
import java.sql.Date;

public class ServiceOrderModel implements Serializable {
	private int soid = 0;
	private int cid = 0;
	private int sid = 0;
	private int serviceNum = 0;
	private Date sodate = null;
	private String sostate = null;
	private String soremark = null;
	public int getSoid() {
		return soid;
	}
	public void setSoid(int soid) {
		this.soid = soid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(int serviceNum) {
		this.serviceNum = serviceNum;
	}
	public Date getSodate() {
		return sodate;
	}
	public void setSodate(Date sodate) {
		this.sodate = sodate;
	}
	public String getSostate() {
		return sostate;
	}
	public void setSostate(String sostate) {
		this.sostate = sostate;
	}
	public String getSoremark() {
		return soremark;
	}
	public void setSoremark(String soremark) {
		this.soremark = soremark;
	}
	
	
}
