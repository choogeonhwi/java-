<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	admin님 반갑습니다.
	<a href="so.jsp">로그아웃</a>
	<%
		if (session.getAttribute("n") == null) {
		response.sendRedirect("s.jsp");
	}
	%>

</body>
</html>