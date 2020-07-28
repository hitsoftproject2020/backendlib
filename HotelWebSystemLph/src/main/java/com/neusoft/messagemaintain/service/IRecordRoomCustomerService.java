package com.neusoft.messagemaintain.service;

import java.util.List;

import com.neusoft.messagemaintain.model.RecordRoomCustomerModel;

public interface IRecordRoomCustomerService {
	public void add(RecordRoomCustomerModel recordRoomCustomerModel) throws Exception;
	public void modify(RecordRoomCustomerModel recordRoomCustomerModel) throws Exception;
	public void delete(RecordRoomCustomerModel recordRoomCustomerModel) throws Exception;
	public List<RecordRoomCustomerModel> list() throws Exception;


}
