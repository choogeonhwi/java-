<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    



<body>


<h3>세션 값 설정</h3>
<hr>세션 값 설정 페이지 입니다.
<hr>
<% String s="세션에 저장된 데이터가 바로 접니다.";
session.setAttribute("test", s);
session.setAttribute("MyData", 10);


%>
</body>
