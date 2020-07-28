package com.neusoft.oa.ht.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("Service")
public class ServiceModel implements Serializable {
	private int sid = 0;
	private String sname = null;
	private float sprice = 0;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSprice() {
		return sprice;
	}
	public void setSprice(float sprice) {
		this.sprice = sprice;
	}
	
	

}
