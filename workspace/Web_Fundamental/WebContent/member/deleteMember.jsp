<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page pageEncoding="utf-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String email = request.getParameter("email");
	String tempPage = request.getParameter("page");
	
	MemberDAO dao = MemberDAO.getInstance();
	boolean isSuccess = dao.delete(email);
	
	if(isSuccess){%>
		<script>
			alert("회원삭제 성공");
			location.href="listMember.jsp?page=<%=tempPage%>";
		</script>
	<%}else{%>
		<script>
			alert("회원삭제 실패");
			history.back(-1);
		</script>
	<%}
%>