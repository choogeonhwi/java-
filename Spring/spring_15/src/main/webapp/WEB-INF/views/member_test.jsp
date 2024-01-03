<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(function() {
		$("#checkJson").click(function() {
			var member = {
				id : "park",
				pwd : "지성박",
				name : "4321",
				email: "e@e.e"
			};
			
			$.ajax({
				type:"post"
				,url:"${contextPath}/Sample/info"
				,contentType:"application/json"
				,data:JSON.stringify(member) 
				,success:function(data){}
				,error:function(){
					alert("오류가 발생했습니다.");
				}
			});
			
		}); //end click
	}); //end
</script>

</head>
<body>
	<input type="button" id="checkJson" value="회원 정보 보내기">
</body>
</html>