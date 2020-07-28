package com.neusoft.messagemaintain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.messagemaintain.model.ConsumeModel;

@Mapper
public interface IConsumeMapper {
	
	public void insert(ConsumeModel consumeModel) throws Exception;
	public void update(ConsumeModel consumeModel) throws Exception;
	public void delete(ConsumeModel consumeModel) throws Exception;
	public List<ConsumeModel> list() throws Exception;
	

}
