package com.beanlifecycle.annotation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDAO {
	
	private String driver;
	private String url;
	private String username;
	private String password ;
	
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void init() throws ClassNotFoundException, SQLException {
		createStudentDBConnection();
	}

	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		// load driver
		Class.forName(driver);

		// get a connect
		con = DriverManager.getConnection(url, username, password);
	}
	

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		System.out.println("Retrieving all students data..");
		//execute query
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from HostelStudentInfo;"); 
				
		while(rs.next()) {
			int StudentId = rs.getInt(1);
			String StudentName = rs.getString(2);
			String HostelFee = rs.getString(3);
			String FoodType = rs.getString(4);
			
			System.out.println(StudentId + " " + StudentName + " " + HostelFee + " " + FoodType);
		}
		
	}
	
	public void deleteStudentRecord(int Studentid) throws SQLException, ClassNotFoundException {

				//execute query
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("delete from HostelStudentInfo where Student_id = "+ Studentid); 
				
				System.out.println("Record deleted with the id = " + Studentid);
				// closing the connection
				
	}
	
	public void closeConnection() throws SQLException {
		con.close();
	}
		
	
}
