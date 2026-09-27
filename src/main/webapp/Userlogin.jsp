<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="userlogin.css">
</head>
<body>

<% 	
		String getMsg = (String) request.getAttribute("successMsg");
        String message = (String) request.getAttribute("error");
		System.out.println("getMsg:" +getMsg);
		
		
		if(getMsg != null){
			//display the data
			
			%>
			 
			 <h1 style="color:green"><%=getMsg%></h1>
			
			
		 <%
		  }

		if(message != null){
			//display the data
			
			%>
			 
			 <h1 style="color:red"><%=message%></h1>
			
			
		 <%
		  }
		
		
		%>
		 
		 <h2 style="color:blue">Welcome to login page</h2>
		
		<form action="login" method="post">
		
		
		<label> Email</label>
		<input type="text" name="email">
		<br>
		<br>
		<label> Password</label>
		<input type="text" name="password">
		<br>
		<br>
		 <button type="submit">Login</button>
		
		
		 </form>

</body>
</html>