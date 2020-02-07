package com.bridgelabz.designpattern.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgelabz.utils.InputUtility;

public class JDBCInsertdata {

	private static Connection con = null;

	private static PreparedStatement pStmt = null;

	private static ResultSet rs = null;

	final static private String host = "jdbc:mysql:///BridgLabzDemo";
	final static private String uname = "root";
	final static private String pswd = "asd@123#";

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(host, uname, pswd);

			pStmt = con.prepareStatement("insert into employee value (?,?)");

			System.out.println("Enter the employee id");
			pStmt.setInt(1, InputUtility.nextInt());

			System.out.println("Enter the name of employee");
			pStmt.setString(2, InputUtility.nextString());

			int i = pStmt.executeUpdate();

			System.out.println(i + "data inserted in mySQL");

			con.close();

		}

		catch (Exception e) {

		}

	}

}
