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

		<h3>선언부 예제</h3>

	</center>
	<hr>
	<%!String s = "안녕";
	int a = 5, b = -5;

	public int abs(int n) {
		if (n < 0) {
			n = -n;
		}
		return n;
	}%>out.print(s + "<br>");
	out.print(a + "" + abs(a));
	out.print(b + "" + abs(b));

%>
</body>
</html>