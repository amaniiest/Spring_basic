package com.jdbc.connection;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

import com.sun.jdi.connect.spi.Connection;

public class JDBCconnection {
	@Value("${mysql.username}")
	private String userName;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.driver}")
	private String driver;

	@Value("${mysql.url}")
	private String url;

	public void connectionDetails() {
		System.out.println("Username = " + userName);
		System.out.println("password = " + password);
		System.out.println("driver = " + driver);
		System.out.println("url = " + url);
	}

	public void getJDBCConnection() throws Exception {
		Class.forName("${mysql.driver}");
		Connection connection = (Connection) DriverManager.getConnection("${mysql.url}", "${mysql.usernam}",
				"${mysql.password}");
		System.out.println("Connection successfull " + connection);
	}
}
