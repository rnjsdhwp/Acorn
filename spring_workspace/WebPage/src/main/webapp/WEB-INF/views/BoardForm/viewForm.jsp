<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="home" value="/"/>

<%--
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("button #modify")click(function(){
			/* $("input[name=pno]").attr("name", "modify")
			$("input[name=modify]").val("true") */
			$("#opt").attr("name", "modify")
			$("#opt").val("true")
		})
		
		$("#write").click(function(){
			$("input[name=no]").val("0")
			$("input[name=title]").val("")
			$("input[name=content]").val("")
		})
	})
</script> --%>

<center>
<form action="${home }board/write">
<input type="hidden" id="opt" name="pno" value="${board.no }"/>
<input type="hidden" name="no" value="${board.no }"/>
<input type="hidden" name="title" value="${board.title }"/>
<input type="hidden" name="content" value="${board.content }"/>
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
			<button id="write" style="width: 60px; ">글쓰기</button>
			<button formaction="${home }board/reply" style="width: 60px; ">답글</button>
			<button formaction="${home }board/modify" style="width: 60px; ">수정</button>
			<button formaction="${home }board/delete" style="width: 60px; ">삭제</button>
			<button formaction="${home }board/boardProc" style="width: 60px; ">목록</button>
		</td>
	</tr>
</table>
</form>
</center>