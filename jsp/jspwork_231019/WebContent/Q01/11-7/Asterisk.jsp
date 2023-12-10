<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="question.Asterisk" id="Asterisk"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="Asterisk" />
	<br>



	<h2>당신이 입력한 정보입니다.</h2>
	<%out.print("입력된 정수가 "+Asterisk.getA()+"은 <br>"+Asterisk.p(Asterisk.getA()));%>
</body>
</html>