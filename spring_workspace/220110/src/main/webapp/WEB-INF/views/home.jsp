<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
	</head>
	
	<body>
		<h1>
			Hello world!  
		</h1>
		
		<P>  The time on the server is ${serverTime}. </P>
		<P>  The time on the server is ${serverTime1.get(0)}. </P>
		<P>  The time on the server is ${serverTime1.get(1)}. </P>
		<P>  The time on the server is ${serverTime1}. </P>
		<a href="https://www.naver.com">	${serverTime1}</a>
	</body>
</html>
