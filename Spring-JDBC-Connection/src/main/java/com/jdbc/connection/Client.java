package com.jdbc.connection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCconnection jdbCconnection = context.getBean("Jdbc-connection" , JDBCconnection.class);
		jdbCconnection.connectionDetails();
		jdbCconnection.getJDBCConnection();
	}
	
}

