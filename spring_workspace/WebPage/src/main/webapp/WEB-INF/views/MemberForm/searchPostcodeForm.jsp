<!-- Member/searchPostcodeForm.jsp -->
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/" />

<style type="text/css">
.list_over {
	overflow: auto;
	background-color: pink;
}

.list_out {
	background-color: #FFFFFF;
}
</style>

<script type="text/javascript">
	function setParentAddr(zipcode, address){
		opener.document.getElementById('zipcode').value = zipcode;
		opener.document.getElementById('addr1').value = address;
		window.close();
	}
</script>

<html>
<body>
	<form action="${urlHome }membership/searchZipcode" method="post">
		<h1>
			동면<input type="text" name="addr" /> 
			<input type="submit" value="우편번호 검색" />
		</h1>
	</form>
	<c:if test="${!(empty zipcodeLst) }">
		<table border="1">
			<thead>
				<tr>
					<td>우편번호</td>
					<td>주소</td>
				</tr>
			</thead>
			<c:forEach var="z" items="${zipcodeLst }">
				<c:set var="zipcode" value="${z.zipcode }" />
				<c:set var="address" value="${z.sido } ${z.sigungu } ${z.doro }" />
				<tr onmouseover="this.className='list_over'" onmouseout="this.className='list_out'"
					onclick="setParentAddr('${zipcode}', '${address}')">
					<td>${zipcode }</td>
					<td>${address }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
