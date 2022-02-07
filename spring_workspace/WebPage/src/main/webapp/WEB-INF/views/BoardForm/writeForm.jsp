<%@ page contentType="text/html; charset=UTF-8"%>
<%-- <% HttpSession topSession = request.getSession(false); %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/" />

<!-- 글쓰기를 진행할 경우 controller의 writeProc을 호출하게 되며
board의 no 자료형이 int이기 떄문에 ""을 입력하게 되면 에러가 발생
따라서 ""대신 0을 전달하기 위해 아래와 같이 작성 -->
<c:set var="no" value="0"/>
<c:if test="${!empty board.np }>0">
	<c:set var="no" value="${board.no }"/>
</c:if>

<center> 
<form action="${urlHome }board/${proc}" method="post" enctype="multipart/form-data">
<input type="hidden" name="pno" value="${pno}"/>
<input type="text" name="no" value="${board.no}"/>
	<table style="width: 650px; ">
		<tr>
			<td style="width: 80px; height:40px;" align="right">작성자<%-- <%= topSession.getAttribute("id") %> --%></td>
			<td style="width: 570px; height:40px;">
				<input type=text name='id' value="<%=session.getAttribute("id")%>" readonly="readonly"/> 
			</td>
		</tr>
		<tr>
			<td  style="width: 80px; height:40px;" align="right">제 목</td>
			<td style="width: 570px; height:40px;">
				<input type=text name='title' value="${board.title }" style="width: 500px; "/> 
			</td>
		</tr>
		<tr>
			<td colspan=2 align="right">
				<textarea name="content" style="width: 650px; height: 300px">
					${board.content }
				</textarea>
			</td>
		</tr>
		<tr>
			<td align='right' height=40 colspan=2>
				<input type=file name="uploadFile" style="width: 300px; "/> 
			</td>
		</tr>
		<tr>
			<td align='center' height=40 colspan=2>
				<input type='submit' value='${btnName }' style="width: 120px; "/>
				<input type='reset' value='취소' style="width: 120px; "/>	 
			</td>
		</tr>
	</table>
</form>
</center>