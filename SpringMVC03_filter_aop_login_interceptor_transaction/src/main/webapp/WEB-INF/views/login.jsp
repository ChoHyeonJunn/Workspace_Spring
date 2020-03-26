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
	$("#loginchk").hide();
		
})

function login(){
	var MEMBERID = $("#MEMBERID").val().trim();
	var MEMBERPW = $("#MEMBERPW").val().trim();
	
	console.log(MEMBERID + " : " + MEMBERPW);
	
	if(MEMBERID == null || MEMBERID == "" || MEMBERPW == null || MEMBERPW == ""){
		alert("ID �� PW �� �ٽ��ѹ� Ȯ���� �ּ���!")
	}else{
		var loginVal = {
				"memberid" : MEMBERID,
				"memberpw" : MEMBERPW
		}
		
		$.ajax({
			type: "post",
			url: "ajaxlogin.do",
			data: JSON.stringify(loginVal),
			contentType: "application/json",
			dataType: "json",
			
			success: function(msg){
				
				if (msg.check == true) {
					location.href="list.do";
				} else {
					$("#loginchk").show().html("ID Ȥ�� PW�� �߸��Ǿ����ϴ�.").css("color","red")
				}

			},
			
			error: function(){
				alert("��Ž���");
			}
		})
	}
	
}
</script>


</head>
<body>
	<h1>LOGIN</h1>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<td><input type="text" id="MEMBERID"></td>
		</tr>
		
		<tr>
			<th>pw</th>
			<td><input type="password" id="MEMBERPW"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="login" onclick="login();">
				<input type="button" value="JOIN" onclick="location.href='joinform.do'">				
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginchk"></td>
		</tr>
	</table>
</body>
</html>