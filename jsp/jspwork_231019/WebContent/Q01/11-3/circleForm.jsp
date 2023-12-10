<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>당신이 입력한 정보입니다</h4>

	<jsp:useBean class="area.circle2" id="my"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="my" />
	반지름
	<jsp:setProperty property="r" name="my" />
	<br> 면적
	<jsp:getProperty property="r" name="my" />
	<br>
	<br>
</body>
</html>