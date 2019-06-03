package com.gitStudy.test;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gitStudy.bean.User;
import com.gitStudy.dao.impl.UserDAOImpl;
import com.gitStudy.utils.JdbcUtil;

class TestAllMethod {
	//��ʼ��jdbctemplate���Ӽ���
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
		user.setName("����");
		user.setSex("��");
		userDAO.addUser(user);
	}
	
	@Test
	void testDeleteUser() {
		
	}
	
	@Test
	void testGeteUser() {
		
	}
	
	@Test
	void testListUser() {
		
	}
}
