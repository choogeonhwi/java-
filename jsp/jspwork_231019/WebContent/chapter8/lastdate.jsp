<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Cookie last = null;
String msg = "";

boolean f = false;
String nv = "" + System.currentTimeMillis();
Cookie[] c = request.getCookies();

if (c != null) {
	System.out.print("@# c.length->" + c.length);
	for (int i = 0; i < c.length; i++) {
		last = c[i];
		if (last.getName().equals("lastDateCookie")) {
	f = true;
	break;
		}
	}
	// 	if/else 처음/아님
	if (!f) {
		msg = "처음입니다";
		new Cookie("lastDateCookie", nv);
		last.setMaxAge(365 * 24 * 60 * 60);
		last.setPath("/");
		response.addCookie(last);
	} else {
		long v = Long.parseLong(last.getValue());
		msg = "당신의 마지막 방문" + new Date(v);
		last.setValue(nv);
		response.addCookie(last);
	}
}
%>>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%=msg%></h2>
</body>
</html>