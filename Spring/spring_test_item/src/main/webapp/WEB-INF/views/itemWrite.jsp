<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<form method="post" action="writeResult">
			<tr>
				<td>상품명</td>
				<td>
					<input type="text" name="bname" size="50">
				</td>
			</tr>
			<tr>
				<td>가격</td>
				<td>
					<input type="text" name="bp" size="50">
				</td>
			</tr>
			<tr>
				<td>설명</td>
				<td>
					<textarea rows="10" name="bcontent"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>