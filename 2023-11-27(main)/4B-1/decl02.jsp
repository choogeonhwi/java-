<%@page import="org.omg.CORBA.PUBLIC_MEMBER"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! double a = 3.14159; %>

	<%!  double getDouble(){
	return a;
}	
%>

	<% out.print(getDouble()); %>

</body>
</html>