<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="question.ta" id="ta"></jsp:useBean>
	<hr>
	<jsp:setProperty property="*" name="ta" />
	<br>
	<%
		out.print( ta.getA()+"*"+ta.getA()+"는 <br>" + ta.p());
	%>
</body>
</html>