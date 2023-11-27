<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%! 
public String c(){
Calendar c= Calendar.getInstance();

int y = c.get(Calendar.YEAR);
int m = c.get(Calendar.MONTH)+2;
int d = c.get(Calendar.DATE);

return y+"-"+m+"-"+d;
}
    %>
    
    
    <%= c() %>
</body>
</html>