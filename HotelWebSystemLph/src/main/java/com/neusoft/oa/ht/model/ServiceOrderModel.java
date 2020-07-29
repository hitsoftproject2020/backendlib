package com.neusoft.oa.ht.model;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;
@Alias("ServiceOrder")
public class ServiceOrderModel implements Serializable {
	private int soid = 0;
	
	private int serviceNum = 0;
	private Date sodate = null;
	private String sostate = null;
	private String soremark = null;
	
	
	//与ServiceModel和CustomerModel关联，sid和cid从这取出调用
	private ServiceModel service = null;
	private CustomerModel cudtomer = null;
	
	
	public int getSoid() {
		return soid;
	}
	public void setSoid(int soid) {
		this.soid = soid;
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
	public ServiceModel getService() {
		return service;
	}
	public void setService(ServiceModel service) {
		this.service = service;
	}
	public CustomerModel getCudtomer() {
		return cudtomer;
	}
	public void setCudtomer(CustomerModel cudtomer) {
		this.cudtomer = cudtomer;
	}
	
	
	
	
	
}
