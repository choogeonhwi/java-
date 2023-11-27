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
	remove 메소드 사용

	<%
	String name;
String v = "저는 세션이 저장된 첫 값";
session.setAttribute("name1", v);
v = "저는 세션이 저장된 2 값";
session.setAttribute("name2", v);
v = "저는 세션이 저장된 3 값";
session.setAttribute("name3", v);

out.print("<hr> <h3> --- 삭제하기 전 ---</h3>");
Enumeration app = session.getAttributeNames();

int i=0;

while(app.hasMoreElements()){
	i++;
	name= app.nextElement().toString();
	v = session.getAttribute(name).toString();
	
	out.print("얻어온 세션 이름"+i+name+"<br>");
	out.print("얻어온 세션 값"+i+v+"<br>");
	
			
}
//세션 이름 삭제
session.removeAttribute("name2");


out.print("<hr> <h3> --- 삭제하기 후 ---</h3>");
 app = session.getAttributeNames();

 i=0;

while(app.hasMoreElements()){
	i++;
	name= app.nextElement().toString();
	v = session.getAttribute(name).toString();
	
	out.print("얻어온 세션 이름"+i+name+"<br>");
	out.print("얻어온 세션 값"+i+v+"<br>");
	
			
}

%>
</body>
</html>