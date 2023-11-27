<%@page import="magic.memberbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<jsp:useBean class="magic.memberbean" id="mb"></jsp:useBean>
<%-- <jsp:setProperty property="id" name="mb" /> --%>
<%-- <jsp:setProperty property="pw" name="mb" /> --%>
<jsp:setProperty property="*" name="mb" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신 입력 정보
	<hr>
	아 이 디
	<jsp:getProperty property="id" name="mb" />
	<br> 비번 :
	<jsp:getProperty property="pw" name="mb" />
	<br> 이름 :
	<jsp:getProperty property="n" name="mb" />
	<br>회원 구분 :
	<%
	if(mb.getMclass()==1){
		out.print("일반회원");
	}else{
		out.print("교수님");
		
	}
	%>
	<br> 전화번호 :
	<jsp:getProperty property="phone1" name="mb" />-
	<jsp:getProperty property="phone2" name="mb" />-
	<jsp:getProperty property="phone3" name="mb" />-
</body>
</html>




















