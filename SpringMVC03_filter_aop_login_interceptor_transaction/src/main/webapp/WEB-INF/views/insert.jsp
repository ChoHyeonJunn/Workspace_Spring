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
		<table border="1">
			<tr>
				<th>�ۼ���</th>
				<td><input type="text" name="MYNAME" value="${sessionScope.login.MEMBERNAME }" readonly="readonly"></td>
			</tr>
			<tr>
				<th>����</th>
				<td><input type="text" name="MYTITLE"></td>
			</tr>
			<tr>
				<th>����</th>
				<td><textarea rows="10" cols="60" name="MYCONTENT"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="�ۼ�" />
					<input type="button" value="���" onclick="location.href='list.do'"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>