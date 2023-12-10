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
String sn = request.getRealPath("name");
%>

	<%= sn %>안녕
	<br> 저희 홈피 방문 ㄳ
	<br> 좋은 하루..
</body>
</html>