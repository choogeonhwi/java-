<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int bid = Integer.parseInt(request.getParameter("fileNum"));
BoardDBBean db = BoardDBBean.getInstance();
BoardBean board = db.getFileName(bid);

String FileName = "";
String realFileName = "";

if (board != null) {
	//첨부파일 있으면
	FileName = board.getB_rfname();
	realFileName = board.getB_rfname();

}

//실제 경로
String saveDirectory = application.getRealPath("/upload");
// 디렉토리명과 파일명을 연결하는 구분자 운체마다 상이

//fileName 넘버링 처리된 파일
String path = saveDirectory+File.separator+FileName;


//다운로드 대상 파일
File file =  new File(path);
long length = file.length();

//한글 처리
realFileName = new String(realFileName.getBytes("ms949"),"8859_1");


//기본타입
response.setContentType("application/octet-stream");


response.setContentLength((int)length);

//브라우저에서 실제파밍열 컨텐츠 알림
response.setHeader("Content-Disposition", "attachment;filename="+realFileName);

//파일 다운로드 임시 저장공간 사용
BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(file));

//기존 파일 초기화
out.clear();

//다운로드 준비
out =  pageContext.pushBody();


//다운로드 내보낼때 사용
BufferedOutputStream bos  =new BufferedOutputStream(response.getOutputStream());


int data;
while((data=bis.read())!=-1){
	bos.write(data);
	
}

bis.close();
bos.close();

%>