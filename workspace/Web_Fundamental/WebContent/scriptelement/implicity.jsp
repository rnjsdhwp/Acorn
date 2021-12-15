<%@ page pageEncoding="utf-8" %>

<%
	String email = request.getParameter("email");
	String address = request.getParameter("address");
%>

email : <%= email %><br>
address : <%= address %>