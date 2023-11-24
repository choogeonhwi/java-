<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
Cookie i=new Cookie("testCookie","FirstCookie");
//쿠키 생성
i.setMaxAge(365*24*60*60);
//속성 설정
i.setPath("/");
//경로 저장
response.addCookie(i);
//쿠키 추가
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>쿠키 처음 설정 중.</h2>

</body>
</html>


