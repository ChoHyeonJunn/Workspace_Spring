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
		이름 : <input type="text" name="MYNAME">
		제목 : <input type="text" name="MYTITLE">
		내용 : <textarea rows="10" cols="60" name="MYCONTENT"></textarea>
		
		<input type="submit" value="글쓰기">
		<a href="list.do">취소</a>
	</form>
</body>
</html>