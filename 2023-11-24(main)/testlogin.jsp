<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String sid="hong";
String spw="1234";
String sn="홍홍홍";

if(sid.equals(request.getParameter("id")) &&
	sid.equals(request.getParameter("pw"))){
	response.sendRedirect("main.jsp?name="+URLEncoder.encode(sn,"utf-8")+sn);
}else{
	response.sendRedirect("login.html");
	
}

%>
</body>
</html>