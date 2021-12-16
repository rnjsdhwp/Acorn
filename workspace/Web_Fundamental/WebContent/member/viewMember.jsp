<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page language="java" pageEncoding="utf-8"%>

<%@ include file="../inc/header.jsp" %>
    
<%
	String email = request.getParameter("email");
	String tempPage = request.getParameter("page");
	if(tempPage == null || tempPage.length() == 0){
		tempPage = "1";
	}
	int cPage = 0;
	try{
		cPage = Integer.parseInt(tempPage);
	}catch(NumberFormatException e){
		cPage = 1;
	}
	
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = dao.select(email);
	
	String name = dto.getName();
	String phone= dto.getPhone();
%>
    
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(10) start -->
        <div class="col-lg-12">
			<!--form start-->
              <h4>회원상세정보</h4>
              <form method="post" name="f">
                <div class="form-group">
                  <label for="email">이메일</label>
                  <input type="email" class="form-control" id="email" name="email" value="<%=email%>" readonly>
                </div>
                <div class="form-group">
                  <label for="name">이름 </label>
                  <input type="text" class="form-control" id="name" name="name" value="<%=name%>">
                </div>
                <div class="form-group">
                  <label for="phone">핸드폰</label>
                  <input type="tel" class="form-control" id="phone" name="phone" value="<%=phone%>">
                </div>
                <input type="hidden" name="page" value="<%=cPage%>"/>
              </form>
              
              <div class="text-right">
              	<a class="btn btn-outline-primary" id="updateMember">수정</a>
              	<a class="btn btn-outline-danger" id="deleteMember">삭제</a>
              	<a class="btn btn-outline-secondary" href="listMember.jsp?page=<%=cPage%>">회원리스트</a>
              </div>
        </div>

        
      </div>
      <!-- 전체 row end -->
    </div>
    <!-- container end -->
    <script>
    	$(function(){
    		$("#updateMember").click(function(){
    			f.action = "updateMember.jsp";
    			f.submit();
    		});
			$("#deleteMember").click(function(){
				f.action = "deleteMember.jsp";
    			f.submit();
    		});
    	});
    </script>
    
<%@ include file="../inc/footer.jsp" %>