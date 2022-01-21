<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert</title>
</head>
<body>
	<form action="insertProc" method="post">
		<table>
			<thead>
				<tr>
					<td align="center">First Name</td>
					<td align="center">Last Name</td>
				</tr>
			</thead>
			<tr>
				<td><input type="text" name='firstname' /></td>
				<td><input type="text" name='lastname' /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="등록" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
