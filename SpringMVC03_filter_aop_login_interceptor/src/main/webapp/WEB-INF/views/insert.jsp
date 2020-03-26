<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기</h1>
	
	<form action="insert.do" method="POST">
		<table border="1">
			<tr>
				<th>작성자</th>
				<td><input type="text" name="MYNAME" value="${sessionScope.login.MEMBERNAME }" readonly="readonly"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="MYTITLE"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="60" name="MYCONTENT"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="작성" />
					<input type="button" value="목록" onclick="location.href='list.do'"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>