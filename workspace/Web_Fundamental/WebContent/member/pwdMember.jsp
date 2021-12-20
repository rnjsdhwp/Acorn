<%@page import="java.net.URLEncoder"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../inc/header.jsp" %>
<%
	//String uri = request.getRequestURI();
	if(memberDto == null){
		//경고창 띄우고 로그인 페이지 이동
		String queryString = request.getQueryString();
		uri = uri+"?"+queryString;
		%>
		<script>
		alert('로그인이 필요한 페이지 입니다.');
		location.href="/member/login.jsp?uri=<%=URLEncoder.encode(uri)%>";
		</script>
		<%
	}else{
%>
<%
	String tempPage = request.getParameter("page");
	String email = request.getParameter("email");
	
	if(tempPage == null || tempPage.length()==0){
		tempPage = "1";
	}
	int cPage = 0;
	try{
		cPage = Integer.parseInt(tempPage);
	}catch(NumberFormatException e){
		cPage = 1;
	}
	
%>
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(12) start -->
        <div class="col-lg-12">
			<!--form start-->
              <h4>비밀번호 수정</h4>
              <form method="post" action="updatePwdMember.jsp" name="f">
                
                <div class="form-group">
                  <label for="pwd">이전 비밀번호</label>
                  <input type="password" class="form-control" id="pwd" name="pwd">
                </div>
                
                <div class="form-group">
                  <label for="newpwd">새 비밀번호</label>
                  <input type="password" class="form-control" id="newpwd" name="newpwd">
                </div>
                
                <div class="form-group">
                  <label for="okpwd">새 비밀번호 확인</label>
                  <input type="password" class="form-control" id="okpwd" name="okpwd">
                </div>
                <input type="hidden" name="email" value="<%=email%>"/>
                <input type="hidden" name="page" value="<%=tempPage%>"/>
               </form>
              
              <div class="text-right">
              	<a class="btn btn-outline-primary" id="updatePwdMember">비밀번호수정</a>
              	<a class="btn btn-outline-secondary" href="listMember.jsp?page=<%=cPage%>">회원리스트</a>
              </div>
              <!--form end-->
          
        </div>
        <!-- 전체 column(12) end -->
        
      </div>
      <!-- 전체 row end -->
    </div>
    <!-- container end -->
    <script>
    	$(function(){
    		$("#updatePwdMember").click(function(){
    			let pwd = $("#pwd").val();
    			let newpwd = $("#newpwd").val();
    			let okpwd = $("#okpwd").val();
    			
    			if(pwd==""){
    				alert("비밀번호를 입력하세요");
    				$("#pwd").focus();
    				return;
    			}
    			if(newpwd==""){
    				alert("새 비밀번호를 입력하세요");
    				$("#newpwd").focus();
    				return;
    			}
    			if(okpwd==""){
    				alert("새 비밀번호 확인을 입력하세요");
    				$("#okpwd").focus();
    				return;
    			}
    			
    			if(newpwd!=okpwd){
    				alert("비밀번호가 일치하지 않습니다");
    				$("#okpwd").val("");
    				$("#okpwd").focus();
    				return;
    			}
    			
    			f.submit();
    		});
    		
    	});
    </script>
    
    <%@ include file="../inc/footer.jsp" %>
    
  <%} %>  
    