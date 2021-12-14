<%-- file name : pageDirective.jsp --%>
<%-- http://localhost:8080/directives/pageDirective.jsp --%>


<%@page import="kr.co.acorncampus.dao.MemberDAO"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html;cahrset=utf-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ page session="false" %>

hello<br>

안녕하세요.

<%
	ArrayList list = new ArrayList();
	Set set = new HashSet();
	MemberDAO dao = MemberDAO.getInstance();
%>