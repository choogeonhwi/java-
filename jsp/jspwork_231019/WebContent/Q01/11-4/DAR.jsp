
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean class="question.DAR" id="my"></jsp:useBean>
	<hr>

	<jsp:setProperty property="a" name="my" />
	<br>

	<h4>당신이 입력한 정보입니다</h4>
	<% out.print("입력된 정수가"+my.getA()+"은"+my.p(my.getA())); %>

</body>
</html>