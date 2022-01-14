<%@page import="com.jin.SessionTest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.setAttribute("userId", "jin");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
set login session<br/>
<a href="Logout.jsp">Logout</a>
</body>
</html>