<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<form  method="post" action="registerOk">
			<tr height="50">
				<td colspan="2" align="center">
					<h1>회원 가입 신청</h1>
					'*' 표시 항목은 필수 입력 항목입니다.
				</td>
			</tr>
			<tr height="30">
				<td width="80">User ID</td>
				<td>
					<input type="text" name="mem_uid" size="15">*
				</td>
			</tr>
			<tr height="30">
				<td width="80">암호</td>
				<td>
					<input type="password" name="mem_pwd" size="15">*
				</td>
			</tr>
	
			<tr height="30">
				<td width="80">이      름</td>
				<td>
					<input type="text" name="mem_name" size="10">*
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록" >
				</td>
			</tr>
			
			
		</form>
	</table>
</body>
</html>