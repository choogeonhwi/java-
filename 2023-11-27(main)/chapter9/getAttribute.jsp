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
		<h3>세션값</h3>

	</center>
	<hr>
	가져온 세션값
	<hr>
	<% 
// 세션 내장 객체의 메소드는 세션이름으로 값을 가져옴
Object o =  session.getAttribute("test");
// 다운 캐스팅
String s2 = (String) o;

//오토 언박싱 or parseint
int p =   (Integer)session.getAttribute("MyData");

out.print("세션값[1]"+s2+"<br><br>");
out.print("세션값[2]"+p+"<br><br>");

%>
</body>
</html>


















