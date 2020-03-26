<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>DETAIL</h1>

	<table border="1">
		<tr>
			<th>작성자</th>
			<td>${board.MYNAME }</td>
		</tr>
		<tr>		
			<th>제목</th>
			<td>${board.MYTITLE }</td>
		</tr>
		<tr>
			<th>날짜</th>
			<td>${board.MYDATE }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="60" readonly="readonly">${board.MYCONTENT }</textarea></td>
		</tr>
		
		<tr>
			<td colspan="4">					
				<input type="button" value="수정" onclick="location.href='updateform.do?MYNO=${board.MYNO}'"/>
				<input type="button" value="삭제" onclick="location.href='delete.do?MYNO=${board.MYNO}'"/>
				<input type="button" value="목록" onclick="location.href='list.do'"/>		
			</td>
		</tr>
	</table>


</body>
</html>