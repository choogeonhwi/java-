<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function sendRequest() {
	
	$.ajax({
		url:"request_ajax.jsp"
		,type:"POST"
		,data:{"city":"Busan","zipcode":"1234"}
// 		dataTYPE: 생략가능
		,dataType:"text"
		
		//성공시
		,success:function(data){
			document.getElementById("text").innerHTML = data;
		}
	//실패시
		,error:function(data){
			document.getElementById("text").innerHTML ="<h3>ajax fail</h3>";
		}
	});
	
}
</script>
</head>
<body>
	<h1>post 방식의 요청</h1>
	<button type="button" onclick="sendRequest()">post 방식 요청 보내기</button>
	<p id="text">  </p>
</body>
</html>