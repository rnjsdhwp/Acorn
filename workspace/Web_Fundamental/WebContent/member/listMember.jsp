<%@ page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../inc/header.jsp" %>
    <!-- container start -->
    <div class="container">
      <!-- 전체 row start -->
      <div class="row">
        <!-- 전체 column(12) start -->
        <div class="col-lg-12">
			<h4>회원리스트</h4>
			<table class="table table-hover">
			  <thead>
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">이메일</th>
			      <th scope="col">이름</th>
			      <th scope="col">핸드폰</th>
			      <th scope="col">가입날짜</th>
			      <th scope="col">수정</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<%
			  		String tempPage = request.getParameter("page");	
			  		int cPage = 0;
			  		int displayCount = 3;
			  		int totalPage = 0;
					int currentBlock = 0;
					int totalBlock = 0;
					int pageDisplayCount = 4;
					int startPage = 0;
					int endPage = 0;
					
			  		if(tempPage == null || tempPage.length()==0){
			  			cPage = 1;
			  		}
			  		try{
			  			cPage = Integer.parseInt(tempPage);
			  		}catch(NumberFormatException e){
			  			cPage = 1;
			  		}
			  		/*
			  					start 	   len
			  		cPage = 1 -> 0    ,     10
			  		cPage = 2 -> 10   ,     10
			  		cPage = 3 -> 20   ,     10
			  		cPage = 4 -> 30   ,     10
			  		
			  		start = 0 , 10 ,20 ,,,,,,,
			  		An = a1 + (n-1)*d (등차수열)
			  		    -> a1 : 0, n : cPage , d : len(displayCount)
			  		start = 0 + (cPage-1)*10;
			  		*/
			  		
			  		MemberDAO dao = MemberDAO.getInstance();
			  		int totalRows = dao.getRows();
			  		
			  		int start = (cPage-1)*displayCount;
			  		
			  		ArrayList<MemberDTO> list = dao.select(start, displayCount);
			  		/*
			  		총갯수 : 128
			  		cpage 1 : 128 127 126 125 124 123 122 121 120 119
			  		cPage 2 : 118 117
			  		
			  		128 , 118 , 108 ...
			  		
			  		An = a1 + (n-1)*d , a1 = 128 , n=cPage, d = -10
			  		*/
			  		
			  		int index = totalRows + (cPage-1)*-displayCount;
			  		//int index = 1 + (cPage-1)*displayCount;
			  		
			  		if(list.size() != 0){
			  		for(int i=0;i<list.size();i++){
			  			MemberDTO dto = list.get(i);
			  	%>
			    <tr>
			      <th scope="row"><%=index-- %></th>
			      <td><a href="viewMember.jsp?email=<%=dto.getEmail()%>&page=<%=cPage%>"><%=dto.getEmail() %></a></td>
			      <td><%=dto.getName() %></td>
			      <td><%=dto.getPhone() %></td>
			      <td><%=dto.getRegdate()%></td>
			      <td>
			      	<a href="javascript:changePwd(
			      	'<%=dto.getEmail() %>','<%=cPage %>')" 
			      	class="btn btn-info">비번수정</a>
			      </td>
			    </tr>
			    	<%} %>
			    <%}else{ %>
			    <tr>
			    	<td colspan="6" class="text-center">회원정보가 존재하지 않습니다.</td>
			    </tr>
			    <%} %>
			  </tbody>
			</table>
			<%
			/*
				총갯수 : 128개 , displayCount :  10개 
				
				Previous 1 2 3 4 5 6 7 8 9 10 Next  => currentBlock : 1 block
				Previous 11 12 13 Next				=> currentBlock : 2 block
			
			*/
				
				
				if(totalRows%displayCount==0){
					totalPage = totalRows/displayCount;
				}else{
					totalPage = totalRows/displayCount +1;
				}
				
				if(totalPage==0){
					totalPage = 1;
				}
			/*
				totalPage = 13;
			
				cPage : 1-10 -> currentBlock : 1
				cPage : 11-13 -> currentBlock : 2
				
				totalPage = 13;
				cPage : 1-5   -> currentBlock : 1
				cPage : 6-10  -> currentBlock : 2
				cPage : 11-13 -> currentBlock : 3
			*/
				
				if(cPage%pageDisplayCount == 0){
					currentBlock = cPage/pageDisplayCount;
				}else{
					currentBlock = cPage/pageDisplayCount +1;
				}
				if(totalPage%pageDisplayCount==0){
					totalBlock = totalPage/pageDisplayCount;
				}else{
					totalBlock = totalPage/pageDisplayCount+1;
				}
				
				/*
					startPage = 1,  11, 21, 31
					endPage =   10, 20, 30, 33
				*/
				
				
				//An = a1 + (n-1)*d
				startPage = 1+(currentBlock-1)*pageDisplayCount;
				endPage = pageDisplayCount + (currentBlock-1)*pageDisplayCount;
				if(currentBlock == totalBlock){
					endPage = totalPage;
				}
				
			 %>
			
			<nav aria-label="Page navigation example">
			  <ul class="pagination justify-content-center">
			  	<%if(currentBlock == 1){ %>
			    <li class="page-item disabled">
			      <a class="page-link">Previous</a>
			    </li>
			    <%}else{ %>
			    <li class="page-item">
			      <a class="page-link" href="listMember.jsp?page=<%=startPage-1%>">Previous</a>
			    </li>
			    <%} %>
			    
			    <%for(int i=startPage ; i<=endPage;i++){ %>
			    <li class="page-item <%if(cPage==i){%>active<%}%>">
			    <a class="page-link" href="listMember.jsp?page=<%=i%>"><%=i %></a>
			    </li>
			    <%} %>
			    
			    <%if(currentBlock==totalBlock){ %>
			    <li class="page-item disabled">
			      <a class="page-link">Next</a>
			    </li>
			    <%}else{ %>
			     <li class="page-item">
			      <a class="page-link" href="listMember.jsp?page=<%=endPage+1%>">Next</a>
			    </li>
			    <%} %>
			    
			    
			    
			  </ul>
			</nav>
			<div class="text-right">
				<a class="btn btn-outline-secondary" href="joinMember.jsp?page=<%=cPage%>">회원가입</a>
			</div>
			
          
        </div>
        <!-- 전체 column(12) end -->
        
      </div>
      <!-- 전체 row end -->
    </div>
    <!-- container end -->
    <script>
    	function changePwd(email, cpage){
    		//alert(email + ","+cpage);
    		location.href="pwdMember.jsp?email="+email+"&page="+cpage;
    	}
    </script>
<%@ include file="../inc/footer.jsp" %>
    
    
    
    
    
    
    
    
    
    
    