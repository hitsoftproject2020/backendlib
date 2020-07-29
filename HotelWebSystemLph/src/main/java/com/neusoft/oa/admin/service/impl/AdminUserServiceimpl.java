package com.neusoft.oa.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.admin.mapper.IAdminUserMapper;
import com.neusoft.oa.admin.model.AdminUserModel;
import com.neusoft.oa.admin.service.IAdminUserService;
@Service
@Transactional  //环绕事务Advice的切入点
public class AdminUserServiceimpl implements IAdminUserService {
	@Autowired
	private IAdminUserMapper admin = null;

	@Override
	public void insert(AdminUserModel adminUserModel) throws Exception {
		// TODO Auto-generated method stub
		admin.insert(adminUserModel);

	}

	@Override
	public void delete(AdminUserModel adminUserModel) throws Exception {
		// TODO Auto-generated method stub
		admin.delete(adminUserModel);

	}

	@Override
	public void update(AdminUserModel adminUserModel) throws Exception {
		// TODO Auto-generated method stub
		admin.update(adminUserModel);

	}

	@Override
	public List<AdminUserModel> selectByAll() throws Exception {
		// TODO Auto-generated method stub
		return admin.selectByAll();
	}

	@Override
	public AdminUserModel selectById(int id) throws Exception {
		// TODO Auto-generated method stub
		return admin.selectByid(id);
	}

}
