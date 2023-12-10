<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>설정된 세션값</h3>

	<hr>
	getAttributeName() 메소드 사용 세산겺 얻어오기

	<%
		String str = "현재 페이지는와 이전페이지 설정 세션 값";
	session.setAttribute("Validate", str);
	String str_n;
	String str_v;
	Enumeration app = session.getAttributeNames();
	int i = 0;

	//열거형 객체가 있으면 참
	while (app.hasMoreElements()) {
		i++;

		//문자열 타입으로 변환하면서 열거형 값을 가져옴
		str_n = app.nextElement().toString();
		// 		세션 이름으로 값을 가져옴
		str_v = session.getAttribute(str_n).toString();

		out.print("<br>얻어온 세션 이름 [" + i + "]:" + str_n + "<br>");
		out.print("<br>얻어온 세션 값 [" + i + "]:" + str_v + "<hr>");

	}
	%>
</body>
</html>