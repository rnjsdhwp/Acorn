<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="home" value="/"/>

<center>
<form action="${home }board/write">
<input type="hidden" name="pno" value="${board.no }"/>
<table style="width: 650px; ">
	<tr>
		<td style="width: 300px; height:40px;" valign="middle"><h2>${board.title }</h2></td>
		<td style="width: 350px; height:40px;" align="right" valign="bottom">${board.writedate }</td>
	</tr>
	<tr>
		<td colspan=2><hr/></td>
	</tr>
	<tr>
		<td  style="width: 300px; height:40px;" valign="top">${board.id }</td>
		<td style="width: 350px; height:40px;" align="right" valign="top">
			<a href="${home }resources/upload/${attachFileMap.SYSTEMFILE }">${attachFileMap.ORIGINFILE }</a>
		</td>
	</tr>
	<tr>
		<td colspan=2 style="width: 650px; height: 300px" valign="top">
		<pre>
			${board.content }
		</pre>
		</td>
	</tr>
	<tr>
		<td colspan=2><hr/></td>
	</tr>
	<tr>
		<td colspan=2 align="right">
			<button style="width: 60px; ">글쓰기</button>
			<button formaction="${home }board/reply" style="width: 60px; ">답글</button>
			<button style="width: 60px; ">수정</button>
			<button style="width: 60px; ">삭제</button>
			<button style="width: 60px; ">목록</button>
		</td>
	</tr>
</table>
</form>
</center>