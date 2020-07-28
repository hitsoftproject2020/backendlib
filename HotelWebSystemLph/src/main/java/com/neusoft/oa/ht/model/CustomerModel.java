package com.neusoft.oa.ht.model;

import java.io.Serializable;

public class CustomerModel implements Serializable {
	private int cid = 0;
	private String cnameString = null;
	private String cpassWord = null;
	private String crealName = null;
	private String csex = null;
	private String cidno = null;
	private String cphoneno = null;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCnameString() {
		return cnameString;
	}
	public void setCnameString(String cnameString) {
		this.cnameString = cnameString;
	}
	public String getCpassWord() {
		return cpassWord;
	}
	public void setCpassWord(String cpassWord) {
		this.cpassWord = cpassWord;
	}
	public String getCrealName() {
		return crealName;
	}
	public void setCrealName(String crealName) {
		this.crealName = crealName;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getCidno() {
		return cidno;
	}
	public void setCidno(String cidno) {
		this.cidno = cidno;
	}
	public String getCphoneno() {
		return cphoneno;
	}
	public void setCphoneno(String cphoneno) {
		this.cphoneno = cphoneno;
	}
	
	

}
