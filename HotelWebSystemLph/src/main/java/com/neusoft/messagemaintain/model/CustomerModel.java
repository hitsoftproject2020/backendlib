package com.neusoft.messagemaintain.model;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;
@Alias("Customer")
public class CustomerModel implements Serializable {
	
	private String customername = null;
	private String customersex = null;
	private String customerid = null;
	private Date customerbirthday = null;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomersex() {
		return customersex;
	}
	public void setCustomersex(String customersex) {
		this.customersex = customersex;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public Date getCustomerbirthday() {
		return customerbirthday;
	}
	public void setCustomerbirthday(Date customerbirthday) {
		this.customerbirthday = customerbirthday;
	}
	
	
}
