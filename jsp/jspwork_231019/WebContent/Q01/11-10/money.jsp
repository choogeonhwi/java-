<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="question.money" id="money"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="money" />
	<br>
	<%
		out.print("입력된 금액이 " + money.getA() + "는 <br>" + money.p(money.getA()));
	%>
</body>
</html>