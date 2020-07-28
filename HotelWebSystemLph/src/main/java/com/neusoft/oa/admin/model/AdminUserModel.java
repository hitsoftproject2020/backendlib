package com.neusoft.oa.admin.model;

import java.io.Serializable;

public class AdminUserModel implements Serializable {
	private int adminid = 0;
	private String adminName = null;
	private String adminPassWord = null;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassWord() {
		return adminPassWord;
	}
	public void setAdminPassWord(String adminPassWord) {
		this.adminPassWord = adminPassWord;
	}
	
	

}
