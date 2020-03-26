<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>DETAIL</h1>
	
	<form action="update.do" method="POST">
		<input type="hidden" name="MYNO" value="${board.MYNO }">
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
				<td><input type="text" name="MYTITLE" value="${board.MYTITLE}"></td>
			</tr>
			<tr>
				<th>MYCONTENT</th>
				<td><textarea rows="10" cols="60" name="MYCONTENT">${board.MYCONTENT}</textarea></td>
			</tr>
			<tr>
				<th>MYDATE</th>
				<td>${board.MYDATE }</td>
			</tr>
			
			<tr>
				<td colspan="5">				
					<input type="submit" value="수정">
					<a href="list.do">목록</a>
				</td>
			</tr>
		</table>
	</form>


</body>
</html>