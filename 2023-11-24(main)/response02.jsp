<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이페이지 5초마다 갱신</p>
	<% 
response.setIntHeader("refresh", 5);
%>

	<p>
		<%= new Date() %>
	</p>

</body>
</html>