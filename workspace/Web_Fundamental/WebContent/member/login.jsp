<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../inc/header.jsp" %>
<%
	String uriParam = request.getParameter("uri");
	if(uriParam == null || uriParam.length()==0){
		uriParam = "";
	}
%>
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(12) start -->
        <div class="col-lg-12">
			<!--form start-->
              <h4>로그인</h4>
              <form method="post" action="checkLogin.jsp" name="f">
                <div class="form-group">
                  <label for="email">이메일</label>
                  <input type="email" class="form-control" id="email" name="email">
                </div>
                <div class="form-group">
                  <label for="pwd">비밀번호</label>
                  <input type="password" class="form-control" id="pwd" name="pwd">
                </div>
                <input type="hidden" name="uri" value="<%=uriParam%>"/>
               </form>
              
              <div class="text-right">
              	<a class="btn btn-outline-primary" id="checkLogin">로그인</a>
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
    		$("#checkLogin").click(function(){
    			document.f.submit();
    		});
    		
    	});
    </script>
    
    
    
    
    
    <%@ include file="../inc/footer.jsp" %>
    
    
    