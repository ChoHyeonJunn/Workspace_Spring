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
			<th>MYNO</th>			
			<td>${board.MYNO }</td>
		</tr>
		<tr>
			<th>MYNAME</th>
			<td>${board.MYNAME }</td>
		</tr>
		<tr>		
			<th>MYTITLE</th>
			<td>${board.MYTITLE }</td>
		</tr>
		<tr>
			<th>MYCONTENT</th>
			<td>${board.MYCONTENT }</td>
		</tr>
		<tr>
			<th>MYDATE</th>
			<td>${board.MYDATE }</td>
		</tr>
		
		<tr>
			<td colspan="5">				
				<a href="updatepage.do?MYNO=${board.MYNO}">수정</a>
				<a href="delete.do?MYNO=${board.MYNO}">삭제</a>
				<a href="list.do">목록</a>
			</td>
		</tr>
	</table>


</body>
</html>