<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>player's management</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 
 
	<% String msg = (String) request.getAttribute("message"); 
	
		if (msg !=null){
			%>			
			<h2 style="color:green"><%=msg%></h2>
			<% 
		}
	%>
	


<nav id="navbar">

 <img src="https://cdn.vectorstock.com/i/500p/62/20/cricket-club-logo-concept-vector-58456220.jpg">
 <h2></h3>
 
 <a href="signUp.jsp">Sign Up</a>
 <a href="Userlogin.jsp">User Login</a>
 <a href="Admin.jsp">Admin Login</a>


</nav> 

 <h1>Players Management System</h1>
 
 <footer>All Rights Reserved @2026</footer>
 
</body>
</html>