package com.neusoft.oa.admin.service;

import java.util.List;

import com.neusoft.oa.admin.model.AdminUserModel;

public interface IAdminUserService {
	public void insert(AdminUserModel adminUserModel) throws Exception;
	public void delete(AdminUserModel adminUserModel) throws Exception;
	public void update(AdminUserModel adminUserModel) throws Exception;
	public List<AdminUserModel> selectByAll() throws Exception;
	public AdminUserModel selectById(int id) throws Exception;

}
