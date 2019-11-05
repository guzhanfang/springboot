package com.gzf.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzf.bean.UserBean;
import com.gzf.mapper.UserMapper;
import com.gzf.service.IUserService;

/**
 * 
 * @author guzhanfang
 * @Email guzhanfangyi@163.com
 * @introduce
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		userMapper.insertUser(userBean);
	}

	@Override
	public ArrayList<UserBean> query() {
		// TODO Auto-generated method stub
		return userMapper.query();
	}

	@Override
	public UserBean selectUserById(long id) {
		// TODO Auto-generated method stub
		return userMapper.selectUserById(id);
	}

	@Override
	public void updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		userMapper.updateUser(userBean);
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(id);
	}

}
