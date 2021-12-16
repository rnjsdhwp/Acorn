<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page pageEncoding="utf-8"%>

<%
	String email = request.getParameter("email");
	String tempPage = request.getParameter("page");
	String pwd = request.getParameter("pwd");
	String newPwd = request.getParameter("newpwd");
	
	MemberDAO dao = MemberDAO.getInstance();
	
	boolean isExisted = dao.isExisted(email, pwd);
	if(isExisted){
		boolean isSuccess = dao.update(email, newPwd);
		if(isSuccess){%>
			<script>
				alert("비밀번호 수정 성공");
				location.href="listMember.jsp?page=<%=tempPage%>";
			</script>
		<% }else{%>
			<script>
				alert("비밀번호 수정 실패");
				hitory.back(-1);
			</script>
		<% }
	}else{%>
		<script>
			alert("잘못된 비밀번호입니다.");
			history.back(-1);
		</script>
	<%}
%>