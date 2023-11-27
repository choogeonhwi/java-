<%@page import="java.util.concurrent.Delayed"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String ID = "1";
		String PW = "2";

		session.setAttribute("n", request.getParameter("id"));
		if (ID.equals(request.getParameter("id")) && PW.equals(request.getParameter("pw"))) {

			response.sendRedirect("W.jsp");
		}else{
			out.print("확인하세요");
			Thread.sleep(3000);
			response.sendRedirect("s.jsp");
		}
	%>

</body>
</html>