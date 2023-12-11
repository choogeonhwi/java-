<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.nio.Buffer"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
//2진 데이터로 입력
InputStream is = request.getInputStream();
BufferedReader br =	new BufferedReader(new InputStreamReader(is));
String str = null;

//문자열 읽음
while((str = br.readLine()) != null){
	%>
	<%= str %>
	
	<%
	
	
}
%>