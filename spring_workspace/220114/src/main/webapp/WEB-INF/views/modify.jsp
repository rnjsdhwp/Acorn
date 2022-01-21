<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8"%>
<html>
<head>
<title>Modify</title>
</head>
<body>
	<form action="modifyProc">
		<input type="text" name="id" value="${personPart.id }">
		<input type="text" name="firstname" value="${personPart.firstname }">
		<input type="text" name="lastname" value="${personPart.lastname }">
		<input type="submit" value="수정">
	</form>
</body>
</html>
