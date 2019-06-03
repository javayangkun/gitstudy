package com.gitStudy.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gitStudy.bean.User;
import com.gitStudy.dao.IUserDAO;
import com.gitStudy.utils.JdbcUtil;

public class UserDAOImpl implements IUserDAO {
	// 初始化jdbctemplate连接技术
	private static JdbcTemplate jdbctemplate = new JdbcTemplate(JdbcUtil.getDataSource());

	@Override
	public void addUser(User user) {
		String sql = "insert into User values(?,?,?)";
		jdbctemplate.update(sql,user.getId(),user.getName(),user.getSex());
	}

	@Override
	public void deletUser(Integer id) {
		String sql = "delete from User where id= ?";
		jdbctemplate.update(sql,id);
	}

	@Override
	public User getUser(Integer id) {
		String sql = "select * from User where id = ?";
		List<User> users = jdbctemplate.query(sql, new  BeanPropertyRowMapper<User>(User.class),id);
		return users!=null?users.get(0):null;
	}

	@Override
	public List<User> userList() {
		String sql = "select * from User";
		List<User> users = jdbctemplate.query(sql, new  BeanPropertyRowMapper<User>(User.class));
		return users;
	}

}
