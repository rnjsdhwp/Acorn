<%@ page pageEncoding="utf-8" %>

<%-- 
	include directive : 변역시점에 인클루드되기 때문에 속도는 빠르나 자바 변수 충돌이 발생함
 --%>
<%-- <%@ include file="header.jsp" --%>

<%-- 
	include action : 실행시점에 인클루드되기 때문에 속도는 느리나 자바 변수 충돌이 발생하지 않음
 --%>
<jsp:include page="header.jsp"/>

<%
	int age=10;
%>

<div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(10) start -->
        <div class="col-lg-12">
			<!--form start-->
              
            <!--form end-->
          
          
        </div>
        <!-- 전체 column(10) end -->

        
      </div>
      <!-- 전체 row end -->
    </div>

<%@ include file="footer.jsp" %>