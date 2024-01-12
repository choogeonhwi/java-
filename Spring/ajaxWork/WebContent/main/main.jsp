<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function sendRequest() {
	var httpRequest = new XMLHttpRequest();
	httpRequest.open("POST","request_ajax.jsp", true); // 호출대상
	
// 	기본 컨텐트 타입 설정(인코딩 기본)
	httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	httpRequest.send("city=Seoul&zipcode=55775"); // 보내는 데이터 ,, 띄워쓰면 데이터 손실
	httpRequest.onreadystatechange=function name(){
		//요청과 응답 상태 체크 함수 생성
		//실행 && 응답성공
		if (httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200) {
			
			//응답값을 받아옴
			document.getElementById("text").innerHTML = httpRequest.responseText;
			
			
		}
	}
}
</script>
</head>
<body>
	<h1>post 방식의 요청</h1>
	<button type="button" onclick="sendRequest()">post 방식 요청 보내기</button>
	<p id="text">  </p>
</body>
</html>