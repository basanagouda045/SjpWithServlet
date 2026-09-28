package com.rc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rc.jdbc_connection.DB_Connection;
import com.rc.model.Player;

public class AdminDAO {
	
	public List<Player> getAllPlayers() {
		
		
		
		List<Player> list = new ArrayList<Player>();
		

		Player p = null;
		
	
		
		String query = " select * from PLAYERS_TABLE where role='user'";
		PreparedStatement pstmt = null;
		ResultSet res = null;
		Connection con = DB_Connection.creatConnection();
		
		try {
			pstmt = con.prepareStatement(query);
			res = pstmt.executeQuery();
		
		

		while(res.next()) {
			
			int pid = res.getInt(1);
			String pName = res.getString(2);
			String tname = res.getString(3);
				int jersey = res.getInt(4);
				long phone = res.getLong(5);
				String storedEmail = res.getString(6);
				String password = res.getString(7);
				String role = res.getString(8);
				
		p = new Player(pid,  pName,  tname, jersey,  phone,  storedEmail,  password,
						 role);
		
		list.add(p);
		
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

}
