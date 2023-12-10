<%@page import="java.util.Calendar"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%!String s = "안녕";
	int a = 5;
	int b = -5;

	public int as(int n) {
		if (n < 0) {
			n = -n;
		}
		return n;
	}%>
	<%=s%>
	<br>
	<%=a%>와 절대값 ->
	<%=as(a)%>
	<%=b%>와 절대값 ->as(b)s(b) %>

</body>
</html>