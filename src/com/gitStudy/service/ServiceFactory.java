package com.gitStudy.service;

import java.util.List;

import com.gitStudy.bean.User;

public interface ServiceFactory {
	void addUser(User user);

	void deletUser(Integer id);

	User getUser(Integer id);

	List<User> userList();
}
