<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	/* 
		request를 통해 session을 얻어올 수 있으며
		내부 인자가 true인 경우 session이 없으면 별도로 생성하고
		false면 별도로 생성하지 않고 null을 반환한다.
	*/
	HttpSession topSession = request.getSession(false);
	String sessionId = (String)topSession.getAttribute("id");
	//session을 식별하기 위한 고유 ID 정보
	//System.out.println("getId : "+topSession.getId());
	//사용자가 등록한 ID 정보
	//System.out.println("sessionId : "+sessionId);
%>
<c:url var="urlHome" value="/" />
<style type="text/css">
<!--

a:link{color:black;font-family:sans-serif;text-decoration:none;}
a:visited{color:black;font-family:sans-serif;text-decoration:none;}
a:hover{color:#cc3300; font-weight:bold; }
a:active{color:#ff00cc; text-decoration:underline; }
-->
</style>

<table width=800>
	<tr><td align="center" colspan=5><h1>CARE Lab</h1></td></tr>
	<tr align="right">
		<td width=600></td>
		<td><a href="${urlHome }index?formPath=home">홈</a></td>
		<% if(sessionId == null){ %>
			<td><a href="${urlHome }index?formPath=login">로그인</a></td>
			<td><a href="${urlHome }index?formPath=membership">회원가입</a></td>
		<% }else{ %>
			<td><a href="${urlHome }login/logout">로그아웃</a></td>
			<td><a href="${urlHome }board/boardProc">게시판</a></td>
		<% } %>
	</tr>
	<tr><td align="center" colspan=5><hr/></td></tr>
</table>

