<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page pageEncoding="utf-8" %>
<%
//	파라미터중에 한글을 지원해주는 기능
	request.setCharacterEncoding("utf-8");

	String email = request.getParameter("email");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = new MemberDTO(email, pwd, name, phone, null);
	//boolean isExisted = dao.isExisted(email);
	boolean isSuccess = dao.insert(dto);
%>
	<%if(isSuccess){%>
		<script>
			alert("회원등록 성공");
			location.href="listMember.jsp?page=1";
		</script>
	<%}else{%>
		<script>
			alert("회원등록 실패");
			history.back(-1);
		</script>
	<%}%>