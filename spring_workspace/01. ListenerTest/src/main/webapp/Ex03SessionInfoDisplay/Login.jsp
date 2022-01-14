<%@page import="com.jin.SessionInfoDisplay"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.setAttribute("userId", "jin");
	SessionInfoDisplay.getSessions();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
set login session
</body>
</html>