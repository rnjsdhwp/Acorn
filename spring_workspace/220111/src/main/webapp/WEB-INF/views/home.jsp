<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<img src="image/naver.png"><br><br>
	
	<a href="http://localhost:8080/img/login"> 
			<img src="img/google.png" >
	</a>
	<br>
	<p>로그인</p>
	<form action="/img/loginForm" >
		아이디 <input type="text" name="id"/><br>
		패스워드 <input type="password" name="pw"/><br>
		<input type="submit" value="로그인"/>
		<input type="reset" value="취소"/>
	</form>
	<br>
	<p>로그인2</p>
	<form action="/img/loginForm2" >
		아이디 <input type="text" name="id"/><br>
		패스워드 <input type="password" name="pw"/><br>
		<input type="submit" value="로그인"/>
		<input type="reset" value="취소"/>
	</form>
</body>
</html>
