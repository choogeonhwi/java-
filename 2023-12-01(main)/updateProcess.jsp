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
<%
	request.setCharacterEncoding("UTF-8");
%>
<%!
	Connection conn=null;
	PreparedStatement pstmt=null;
	DataSource ds=null;
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
// 			dbcp 연결
			try{
				conn = ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
			}catch(NamingException ne){
				ne.printStackTrace();
			}catch(SQLException se){
				se.printStackTrace();
			}
		
			String id="", name="", vclass="", tel="";
			id = request.getParameter("id");
			name = request.getParameter("name");
			vclass = request.getParameter("mclass");
			tel = request.getParameter("tel");
			
			StringBuffer updateQuery=new StringBuffer();
			updateQuery.append("UPDATE MEMBER2 SET NAME=?, CLASS=?, TEL=? WHERE ID=?");
			
			try{
				pstmt = conn.prepareStatement(updateQuery.toString());
//	 			? 4개를 순서대로 값을 셋팅
				pstmt.setString(1, name);//VARCHAR2 타입은 setString 메소드 사용
// 				pstmt.setString(2, vclass);//오라클로 가서 casting(속도 저하)
				pstmt.setInt(2, Integer.parseInt(vclass));//NUMBER 타입은 setInt 메소드 사용
				pstmt.setString(3, tel);
				pstmt.setString(4, id);
// 			여기까지 처리하면	UPDATE MEMBER2 SET NAME=?, CLASS=?, TEL=? WHERE ID=? 파라미터 값이 완성
				int re = pstmt.executeUpdate();//정상적으로 수정시 1이 반환됨
				
				if(re == 1){
					%>
						<%= id %>의 정보가 수정되었습니다.<br>
						[<a href="viewMember.jsp">목록보기</a>]
					<%
				}else{
					%>
						변경 실패
					<%
				}
			}catch(SQLException se){
				se.printStackTrace();
			}finally{
				try{
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		%>
</body>
</html>












