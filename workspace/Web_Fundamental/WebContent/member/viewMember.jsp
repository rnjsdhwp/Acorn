<%@ page language="java" pageEncoding="utf-8"%>

<%@ include file="../inc/header.jsp" %>
    
    
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(10) start -->
        <div class="col-lg-12">
			<!--form start-->
              <h6>회원상세정보</h6>
              <form method="post" action="">
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
                
                <button type="submit" class="btn btn-primary">저장</button>
              </form>
              <!--form end-->
          
          
        </div>
        <!-- 전체 column(10) end -->

        
      </div>
      <!-- 전체 row end -->
    </div>
    <!-- container end -->
    
    
<%@ include file="../inc/footer.jsp" %>