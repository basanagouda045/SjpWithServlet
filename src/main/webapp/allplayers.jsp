<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="com.rc.model.Player" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>all players</title>
</head>
<body>
 
<h1>All players</h1>
 
 
 <table border="1">
 <thead>
 <tr>
 <th>ID</th>
 <th>NAME</th>
 <th>TEAM</th>
 <th>JERSEY</th>
 <th>PHONE</th>
 <th>EMAIL</th>
 <th>PASSWORD</th>
 <th>ROLE</th>
 
 </tr>
 </thead>
 
 <% 
 List<Player>  players  = (List<Player>) request.getAttribute("allplayers");
 
  if(players != null){
	  
  
     for (Player p : players){
	  
	  %>
	  
	  <tbody>
	  
	  <tr>
	  <td> <%= p.getId() %> </td>
	  <td> <%= p.getpName() %> </td>
	  <td> <%= p.getTeam() %>  </td>
	  <td> <%= p.getJersey() %> </td>
	  <td> <%= p.getPhone() %> </td>
	  <td> <%= p.getEmail() %> </td>
	  <td> <%= p.getPassword() %> </td>
	 
	  <td> <%= p.getRole()%> </td>
	  	  	  	  	  	  	  
	  
	  </tr>
	  
	  </tbody>
	  
	  
	  <% 
     }
  }
 
 
 %>
 </table>
</body>
</html>