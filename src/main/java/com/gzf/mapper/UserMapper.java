package com.gzf.mapper;

import java.util.ArrayList;

import com.gzf.bean.UserBean;

public interface UserMapper {
	void insertUser(UserBean userBean);

	ArrayList<UserBean> query();

	UserBean selectUserById(long id);

	void updateUser(UserBean userBean);

	void deleteUser(long id);
}
