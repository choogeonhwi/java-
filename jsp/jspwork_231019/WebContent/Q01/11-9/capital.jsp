<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean class="question.capital" id="capital"></jsp:useBean>
<hr>
<jsp:setProperty property="*" name="capital" />
<br>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>






	<h2>당신이 입력한 정보입니다.</h2>
	<%
		out.print("입력된 알파벳 " + capital.getA() + "은 <br>" + capital.p());
	%>
</body>
</html>