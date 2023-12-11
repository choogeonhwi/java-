<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
SmartUpload upload =  new SmartUpload();
upload.initialize(pageContext); // 파일 비움
upload.upload(); // 업로드 준비
int last =  upload.getFiles().getCount(); // 파일 갯수
int cnt=0;


for(int i=0; i<last; i++){
 File file = upload.getFiles().getFile(i); //업로드 파일
 
 
 //파일이 존재하면
 if(!file.isMissing()){
	 file.saveAs("/upload/"+file.getFileName()); // 파일이름을 받아 메소드로 저장
	 
	 out.print("폼 태그 필드 이름" + file.getFieldName()+"<br>");
	 out.print("파일 이름 : " + file.getFieldName()+"<br>");
	 out.print("파일 크기 : " + file.getSize()+"<br>");
	 out.print("파일 확장자 : " + file.getFileExt()+"<br>");
	 out.print("파일 경로 : " + file.getFilePathName()+"<br>");
	 out.print("<br>================================" + "<br>");
	 
	 cnt++;
 }
}
out.print("파일"+cnt+"개를 업로드 했습니다.");

%>
