<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="question.Alphabet" id="Alphabet"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="Alphabet" />
	<br>
	<h2>당신이 입력한 정보입니다.</h2>
	<%
		out.print("입력된 알파벳이 " + Alphabet.getA() + "은 <br>" + Alphabet.p());
	%>
</body>
</html>