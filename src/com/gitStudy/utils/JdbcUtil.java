package com.gitStudy.utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	//��������Դ����
	private static DataSource dataSource ;
	static {
		//�������ӳ�,��ʼ������
		dataSource = new ComboPooledDataSource("sheepConfig");
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
