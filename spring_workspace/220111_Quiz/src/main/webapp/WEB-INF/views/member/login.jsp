<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="loginURL" value="login">
	<c:param name="categoryId">1</c:param>
	<c:param name="categoryName">login</c:param>
	<c:param name="description">로그인 페이지</c:param>
</c:url>
<c:url var="myPageURL" value="myPage">
	<c:param name="categoryId">2</c:param>
	<c:param name="categoryName">myPage</c:param>
	<c:param name="description">내 정보 페이지</c:param>
</c:url>
<c:url var="emailURL" value="email">
	<c:param name="categoryId">3</c:param>
	<c:param name="categoryName">email</c:param>
	<c:param name="description">email 페이지</c:param>
</c:url>
<c:url var="introURL" value="intro">
	<c:param name="categoryId">4</c:param>
	<c:param name="categoryName">intro</c:param>
	<c:param name="description">서울소개 페이지</c:param>
</c:url>
<c:url var="joinURL" value="join">
	<c:param name="categoryId">5</c:param>
	<c:param name="categoryName">join</c:param>
	<c:param name="description">시민참여 페이지</c:param>
</c:url>

<html>
	<head>
		<title>login</title>
		<style>
		<!--
		.seoul-common-wrap {
			position: relative;
			z-index: 100;
			height: 45px;
			background: #5474c0;
		}
		
		.seoul-common-inner {
			position: relative;
			width: 100%;
			max-width: 940px;
			margin: 0 auto;
		}
		
		.gnb-wrap {
			position: absolute;
			left: 215px;
			top: 0px;
			height: auto;
			z-index: 100;
			width: 730px;
		}
		
		.seoul-common-inner #gnb {
			position: absolute;
			left: 0px;
			top: 12px;
			height: 30px;
			z-index: 100;
			width: 450px;
		}
		
		a {
			display: block;
			color: #e5eef6;
			font-size: 0.93em;
			font-family: "맑은 고딕", "Malgun Gothic";
			letter-spacing: -1px;
			font-weight: 700;
		}
		
		a:link {
			text-decoration: none;
		}
		
		a:active {
			text-decoration: underline;
		}
		
		a:hover {
			font-size: 1.1em;
		}
		
		body, div, dl, dt, dd, th, td, ul, ol, li, h1, h2, h3, h4, h5, h6, form,
			fieldset, p, blockquote, button, input, textarea {
			margin: 0;
			padding: 0;
		}
		
		ul, ol, li {
			list-style: none;
		}
		
		li {
			float: left;
			padding: 0px 7px;
		}
		
		body {
			font: 16px "dotum", "돋움", "gulim", "굴림", "sans-serif";
			-webkit-text-size-adjust: none;
		}
		
		h1 img {
			width: 15%;
		}
		-->
		</style>
		<div class="seoul-common-wrap">
			<div class="seoul-common-inner">
				<h1>
					<a href="/home"><img alt="서울특별시" src="img/naver.png"></a>
				</h1>
				<div class="gnb-wrap">
					<nav id="gnb">
						<ul>
							<li><a href="${loginURL }">로그인</a></li>
							<li><a href="${myPageURL }">마이서울</a></li>
							<li><a href="${emailURL }">전자우편</a></li>
							<li><a href="${introURL }">서울소개</a></li>
							<li><a href="${joinURL }">시민참여</a></li>			
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</head>
	
	<body>
	<div class="seoul-common-inner">
		<br><h1>로그인</h1>
		<br> 카테고리 아이디 : ${categories.categoryId }
		<br> 카테고리 이름 : ${categories.categoryName}
		<br> 카테고리 설명 : ${categories.description }
		</div>
	</body>
</html>
