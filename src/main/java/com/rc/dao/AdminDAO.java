package com.rc.dao;

import java.util.ArrayList;
import java.util.List;

import com.rc.model.Player;

public class AdminDAO {
	
	public List<Player> getAllPlayers() {
		
		String  query = "select * from  PLAYERS_TABLE";
		
		List<Player> list = new ArrayList<Player>();
		
		//preparedstatement
		//execute
		//resultset
		//add to list
		
		return list;
	}

}
