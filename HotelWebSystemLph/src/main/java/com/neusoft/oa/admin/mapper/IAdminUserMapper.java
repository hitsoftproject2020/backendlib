package com.neusoft.oa.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.admin.model.AdminUserModel;

@Mapper
public interface IAdminUserMapper {
	public void insert(AdminUserModel adminUserModel) throws Exception;
	public void update(AdminUserModel adminUserModel) throws Exception;
	public void delete(AdminUserModel adminUserModel) throws Exception;
	public List<AdminUserModel> selectByAll() throws Exception;
	public AdminUserModel selectByid(int id) throws Exception;
}
