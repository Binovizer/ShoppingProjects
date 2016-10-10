package com.binovizer.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public interface CommonDAO {
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			ResourceBundle rb  = ResourceBundle.getBundle("db");
			String dbStr = rb.getString("dbUrl");
			String UserName = rb.getString("dbUserName");
			String Pass = rb.getString("dbPass");
			con = DriverManager.getConnection(dbStr,UserName,Pass);
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
