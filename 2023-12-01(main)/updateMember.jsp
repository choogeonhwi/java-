<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn=null;
// 	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	DataSource ds=null;
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			try{
				Context ctx = new InitialContext();
				ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
				conn = ds.getConnection();
				System.out.println("DBCP 연동 성공");
				
				StringBuffer selectQuery=new StringBuffer();
				String id = request.getParameter("id");
				selectQuery.append("SELECT NAME, CLASS, TEL FROM MEMBER2 WHERE ID=?");
//	 			dbcp 연결 정보 객체(conn)를 가지고, prepareStatement 메소드 호출해서
//	 			PreparedStatement 객체 생성해서 쿼리 사용
				pstmt = conn.prepareStatement(selectQuery.toString());
//	 			setString 메소드 : 쿼리 파라미터 값을 저장
// SELECT NAME, CLASS, TEL FROM MEMBER2 WHERE ID='xxx'
				pstmt.setString(1, id);
//	 			executeQuery 메소드로 쿼리 실행해서 결과값을 ResultSet 객체로 받음
				rs = pstmt.executeQuery();

				if(rs.next()){
//	 				쿼리 결과값 출력(SELECT NAME, CLASS, TEL FROM MEMBER2 WHERE ID=?)
					%>
<!-- 				결과값을 가지고 update 하기 위한 jsp 로 이동(form action 태그 추가) -->
					<form method="post" action="updateProcess.jsp">
						아이디 :<input type="text" name="id" value="<%= id %>"><br>
						이름 :<input type="text" name="name" value="<%= rs.getString("NAME") %>"><br>
						회원등급 :<input type="text" name="mclass" value="<%= rs.getString("CLASS") %>"><br>
						전화번호 :<input type="text" name="tel" value="<%= rs.getString("TEL") %>"><br>
						<input type="submit" value="수정">
						<a href="viewMember.jsp">목록보기</a>
					</form>
					<%
				}else{
					%>
					<font color="red">아이디 없3~~</font> 
					<a href="viewMember.jsp">목록보기</a>
					<%
				}
			}catch(NamingException ne){//dbcp name 을 못찾을때 오류
				ne.printStackTrace();
			}catch(SQLException se){
				se.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		%>
</body>
</html>












