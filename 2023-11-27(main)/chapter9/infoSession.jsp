<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 값 메소드</h3>
	<hr>
	<%
		//세션의 id
	String id = session.getId();

	//클라이언트가 마지막으로 보낸 시간을 롱 타입으로 반환
	long lasttime = session.getLastAccessedTime();

	//세션이 만들어진 시간
	long Ctime = session.getCreationTime();

	long m = (lasttime - Ctime) / 60000;

	int inactive = session.getMaxInactiveInterval() / 60;
	
	//처음 생성 세션 참 거짓
	boolean new1 = session.isNew();
	
	%>
	
	[1] 세션 아이디는 <%= id %> 입니다. <br> <hr>
	[2] 머문 시간 <%= m %> 분입니다. <br> <hr>
	[3] 유효 시간 <%= inactive %> 분입니다. <br> <hr>
	[4] 새로운 세션 <br>
	
	<%
	if(new1){
		out.print("새로운 세션");
	}else{
		out.print("미생성");
		
		
		
	}
	%>
</body>
</html>