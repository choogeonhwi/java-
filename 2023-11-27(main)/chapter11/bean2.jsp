<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:useBean class="hello.hellobean" id="mybean"></jsp:useBean>
    <hr>
    
    빈 생성후 저장된 값 출력 <br>
    
    이름: <jsp:getProperty property="n" name="mybean"/> <br>
   나이: <jsp:getProperty property="age" name="mybean"/> <br>
   
   <% mybean.setN("전수빈");%>
   <% mybean.setAge(10) ;%>
    <jsp:setProperty property="n" name="mybean" value="홍길순"/> <br>
    <jsp:setProperty property="age" name="mybean" value="22"/> <br>
   
    이름: <jsp:getProperty property="n" name="mybean"/> <br>
   나이: <jsp:getProperty property="age" name="mybean"/> <br>
   
   