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
		���̵� <input type="text" value="${id }" name="id"/><br>
		�н����� <input type="password" value="${pw }" name="pw"/><br>
		<input type="submit" value="�α���"/>
		<input type="reset" value="���"/>
	</form>
</body>
</html>