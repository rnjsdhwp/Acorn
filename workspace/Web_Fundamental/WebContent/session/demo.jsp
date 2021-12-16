<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@page pageEncoding="utf-8"%>

<%
//	세션시간 변경(밀리세컨드)
	session.setMaxInactiveInterval(10);
//	세션시간 가져오기(반환값은 밀리세컨드)
	int sessionMiliTime = session.getMaxInactiveInterval();
	session.setAttribute("id", "syh1011");
	session.setAttribute("name", "성영한");
	
	MemberDTO dto = new MemberDTO("email1@a.com",null,"이름100","010-5555-5555",null);
	session.setAttribute("member", dto);
%>

session time : <%=sessionMiliTime %>초<br>
session id : <%=session.getId()%><br>

<a href="demo2.jsp">demo2.jsp</a><br>
<a href="demo3.jsp">demo3.jsp</a><br>
<a href="logout.jsp">logout.jsp</a>