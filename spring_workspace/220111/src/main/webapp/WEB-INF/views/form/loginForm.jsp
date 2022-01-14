<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>Login Page!!!</p>
	
	<p>id : ${id}</p>
	<p>pw : ${pw}</p>
	<form action="/img" >
		아이디 <input type="text" value="${id }" name="id"/><br>
		패스워드 <input type="password" value="${pw }" name="pw"/><br>
		<input type="submit" value="로그인"/>
		<input type="reset" value="취소"/>
	</form>
</body>
</html>