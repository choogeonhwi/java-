<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠기 정보</h3>
</body>
</html>

<%
	Cookie[] c = request.getCookies();

out.print("현재 설정된 쿠키의 갯수->" + c.length);
out.print("<br><hr>");

for (int i = 0; i < c.length; i++) {
	out.print(i + "번째 쿠키의 이름->" + c[i].getName());
	out.print("<br><hr>");
	out.print("쿠키 설정값" + c[i].getValue());
	out.print("<br><hr>");

}
%>

