package com.gitStudy.service.impl;

import java.util.List;

import com.gitStudy.bean.User;
import com.gitStudy.dao.impl.UserDAOImpl;
import com.gitStudy.service.ServiceFactory;

public class ServiceFactoryImpl implements ServiceFactory {
	private static UserDAOImpl userDAO = new UserDAOImpl();
	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	@Override
	public void deletUser(Integer id) {
		userDAO.deletUser(id);
	}

	@Override
	public User getUser(Integer id) {
		
		return userDAO.getUser(id);
	}

	@Override
	public List<User> userList() {
		return userDAO.userList();
	}

}
