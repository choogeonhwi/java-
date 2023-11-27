<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page isErrorPage="true"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% response.setStatus(HttpServletResponse.SC_OK); %>
	에러 발생
	<br>
	<!-- 기본메시지 -->
	<!-- iserrorpage=true 있어야 사용 -->
	<%= exception.getMessage() %>
</body>
</html>