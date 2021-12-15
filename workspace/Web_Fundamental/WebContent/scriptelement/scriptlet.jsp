<%@ page pageEncoding="utf-8" %>

<html>
	<head>
		<title>scriptlet</title>
	</head>
	<body>
		<h1>안녕하세요.</h1>
		
		<%
			for(int i=2; i<=9; i++){
				out.print(i+"단 입니다.");
				for(int j=1; j<=9; j++){
					out.print(i+" * "+j+" = "+i*j+"<br>");
				}
				out.print("<br>");
			}
		%>
		
		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>주소</th>
			</tr>
			<% for(int i=0; i<20; i++){ %>
			<tr>
				<th><%= i+1 %></th>
				<th>이름<%= i+1 %></th>
				<th>주소<%= i+1 %></th>
			</tr>
			<% } %>
		</table>
	</body>
</html>