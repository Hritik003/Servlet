<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=red>
		
		<%
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		out.println("You have successfully logged into your session as :" + user);
		
		
		
		
		%>

</body>
</html>