package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	public static Connection con;
	public static Connection loginCon;	
		public Connector(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Driver loaded");
			
			
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost/info","root","singh");
				loginCon=DriverManager.getConnection("jdbc:mysql://localhost/user","root","singh");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Connection Obtained");
			
		}
}
