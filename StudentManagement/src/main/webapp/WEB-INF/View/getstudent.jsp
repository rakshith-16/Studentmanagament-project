<%@page import="com.technoelvate.Controller.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% Student std=(Student)request.getAttribute("mystudent");
   String msg=(String) request.getAttribute("msg");
%>

<%=msg %>
<%=std %>


<body>

</body>
</html>