<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#loginForm").submit(function(e){
		e.preventDefault();
		
		var id = $("#loginForm input[name='USERID']").val();
		var pw = $("#loginForm input[name='USERPW']").val();
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("USERID",id);
		jsonObj.put("USERPW",pw);
		
		$.ajax({
			type: "POST",
			url: "/user/login.do",
			data: jsonObj,
			dataType: "JSON",
			success: function(msg){
				if(msg.result == 0){
				}else{
					location.href='/DEVCA/main/mainpage.do';
				}
			},
			error : function() {
				alert("통신 실패");
			}
		})
	})
})
	
</script>

</head>
<body>
	<h1>LOGIN</h1>
	
	<form id="loginForm" action="#" method="POST">
		<table border="1">
			<tr>
				<td>							
					<label for="id">ID : </label>
					<input id="id" type="text" name="USERID">
				</td>
			</tr>
			<tr>
				<td>
					<label for="pw">pw : </label>
					<input id="pw" type="text" name="USERPW">				
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="로그인">
					<input type="reset" value="취소">				
				</td>
			</tr>
		</table>
		
		
	</form>
</body>
</html>