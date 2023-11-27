<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!--     이페이지에 적용 -->
<!-- hello bean 클래스로 mybean 객체 생성 -->
<jsp:useBean class="hello.hellobean" id="mybean" scope="page"></jsp:useBean>
<hr>
빈 생성 후 저장된 값 출력
<br>
이 름 :
<%=mybean.getN() %>
<br>
나 이 :
<%=mybean.getAge() %>
<br>
<hr>
값을 변경한 후 값 출력하기
<br>

<% mybean.setN("전수빈"); %>
<% mybean.setAge(10); %>
이 름 :
<%=mybean.getN() %>
<br>
나 이 :
<%=mybean.getAge() %>
<br>