<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>INDEX</h1>
	<a href="home.do">HOME</a><br>
	<a href="command.do?name=spring&addr=����&phone=010-1234-1234">get</a><br>
	<form action="command.do" method="post">
		<table>
			<tr>
				<th>NAME</th>
				<th>ADDR</th>
				<th>PHONE</th>
			</tr>
			<tr>
				<td><input type="text" name="name"></td>
				<td><input type="text" name="addr"></td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="post"></td>
			</tr>
		</table>
	</form>
	<br>
	
	<a href="void.do">void</a>
	
	
</body>
</html>