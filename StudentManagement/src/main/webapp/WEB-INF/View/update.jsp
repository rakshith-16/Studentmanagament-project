<%@page import="com.technoelvate.Controller.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Student std=(Student) request.getAttribute("mystudent"); 
  String msg=(String)request.getAttribute("msg");
%>
<body>
<%=msg %>

</body>
</html>