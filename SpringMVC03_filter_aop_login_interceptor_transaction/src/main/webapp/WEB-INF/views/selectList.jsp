<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- START :: set JSTL variable -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- END :: set JSTL variable -->

</head>
<body>
	<h1>SELECT LIST</h1>
	<h5>${sessionScope.login.MEMBERNAME } �� ȯ���մϴ�.</h5>
	<table border="1">
		<tr>
			<th>MYNO</th>
			<th>MYNAME</th>
			<th>MYTITLE</th>
			<th>MYCONTENT</th>
			<th>MYDATE</th>
		</tr>
		<c:forEach items="${selectList }" var="board">
			<tr>
				<td>${board.MYNO }</td>
				<td>${board.MYNAME }</td>
				<td><a href="detail.do?MYNO=${board.MYNO}">${board.MYTITLE }</a></td>
				<td>${board.MYCONTENT }</td>
				<td>${board.MYDATE }</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="5">
				<a href="insertform.do">�۾���</a>
			</td>
		</tr>
	</table>
</body>
</html>