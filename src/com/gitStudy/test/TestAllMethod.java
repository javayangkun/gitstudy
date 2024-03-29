package com.gitStudy.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gitStudy.bean.User;
import com.gitStudy.dao.impl.UserDAOImpl;
import com.gitStudy.utils.JdbcUtil;

class TestAllMethod {
	// 初始化jdbctemplate连接技术
	private static JdbcTemplate jdbctemplate = new JdbcTemplate(JdbcUtil.getDataSource());
	private static UserDAOImpl userDAO = new UserDAOImpl();
	@Test
	void testConnection() {
		System.out.println(jdbctemplate);
	}
	
	@Test
	void testAddUser() {
		User user = new User();
		user.setId(1);
		user.setName("李宁");
		user.setSex("男");
		userDAO.addUser(user);
	}
	
	@Test
	void testDeleteUser() {
		userDAO.deletUser(1);
	}
	
	@Test
	void testGeteUser() {
		User user = userDAO.getUser(1);
		System.out.println(user);
	}
	
	@Test
	void testListUser() {
		List<User>users = userDAO.userList();
		System.out.println(users);
	}
}
