<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�۾���</h1>
	
	<form action="insert.do" method="POST">
		�̸� : <input type="text" name="MYNAME">
		���� : <input type="text" name="MYTITLE">
		���� : <textarea rows="10" cols="60" name="MYCONTENT"></textarea>
		
		<input type="submit" value="�۾���">
		<a href="list.do">���</a>
	</form>
</body>
</html>