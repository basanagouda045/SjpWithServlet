package com.rc.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
 
	
	public static Connection creatConnection() {
		
		 
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/rc_players_db";
		String userName = "root";
		String password = "Bassu@123";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(url, userName, password);
		
		}
         catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	}

