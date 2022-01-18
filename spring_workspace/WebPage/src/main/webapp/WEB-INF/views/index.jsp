<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<div align="center">
<table style="width:800px;">
<tr>
	<td style="height:100px;"><%@ include file="common/top.jsp" %></td>
</tr>
<tr>
<!-- include는 jsp페이지의 코드를 직접 입력하는 것이며 
	c:import는 페이지를 호출하는 것이다. -->
	<td style="height:400px;"><c:import url="/${formPath }"/></td>
</tr>
<tr>
	<td style="height:50px;"><%@ include file="common/footer.jspf" %></td>
</tr>
</table>
</div>
</body>
</html>