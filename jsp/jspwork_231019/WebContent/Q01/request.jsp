<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="request_p.jsp">
		<table>
			<tr>
				<td align="right">아이디:</td>
				<td align="left"><input type="text" name="id" size="20"
					maxlength="20"></td>
			</tr>
			<tr>
				<td align="right">비번:</td>
				<td align="left"><input type="text" name="pw" size="20"
					maxlength="20"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="전송"></td>
			</tr>
		</table>
	</form>

</body>
</html>