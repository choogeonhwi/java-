<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
h3>forward 액션 태그</h3>
	</center>
	<hr>
	이파일 red.jsp <br>
	웹 브라우저 색 <br>
	노란색? <br>
	태그가 실행되면 내용은 미출력 <br>
	<jsp:forward page="y2.jsp">
	<jsp:param value="red2.jsp" name="url"/> </jsp:param>
	<jsp:param value="y2.jsp" name="news"> </jsp:param>
	</jsp:forward>
	
</body>
</html>