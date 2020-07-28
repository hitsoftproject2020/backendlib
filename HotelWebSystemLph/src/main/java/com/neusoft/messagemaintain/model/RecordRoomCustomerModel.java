package com.neusoft.messagemaintain.model;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;
@Alias("RecordRoomCustomer")
public class RecordRoomCustomerModel implements Serializable {
	
	private String rdcustomerid = null;
	private String rdroomcode = null;
	private Date rdstartdate = null;
	private Date rdenddate = null;
	public String getRdcustomerid() {
		return rdcustomerid;
	}
	public void setRdcustomerid(String rdcustomerid) {
		this.rdcustomerid = rdcustomerid;
	}
	public String getRdroomcode() {
		return rdroomcode;
	}
	public void setRdroomcode(String rdroomcode) {
		this.rdroomcode = rdroomcode;
	}
	public Date getRdstartdate() {
		return rdstartdate;
	}
	public void setRdstartdate(Date rdstartdate) {
		this.rdstartdate = rdstartdate;
	}
	public Date getRdenddate() {
		return rdenddate;
	}
	public void setRdenddate(Date rdenddate) {
		this.rdenddate = rdenddate;
	}
	
	

}
