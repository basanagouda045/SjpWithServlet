<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="welcome.css">
</head>
<body>

  
<% 	
		String getMsg = (String) request.getAttribute("message");
		System.out.println("getMsg:" +getMsg);
		
		
		if(getMsg != null){
			//display the data
			
			%>
			 
			 <h1 style="color:green"><%=getMsg%></h1>
			
			
		 <%
		  }
		
		%>
		
		

</body>
</html>