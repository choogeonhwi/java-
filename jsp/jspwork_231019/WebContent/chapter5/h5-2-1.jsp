<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="h5-2.jsp"%>
	<%@page import="java.util.Calendar"%>
	<%out.print(Calendar.getInstance().getTime());%>


</body>
</html>