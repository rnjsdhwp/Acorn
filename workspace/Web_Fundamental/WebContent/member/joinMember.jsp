<%@ page language="java" pageEncoding="utf-8"%>

<%@ include file="../inc/header.jsp" %>
    
<%
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
%>
    
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(10) start -->
        <div class="col-lg-12">
			<!--form start-->
              <h6>회원가입</h6>
              <form method="post" action="saveMember.jsp" name="f">
                <div class="form-group">
                  <label for="email">이메일</label>
                  <input type="email" class="form-control" id="email" name="email">
                </div>
                <div class="form-group">
                  <label for="pwd">비밀번호</label>
                  <input type="password" class="form-control" id="pwd" name="pwd">
                </div>
                <div class="form-group">
                  <label for="name">이름 </label>
                  <input type="text" class="form-control" id="name" name="name">
                </div>
                <div class="form-group">
                  <label for="phone">핸드폰</label>
                  <input type="tel" class="form-control" id="phone" name="phone">
                </div>  
              </form>
              
              <div class="text-right">
              	<a class="btn btn-outline-primary" id="saveMember">저장</a>
              	<a class="btn btn-outline-secondary" href="listMember.jsp?page=<%=cPage%>">회원리스트</a>
              </div>
              <!--form end-->
          
          
        </div>
        <!-- 전체 column(10) end -->

        
      </div>
      <!-- 전체 row end -->
    </div>
    <!-- container end -->
    <script>
    
	    $(function(){
	    	$("#saveMember").click(function(){
	   			f.submit();
	   		});
	    });
    </script>
    
<%@ include file="../inc/footer.jsp" %>