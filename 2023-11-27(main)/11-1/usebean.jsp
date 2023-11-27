<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>원의 면적 출력하기</h4>

	<jsp:useBean class="area.circle" id="my"></jsp:useBean>
	<hr>
	반지름
	<jsp:setProperty property="r" name="my" value="10" />
	<br> 면적
	<jsp:getProperty property="r" name="my" />
	<br>
</body>
</html>