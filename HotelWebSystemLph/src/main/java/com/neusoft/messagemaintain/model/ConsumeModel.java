package com.neusoft.messagemaintain.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("Comsume")
public class ConsumeModel implements Serializable {
	
	private String cecustomerid = null;
	private float cewater = 0;
	private float ceelectricity = 0;
	private float cefood = 0;
	public String getCecustomerid() {
		return cecustomerid;
	}
	public void setCecustomerid(String cecustomerid) {
		this.cecustomerid = cecustomerid;
	}
	public float getCewater() {
		return cewater;
	}
	public void setCewater(float cewater) {
		this.cewater = cewater;
	}
	public float getCeelectricity() {
		return ceelectricity;
	}
	public void setCeelectricity(float ceelectricity) {
		this.ceelectricity = ceelectricity;
	}
	public float getCefood() {
		return cefood;
	}
	public void setCefood(float cefood) {
		this.cefood = cefood;
	}
	
	
}
