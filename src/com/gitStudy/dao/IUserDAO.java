package com.gitStudy.dao;

import java.util.List;

import com.gitStudy.bean.User;

public interface IUserDAO {
	void addUser(User user);
	void deletUser(Integer id);
	User getUser(Integer id);
	List<User> userList();
}
