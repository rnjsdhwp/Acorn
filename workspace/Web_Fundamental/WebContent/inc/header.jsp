<%@page import="kr.co.acorncampus.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	MemberDTO memberDto  = (MemberDTO)session.getAttribute("member");
	String uri = request.getRequestURI();
	
%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    
    <title></title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark" 
      style="background-color:#7952b3 !important; margin-bottom: 10px;">
      <a class="navbar-brand" href="#">에이콘캠퍼스</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarScroll">
        <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
          <li class="nav-item <%if(uri != null && uri.startsWith("/member")){%> active <%}%>">
            <a class="nav-link"  href="/member/listMember.jsp?page=1">회원관리 <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item <%if(uri != null && uri.startsWith("/shorten")){%> active <%}%>">
            <a class="nav-link"  href="/shorten/index.jsp">Shorten URL <span class="sr-only">(current)</span></a>
          </li>
        </ul>
      </div>
      <div>
      	<span class="navbar-text">
      		<%if(memberDto == null){ %>
      		<a href="/member/login.jsp">로그인</a> | 
      		<a href="/member/joinMember.jsp">회원가입</a>
      		<%}else{ %>
      		<%=memberDto.getName() %>님 안녕하세요 
      		[<span id="sessionTime"></span>] | 
      		<a href="/member/logout.jsp">로그아웃</a>
      		<%} %>
      	</span>
      </div>
    </nav>
    <script>
    	let time = <%=session.getMaxInactiveInterval()%>;
    	let minute = "";
    	let second = "";
    	
    	minute = parseInt(time/60);
		second = time%60;
    	$("#sessionTime").html(minute+"분"+second+"초");
    	
    	const x = setInterval(function(){
    		time--;
    		minute = parseInt(time/60);
    		second = time%60;
    		$("#sessionTime").html(minute+"분"+second+"초");
    		if(time<0){
    			clearInterval(x);
    			location.href="/member/login.jsp";
    		}
    	},1000);
    	
		$(function(){
    		$("title").text($(".container .row .col-lg-12 h4").text());
    	});
    	
    </script>
    
    
    
    
	