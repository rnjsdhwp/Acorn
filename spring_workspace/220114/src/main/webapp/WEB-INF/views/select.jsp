<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8"%>
<html>
<head>
	<script type="text/javascript">
		function proc(cmd){
			document.getElementById('frm').action=cmd;
			document.getElementById('frm').submit();
		}
	</script>
	<title>Select</title>
</head>
<body>
	<h1>
		<a href="home">Home</a>
	</h1>
	<br />
	<table border="1" >
		<thead>
			<tr align="center" bgcolor="LightGray">
				<td>ID</td>
			</tr>
		</thead>
		<c:forEach var="person" items="${personList }">
			<c:url var="selectPart" value="selectPart">
				<c:param name="id">${person.id }</c:param>
			</c:url>
			<tr>
				<td><a href="${selectPart }">${person.id }</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br><hr>
	
	<c:if test="${!(empty personPart) }">
		<p>상세 정보</p>
		<table border="1">
			<thead>
				<tr align="center" bgcolor="LightGray">
					<td>ID</td>
					<td>First Name</td>
					<td>Last Name</td>
				</tr>
			</thead>
			<tr>
				<td>${personPart.id }</td>
				<td>${personPart.firstname }</td>
				<td>${personPart.lastname }</td>
			</tr>
		</table>
		<br>
		<form id="frm" action="modify">
			<input type="hidden" name="id" value="${personPart.id }">
			<input type="hidden" name="firstname" value="${personPart.firstname }">
			<input type="hidden" name="lastname" value="${personPart.lastname }">
			<input type="button" onClick="proc('modify')" value="수정">
			<input type="button" onClick="proc('deleteProc')" value="삭제">
		</form>
	</c:if>
</body>
</html>
