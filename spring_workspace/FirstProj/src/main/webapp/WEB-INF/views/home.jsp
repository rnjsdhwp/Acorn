<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
	<head>
		<title>Home</title>
	</head>
	
	<body>
		<h1>
			Hello world!  
		</h1>
		
		<P>  The time on the server is ${serverTime}. </P>
		<P>  The time on the server is ${serverTime1}. </P>
		<P>  The time on the server is ${serverTime2}. </P>
		<P>  The time on the server is ${serverTime2 + 10}. </P>
	</body>
</html>
