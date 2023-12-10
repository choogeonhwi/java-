<%@page import="question.gugu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<jsp:useBean class="question.gugu" id="my"></jsp:useBean>
	<h4>구구단 출력하기</h4>

	<% 
   int n=5;
   for(int i=1; i<=9; i++){
	   out.print(n+"*"+i+"="+my.p(n, i)+"<br>");
   }
   %>


</body>
</html>