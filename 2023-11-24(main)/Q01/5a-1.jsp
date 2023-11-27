<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="h01.jsp"%>
	<%@ page import="java.util.Calendar"%>

	<%! 
 public String c(){
	 Calendar c1= Calendar.getInstance();
	 c1.add(Calendar.DATE, 1);
	 int y = c1.get(Calendar.YEAR);
     int m = c1.get(Calendar.MONTH)+1;
     int d = c1.get(Calendar.DATE);
     
     return y+"-"+m+"-"+d;
 }
 %>
	<%= c() %>
</body>
</html>