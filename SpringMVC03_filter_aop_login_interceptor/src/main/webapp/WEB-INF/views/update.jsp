<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>UPDATE</h1>
	
	<form action="update.do" method="POST">
		<input type="hidden" name="MYNO" value="${board.MYNO }">
		<table border="1">
			<tr>
				<th>작성자</th>
				<td>${board.MYNAME }</td>
			</tr>
			<tr>		
				<th>제목</th>
				<td><input type="text" name="MYTITLE" value="${board.MYTITLE}"></td>
			</tr>
			<tr>
				<th>날짜</th>
				<td>${board.MYDATE }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="60" name="MYCONTENT">${board.MYCONTENT}</textarea></td>
			</tr>
			
			<tr>
				<td colspan="5">				
					<input type="submit" value="수정">
 					<input type="button" value="취소" onclick="location.href='detail.do?MYNO=${board.MYNO}'"/>
				</td>
			</tr>
		</table>
	</form>


</body>
</html>