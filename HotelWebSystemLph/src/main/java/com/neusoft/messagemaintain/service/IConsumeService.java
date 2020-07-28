package com.neusoft.messagemaintain.service;

import java.util.List;

import com.neusoft.messagemaintain.model.ConsumeModel;

public interface IConsumeService {
	public void add(ConsumeModel consumeModel) throws Exception;
	public void modify(ConsumeModel consumeModel) throws Exception;
	public void delete(ConsumeModel consumeModel) throws Exception;
	public List<ConsumeModel> list() throws Exception;

}
