package com.rc.model;

public class Player {
 
	


	private int id;
	private String pName;
	private String team;
	private int jersey;
	private long phone;
	private String email;
	private String password;
	private String role;
	
	
	
	public Player() {
		
	}
	

	public Player(int id, String pName, String team, int jersey, long phone, String email, String password,
			String role) {
		super();
		this.id = id;
		this.pName = pName;
		this.team = team;
		this.jersey = jersey;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	
	
	public Player( String pName, String team, int jersey,long phone, String email, String password) {
		
		this.pName = pName;
		this.team = team;
		this.jersey = jersey;
		this.email = email;
		this.password = password;
		this.phone=phone;
		
	}
	
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone=phone;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}



	public int getJersey() {
		return jersey;
	}


	public void setJersey(int jersey) {
		this.jersey = jersey;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", pName=" + pName + ", team=" + team + ", jersey=" + jersey + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}


}
