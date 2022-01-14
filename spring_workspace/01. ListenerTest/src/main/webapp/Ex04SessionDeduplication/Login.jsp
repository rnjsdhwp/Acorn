<%@page import="com.jin.SessionDeduplication"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	if(SessionDeduplication.setSessions("jin", session)){
		out.print("<script>alert('다른 곳에 로그인된 정보가 있어 해제합니다.');</script>");
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