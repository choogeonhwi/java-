<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
    <%@ page errorPage="er02.jsp" %>
    
    <%! 
    String name;
    int age;
    
    %>
    
    <% 
     request.setCharacterEncoding("UTF-8");
    name =request.getParameter("n");
    age = Integer.parseInt(request.getParameter("a"));  
    %>
    
   <h3>회원 정보</h3>
    당신 이름은 <%= name %>입니다. <br>
    당신 나이는 <%= age %>입니다. <br>
    
  