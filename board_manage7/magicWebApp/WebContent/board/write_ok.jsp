<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"/>
<%
	//오늘날짜 추가
	board.setB_date(new Timestamp(System.currentTimeMillis()));
	BoardDBBean db = BoardDBBean.getInstance();

// 	자바 클래스 이용해서 ip 추가
	InetAddress address = InetAddress.getLocalHost();
	String ip = address.getHostAddress();
	
// 	ip 추가(0:0:0:0:0:0:0:1)
// 	board.setB_ip(request.getRemoteAddr());
	board.setB_ip(ip);//192.168.100.76
	
	if(db.insertBoard(board) == 1){//글쓰기가 정상적으로 완료시
		response.sendRedirect("list.jsp");
	}else{//글쓰기가 실패시
		response.sendRedirect("write.jsp");
	}
%>













