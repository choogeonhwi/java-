<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String name = "홍";%>
	<%
		String a = "서울시 송파구 석촌동";
	%>
	<br> 이름:
	<%=name%>
	<br> 주소 :
	<%
		out.print(a);
	%>
	<!-- <br> -->
	<!-- jsp:include page="age.jsp" -->

</body>
</html>