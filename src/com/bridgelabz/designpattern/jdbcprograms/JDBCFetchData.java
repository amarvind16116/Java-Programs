package com.bridgelabz.designpattern.jdbcprograms;

import java.sql.*;

public class JDBCFetchData {

	private static Connection con = null;
	
	private static Statement stmt = null;

	private static ResultSet rs = null;
	
	final static private String host = "jdbc:mysql:///BridgLabzDemo";
	final static private String uname = "root";
	final static private String pswd = "asd@123#";
	
	public static void main(String[] args) {
		
		try {
			
			// This will load the MySQL driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Setup the connection with the DB
			con = DriverManager.getConnection(host,uname,pswd);
			
			// allow to issue SQL queries to the database
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select * from employee");
			
			while(rs.next())
			{
				System.out.println("Emp ID : "+rs.getInt(1)+" Emp Name : "+rs.getString(2));
				con.close();
			}	
		}
		catch(Exception e)
		{
			
		}	
	}

}
