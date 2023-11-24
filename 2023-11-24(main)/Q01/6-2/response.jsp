<%@page import="javax.print.DocFlavor.STRING"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.sun.glass.ui.CommonDialogs.Type"%>
<%@page import="java.net.URL"%>
<%@page import="sun.awt.image.ImageWatched.Link"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% response.setIntHeader("refresh", 5);



Calendar C = Calendar.getInstance();

String a; 
int h = C.get(Calendar.HOUR_OF_DAY);
int m = C.get(Calendar.MINUTE);
int s = C.get(Calendar.SECOND);



if(C.get(Calendar.AM_PM) == 0){
	a="AM";
}else{
	a="PM";
}
String CT = h+""+m+""+s+a;
out.print(CT);
%>

<p><a href="response_D.jsp"> 홈피이동 </a> </p>
</body>
</html>