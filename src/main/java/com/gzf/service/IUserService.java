package com.gzf.service;

import java.util.ArrayList;

import com.gzf.bean.UserBean;

public interface IUserService {
	void addUser(UserBean userBean);

	ArrayList<UserBean> query();

	UserBean selectUserById(long id);

	void updateUser(UserBean userBean);

	void deleteUser(long id);
}
