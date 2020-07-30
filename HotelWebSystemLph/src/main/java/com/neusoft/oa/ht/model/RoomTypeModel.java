package com.neusoft.oa.ht.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@SuppressWarnings("serial")
@Alias("RoomType")
public class RoomTypeModel implements Serializable {
	private int tid = 0;
	private String tname = null;
	private float tprice = 0;
	private int bedNum = 0;
	private String tremark = null;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public float getTprice() {
		return tprice;
	}
	public void setTprice(float tprice) {
		this.tprice = tprice;
	}
	public int getBedNum() {
		return bedNum;
	}
	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}
	public String getTremark() {
		return tremark;
	}
	public void setTremark(String tremark) {
		this.tremark = tremark;
	}
	
	
}
