<%@page import="com.jin.SessionDeduplication"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	if(SessionDeduplication.setSessions("jin", session)){
		out.print("<script>alert('�ٸ� ���� �α��ε� ������ �־� �����մϴ�.');</script>");
		session.removeAttribute("userId");
	}
	session.setAttribute("userId", "jin");
	SessionDeduplication.getSessions();
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