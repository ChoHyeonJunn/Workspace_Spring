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
			<th>�ۼ���</th>
			<td>${board.MYNAME }</td>
		</tr>
		<tr>		
			<th>����</th>
			<td>${board.MYTITLE }</td>
		</tr>
		<tr>
			<th>��¥</th>
			<td>${board.MYDATE }</td>
		</tr>
		<tr>
			<th>����</th>
			<td><textarea rows="10" cols="60" readonly="readonly">${board.MYCONTENT }</textarea></td>
		</tr>
		
		<tr>
			<td colspan="4">					
				<input type="button" value="����" onclick="location.href='updateform.do?MYNO=${board.MYNO}'"/>
				<input type="button" value="����" onclick="location.href='delete.do?MYNO=${board.MYNO}'"/>
				<input type="button" value="���" onclick="location.href='list.do'"/>		
			</td>
		</tr>
	</table>


</body>
</html>