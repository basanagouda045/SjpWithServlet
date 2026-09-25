<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=stylesheet href="signUp.css">
</head>
<body>

 
		<% 	
		String getMsg = (String) request.getAttribute("message");
		String error=(String) request.getAttribute("error");

		
		
		if(getMsg != null){
			//display the data
			
			%>
			 
			 <h1 style="color:red"><%=getMsg%></h1>
			
			
		 <%
		  }
		 
        if(error!=null){
        	%>
        
            <h3 style="color:red"><%= error %></h3>
        	
        	<% 
        }
		
		%>
			
 <h1 style="color:green">SignUp Page</h1>
 
 <form action="signUp" method="post" >
    
    <label>Name:</label>
    <input type="text"  placeholder="Enter playerName" name="pname" >
    <br/>
    <br/>
     <label>Team:</label>
    <input type="text"  placeholder="Enter Team" name="tname" >
    <br/>
    <br/>
     <label>Jersey No:</label>
    <input type="text"  placeholder="Enter jerseyNo" name="jersey" >
    <br/>
    <br/>
     <label>Phone :</label>
    <input type="text"  placeholder="Enter phonenumber" name="phone" >
    <br/>
    <br/>
     <label>Email :</label>
    <input type="text"  placeholder="Enter email" name="email" >
    <br/>
    <br/>
     <label>Passsword :</label>
    <input type="text"  placeholder="Enter password" name="password" >
    <br/>
    <br/>
     <label>Confirm Password :</label>
    <input type="text"  placeholder="confirm password" name="cp" >
    <br/>
    <br/>
    
   <button type="submit">Register</button>

 </form>
</body>
</html>
