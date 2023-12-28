<%@page import="java.sql.DriverManager" %> 
<%@page import="java.sql.ResultSet" %> 
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.SQLException" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String description = request.getParameter("description");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>items</title>
</head>
<body>

<%
try{
	Class.forName("oracle.jdbc.driver.OracleDriver"); //driver
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger"); //username, password는 개인 Oracle 계정의 것으로 하면 됨
	String sql ="insert into item(NAME,PRICE,DESCRIPTION) values('"+name+"','"+price+"','"+description+"')"; 
	
	//DB를 조회할 select문
	pstmt = conn.prepareStatement(sql); //sql문으로 conn
	rs = pstmt.executeQuery(); //pstmt 실행 후 결과를 rs에 할당
	

	
	rs.close();
	pstmt.close();
	conn.close();
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>



<p> <a href="itemWrite.jsp">결과보기</a> </p>
</body>
</html>


