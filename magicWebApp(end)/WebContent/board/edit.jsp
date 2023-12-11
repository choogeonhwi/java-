<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));

	BoardDBBean db = BoardDBBean.getInstance();
	BoardBean board = db.getBoard(b_id, false);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="board2.js"></script>
</head>
<body>
	<center>
		<h1>글 수 정 하 기</h1>
		<!-- 		edit_ok.jsp 로 show.jsp 에서 받은 글번호를 넘긴다. -->
		<form name="reg_frm" method="post" action="edit_ok.jsp?b_id=<%= b_id %>">
			<table>
				<tr height="30">
					<td width="80">작성자</td>
					<td width="140">
<!-- 					maxlength : 화면단에서 데이터베이스 오류를 미리 방지 -->
						<input type="text" name="b_name" size="10" maxlength="20" value="<%= board.getB_name() %>">
					</td>
					<td width="80">이메일</td>
					<td width="240">
<!-- 					maxlength : 화면단에서 데이터베이스 오류를 미리 방지 -->
						<input type="text" name="b_email" size="24" maxlength="50" value="<%= board.getB_email() %>">
					</td>
				</tr>
				<tr height="30">
					<td width="80">글제목</td>
					<td colspan="3" width="460">
<!-- 					maxlength : 화면단에서 데이터베이스 오류를 미리 방지 -->
						<input type="text" name="b_title" size="55" maxlength="80" value="<%= board.getB_title() %>">
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea rows="10" cols="65" name="b_content">
							 <%= board.getB_content() %>
						</textarea>
					</td>
				</tr>
				<tr height="30">
					<td width="80">암&nbsp;&nbsp;호</td>
					<td colspan="3" width="460">
						<input type="text" name="b_pwd" size="12" maxlength="12">
					</td>
				</tr>
				<tr height="50" align="center">
					<td colspan="4">
<!-- 						<input type="submit" value="글쓰기">&nbsp; -->
						<input type="button" value="글수정" onclick="check_ok()">&nbsp;
						<input type="reset" value="다시작성">
						<input type="button" value="글목록" onclick="location.href='list.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>


















