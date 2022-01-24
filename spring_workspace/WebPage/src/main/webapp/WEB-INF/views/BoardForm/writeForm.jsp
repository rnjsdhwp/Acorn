<%@ page contentType="text/html; charset=UTF-8"%>
<%-- <% HttpSession topSession = request.getSession(false); %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/" />

<center> 
<form action="${urlHome }board/writeProc" method="post" enctype="multipart/form-data">
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
				<input type=text name='title' style="width: 500px; "/> 
			</td>
		</tr>
		<tr>
			<td colspan=2 align="right">
				<textarea name="content" style="width: 650px; height: 300px"></textarea>
			</td>
		</tr>
		<tr>
			<td align='right' height=40 colspan=2>
				<input type=file name="uploadFile" style="width: 300px; "/> 
			</td>
		</tr>
		<tr>
			<td align='center' height=40 colspan=2>
				<input type='submit' value='글쓰기' style="width: 120px; "/>
				<input type='reset' value='취소' style="width: 120px; "/>	 
			</td>
		</tr>
	</table>
</form>
</center>