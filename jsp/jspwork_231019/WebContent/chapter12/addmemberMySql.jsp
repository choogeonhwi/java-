<%@page import="java.net.URLEncoder"%>
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
	Statement stmt=null;
	ResultSet rs=null;

	String url = "jdbc:mysql://localhost:3306/jspdb";
	//데이터 베이스 아이디
	String user = "root";
	//비번
	String password = "1234";
	// jdbc 드라이버 로딩
	String sql="SELECT * FROM MEMBER2";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
			String id="", pw="", name="", sclass="", p1="", p2="", p3="";
			id = request.getParameter("id");
			pw = request.getParameter("pw");
			name = request.getParameter("name");
			sclass = request.getParameter("mclass");
			p1 = request.getParameter("phone1");
			p2 = request.getParameter("phone2");
			p3= request.getParameter("phone3");
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				StringBuffer insertQuery=new StringBuffer();
//	 			insert 쿼리 조립
				insertQuery.append("INSERT INTO MEMBER2 VALUES('");
				insertQuery.append(id+"','");
				insertQuery.append(pw+" ',' ");
				insertQuery.append(name+" ', ");
// 				insertQuery.append(URLEncoder.encode(name, "UTF-8")+" ',' ");
				insertQuery.append(sclass+" ,' ");
				insertQuery.append(p1+"-"+p2+"-"+p3+"')");

//	 			조립한 쿼리 확인
				System.out.println(insertQuery.toString());
//	 			executeUpdate 메소드 : insert 할때 사용됨
				int re = stmt.executeUpdate(insertQuery.toString());

				if(re == 1){
					%>
	추가 성공
	<br>
	<a href="addformMySql.html">추가작업</a>
	<a href="viewMember.jsp">검색작업</a>
	<%
				}else{
					%>
	<font color="red">추가 실패 ㅠ.ㅠ</font>
	<%
				}
				
// 				rs = stmt.executeQuery(sql);
			}catch(SQLException ex){
				out.print("데이터베이스 연결이 실패했습니다.");
				out.print("SQLException : "+ex.getMessage());
			}finally{
				try{
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		%>
</body>
</html>