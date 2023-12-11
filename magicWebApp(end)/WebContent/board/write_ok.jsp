<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"/>
<%

//파일업로드 처리
String path =  request.getRealPath("upload");
int size=1024*1024;
int fileSize=0;
String file="";
String orifile="";

MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
//파일명 넘버링 처리
Enumeration files= multi.getFileNames(); //파일명 가져오기
String str =  files.nextElement().toString();
file =  multi.getFilesystemName(str);

if(file != null){
	//첨부파일 있음 //실제 파일명
	orifile = multi.getOriginalFileName(str);
	fileSize =  file.getBytes().length;
}
%>

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
	
	
// 	MultipartRequest 객체 사용 시 board 객체 리셋으로 수동으로 데이터 저장
	board.setB_name((multi.getParameter("b_name")));
	board.setB_email((multi.getParameter("b_email")));
	board.setB_title((multi.getParameter("b_title")));
	board.setB_content((multi.getParameter("b_content")));
	board.setB_pwd((multi.getParameter("b_pwd")));
	board.setB_id(Integer.parseInt(multi.getParameter("b_id")));
	board.setB_ref(Integer.parseInt(multi.getParameter("b_ref")));
	board.setB_step(Integer.parseInt(multi.getParameter("b_step")));
	board.setB_level(Integer.parseInt(multi.getParameter("b_level")));
	
	
	board.setB_id(Integer.parseInt(multi.getParameter("b_id")));
	
	
	if(file != null){
		//첨부파일 있음 //실제 파일명
		board.setB_fname(file);
		board.setB_fsize(fileSize);
		board.setB_rfname(orifile);
		
		
	}
	
	if(db.insertBoard(board) == 1){//글쓰기가 정상적으로 완료시
		response.sendRedirect("list.jsp");
	}else{//글쓰기가 실패시
		response.sendRedirect("write.jsp");
	}
%>













