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
		<form method="post" action="#">
			<tr>
				<td>번호</td>
				<td>
					${content_view.bid}
				</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>
					${content_view.bhit}
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					${content_view.bname}
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					${content_view.btitle}
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					${content_view.bcontent}
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
















