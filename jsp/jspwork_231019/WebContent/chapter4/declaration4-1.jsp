<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String a = "hello, java server pages";%>
	<%!String getString(String a) {
		return a;
	}%>
	<%
		out.print(getString(a));
	%>
</body>
</html>