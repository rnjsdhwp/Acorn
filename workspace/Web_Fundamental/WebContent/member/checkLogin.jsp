<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page pageEncoding="utf-8" %>
<%
	String email = request.getParameter("email");
	String pwd = request.getParameter("pwd");
	String uri = request.getParameter("uri");
	if(uri == null || uri.length()==0){
		uri = "/member/listMember.jsp";
	}
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = dao.select(email, pwd);
	if(dto != null){
		//세션 시간 설정
		session.setMaxInactiveInterval(10*60);
		//세션부여
		session.setAttribute("member",dto);
		response.sendRedirect(uri);
	}else{
		//에러 메세지
		%>
		<script>
		alert('이메일 또는 비밀번호를 확인하세요');
		history.back(-1);
		</script>
		<%
	}

%>

