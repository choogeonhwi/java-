<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>

<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn = null;
	//db 연결을 위한 인터페이스

	//db 서버나 네트워크 오류를 대비한 예외처리
	try {

		//연결정보--> 자기 pc에 포트: 1521, sid: xe
		String url = "jdbc:mysql://localhost:3306/jspdb";
		//데이터 베이스 아이디
		String user = "root";
		//비번
		String password = "1234";
		// jdbc 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		// getConnecion 메소드로 데이터베이스 정보를 통해서 db연결
		conn = DriverManager.getConnection(url, user, password);
		out.print("데이터 베이스 연결 성공");
	} catch (SQLException ex) {
		out.print("데이터 베이스 연결 실패");

		out.print("SQLException : " + ex.getMessage());

	} finally {
		if (conn != null) {
			conn.close();

		}
	}
	%>
</body>
</html>