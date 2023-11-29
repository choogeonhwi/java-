<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="question.Arithmetic" id="Arithmetic"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="Arithmetic" />
	<br>



	<h2>당신이 입력한 정보입니다.</h2>
	<%out.print(Arithmetic.getA()+"와"+Arithmetic.getB()+"의 계산 결과는 "+Arithmetic.abc(Arithmetic.getA(), Arithmetic.getC(), Arithmetic.getB()));%>
</body>
</html>