<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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


	<%
int y=0;
int m=0;
int d=0;
public String cal(){
Calendar Calendar1 = Calendar.get();

	
Calendar.add(Calendar.YEAR, -1);
Calendar.add(Calendar.MONTH, -2);
Calendar.add(Calendar.DATE, -3);

y=Calendar.get(Calendar.YEAR);
m=Calendar.get(Calendar.MONTH)+1;
d=Calendar.get(Calendar.DATE);

return y+"-"+m+"-"+d;
}%>

	1년 2달 3일전 =
	<%= cal() %>
</body>
</html>
