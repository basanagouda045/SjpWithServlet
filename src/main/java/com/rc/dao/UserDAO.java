package com.rc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rc.jdbc_connection.DB_Connection;
import com.rc.model.Player;

public class UserDAO {
	
	
 
	public int signUpUser(Player p) {
		Connection con = DB_Connection.creatConnection();

	    int res = 0;

	    try {

	        PreparedStatement pstmt = con.prepareStatement(
	            "INSERT INTO PLAYERS_TABLE " +
	            "(name, team, jersey, phone, email, password, role) " +
	            "VALUES (?, ?, ?, ?, ?, ?, ?)"
	        );

	        pstmt.setString(1, p.getpName());
	        pstmt.setString(2, p.getTeam());
	        pstmt.setInt(3, p.getJersey());
	        pstmt.setLong(4, p.getPhone());
	        pstmt.setString(5, p.getEmail());
	        pstmt.setString(6, p.getPassword());
	        pstmt.setString(7, p.getRole());

	        res = pstmt.executeUpdate();

	    } catch (SQLException e) {

	        e.printStackTrace();

	    }

	    return res;
	
}

	public int loginuser(Player p) {
		Connection con  = DB_Connection.creatConnection();
		int res=0;
		try {
			PreparedStatement pstmt = con.prepareStatement("SELECT COUNT(*) FROM PLAYERS_TABLE WHERE email = ? AND password = ?");
			pstmt.setString(1, p.getEmail());
			pstmt.setString(2, p.getPassword());
			
			ResultSet rs=pstmt.executeQuery();
			
			if (rs.next()) {
				res=rs.getInt(1);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
	}
	
	
	public Player login(String email, String pwd) {
		
		Player p = null;
		
		// we need to check email is registed or not;
		
		String query = "select * from PLAYERS_TABLE where email=?";
		PreparedStatement pstmt = null;
		ResultSet res = null;
		Connection con = DB_Connection.creatConnection();
		
		boolean  isRegistered  =  checkUserByEmail(email);
		
		if(isRegistered) {
			
			try {
				pstmt = con.prepareStatement(query);
				pstmt.setString(1,email);
				res = pstmt.executeQuery();
				
				
				while(res.next()) {
					
					int pid = res.getInt(1);
					String pName = res.getString(2);
					String tname = res.getString(3);
 					int jersey = res.getInt(4);
 					long phone = res.getLong(5);
 					String storedEmail = res.getString(6);
 					String passwrod = res.getString(7);
 					String role = res.getString(8);
 					
					
					// create the player object
 					
 					//all arg constructor
					//p = new Player(pid, pName, tname, jersey, phone, storedEmail, password, role);
					
					p = new Player( pName, tname, jersey, phone, storedEmail, passwrod);
					p.setId(pid);
					p.setRole(role);
					
					
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		else {
			
			
		}
		
		
		return p;
	}
	
	
	public boolean checkUserByEmail(String email) {
		
		boolean isRegistered = false;
		
		
		String query = "select * from PLAYERS_TABLE where email=?";
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		Connection con = DB_Connection.creatConnection();
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,email);
			res = pstmt.executeQuery();
			
			while(res.next()) {
				isRegistered = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return isRegistered;
	}
}