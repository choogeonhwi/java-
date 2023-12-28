<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="itemWriteResult.jsp">
		<table>
			<thead>
				<h2>정보 입력 폼</h2>
			</thead>
			<tr>
				<td ><b>상품명</b></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td ><b>가격</b></td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td><b>설명</b></td>
				<td><textarea rows="10" cols="80" name="description"></textarea></td>
			</tr>
			
			<tr>
			
				<td colspan="2"><center><input type="submit" value="전송"><input type="reset" value="취소">	</center></td>
			
			</tr>
			
		</table>
	</form>
</body>
</html>