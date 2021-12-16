<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@page pageEncoding="utf-8"%>

<%
	String id = (String)session.getAttribute("id");
	//String name = (String)session.getAttribute("name");
	MemberDTO dto = (MemberDTO)session.getAttribute("member");
	String email=null;
	String name=null;
	String phone=null;
	
	if(dto != null){
		email = dto.getEmail();
		name = dto.getName();
		phone = dto.getPhone();
	}
%>

session id : <%=session.getId()%><br>
id : <%=id%> <br>
email : <%=email %><br>
name : <%=name %><br>
phone : <%=phone %><br>

<a href="demo2.jsp">demo2.jsp</a><br>
<a href="logout.jsp">logout.jsp</a>