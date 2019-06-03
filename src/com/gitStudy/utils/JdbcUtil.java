package com.gitStudy.utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	//创建数据源对象
	private static DataSource dataSource ;
	static {
		//创建连接池,初始化连接
		dataSource = new ComboPooledDataSource("sheepConfig");
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
