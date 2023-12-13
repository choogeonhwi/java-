<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("input", "");
pageContext.setAttribute("input2", "bbb");

%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>표현 언어 연산자</h3>
	\${empty ""}=> ${empty ""} } <br>
	\${empty input}=> ${empty input} } <br>
	\${empty input2}=> ${empty input2} } <br>
	
	\${(5>2) ? 5:2} => ${(5>2) ? 5:2}<br>
	\${2 gt 10} =>${2 gt 10}<br>
	\${5>2} => ${5 > 2}<br>
	
	\${5+2} => ${5 + 2}<br>
	\${5/2} => ${5 / 2}<br>
	\${5%2} => ${5 % 2}<br>
	\${5 mod 2} => ${5 mod 2}<br>
</body>
</html>