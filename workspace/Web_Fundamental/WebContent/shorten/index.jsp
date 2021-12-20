<%@page import="kr.co.acorncampus.util.ApiExamShortenUrl"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../inc/header.jsp" %>
<%
	String ourl = request.getParameter("ourl");
	String surl = "";
	if(ourl != null && ourl.length()>0){
		surl = ApiExamShortenUrl.getUrl(ourl);	
	}else{
		ourl = "";
	}
%>
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(12) start -->
        <div class="col-lg-12">
			<!--form start-->
              <h4>Shorten URL</h4>
              <form method="post" action="index.jsp" name="f">
                <div class="form-group">
                  <label for="ourl">Original URL </label>
                  <input type="url" class="form-control" id="ourl" name="ourl" value="<%=ourl%>">
                </div>
                <div class="form-group">
                  Shorten URL : <a href="<%=surl %>" target="_blank"><%=surl %></a>
                </div>
               </form>
              
              <div class="text-right">
              	<a class="btn btn-outline-primary" id="changeUrl">변환</a>
              	
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
    		$("#changeUrl").click(function(){
    			let ourl = $("#ourl").val();
    			if(ourl==""){
    				alert("Original URL를 입력하세요");
    				$("#ourl").focus();
    				return;
    			}
    			f.submit();
    		});
    		
    	});
    </script>
    
    
    
    
    
    <%@ include file="../inc/footer.jsp" %>
    
    
    