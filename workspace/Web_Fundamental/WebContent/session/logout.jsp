<%@page pageEncoding="utf-8"%>

<%
//	HttpSession 객체를 메모리 삭제
	session.invalidate();
%>

<a href="demo2.jsp">demo2.jsp</a><br>
<a href="demo3.jsp">demo3.jsp</a><br>
<a href="logout.jsp">logout.jsp</a>