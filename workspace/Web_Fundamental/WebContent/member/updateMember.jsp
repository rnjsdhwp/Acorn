<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page pageEncoding="utf-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String email = request.getParameter("email");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String tempPage = request.getParameter("page");
	
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = new MemberDTO(email, null, name, phone, null);
	boolean isSuccess = dao.update(dto);
	
	if(isSuccess){%>
		<script>
			alert("회원수정 성공");
			location.href="listMember.jsp?email=<%=email%>&page=<%=tempPage%>";
		</script>
	<%}else{%>
		<script>
			alert("회원수정 실패");
			history.back(-1);
		</script>
	<%}%>