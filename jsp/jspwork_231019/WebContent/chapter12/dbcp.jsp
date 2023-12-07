<%@page import="com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>

<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!Connection conn = null;
	// Statement stmt=null;
	ResultSet rs = null;
	DataSource ds = null;

	PreparedStatement pstmt = null;%>

	<%
		try {
		Context ctx = new InitialContext();
		ds = (DataSource) ctx.lookup("java.comp/env/oracle");
		conn = ds.getConnection();
		System.out.print("연결 성공");

		StringBuffer sq = new StringBuffer();
		String id = request.getParameter("id");
		sq.append("SELECT NAME, CLASS, TEL FROM MEMNER2 WHERE ID=?");
		pstmt = conn.prepareStatement(sq.toString());

		pstmt.setString(1, id);
		rs = pstmt.executeQuery();

		if (rs.next()) {
	%>
	<!-- 		결과값ㅇ들 가지고 업데이트 하기위한 jsp로 이동 -->
	<form method="post" action="updateProcess.jsp">
		아이디: <input type="text" name="id" value="<%=id%>"> 이름: <input
			type="text" name="name" value="<%=rs.getString("NAME")%>"> <br>
		등급: <input type="text" name="mclass"
			value="<%=rs.getString("CLASS")%>"> <br> 번호: <input
			type="text" name="tel" value="<%=rs.getString("TEL")%>"> <br>
		<input type="submit" value="수정"> <a href="viewMember.jsp">목록보기</a>
	</form>
	<%
		} else {
	%>
	<font color="red">아이디 없33</font>
	<%
		}
	} catch (NamingException ne) {

	ne.printStackTrace();

	} catch (SQLException se) {

	se.printStackTrace();
	} finally {
	try {
	if (rs != null)
		rs.close();
	if (pstmt != null)
		pstmt.close();
	if (conn != null)
		conn.close();
	} catch (Exception e) {

	se.printStackTrace();
	}

	}
	%>
</body>
</html>