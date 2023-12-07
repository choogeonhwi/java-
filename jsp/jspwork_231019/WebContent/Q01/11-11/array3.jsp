<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="question.array3" id="array3"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="array3" />
	<br>
	<%
		out.print("입력된 금액이 " + array3.getA() + "는 <br>" + array3.p());
	%>
</body>
</html>