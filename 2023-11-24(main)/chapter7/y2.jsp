<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
<h3>forward 액션 태그</h3>
	</center>
	<hr>
	이파일 y.jsp <br>
	웹 브라우저에 나타나는 url과 전혀 상관없음<br>
<%= request.getParameter("url") %>로부터이동
<hr>
<%= request.getParameter("url") %>
에서 넘어온 메시지:
<%= request.getParameter("news") %>

</body>
</html>