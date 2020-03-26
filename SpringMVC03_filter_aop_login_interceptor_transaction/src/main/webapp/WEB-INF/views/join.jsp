<%@ page language="java" contentType="text/html; charset=utf-8"
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
	
	$("#MEMBERID").keyup(function(){
		var MEMBERID = $("#MEMBERID").val().trim();
		var loginVal = {
				"memberid" : MEMBERID
		}
		
		$.ajax({
			type: "post",
			url: "ajaxidcheck.do",
			data: JSON.stringify(loginVal),
			contentType: "application/json",
			dataType: "json",
			
			success: function(msg){
				
				if (msg.check == true) {
					$("#loginchk").show().html("이미 존재하는 ID 입니다.").css("color","red")
				} else {
					$("#loginchk").show().html("사용가능한 ID 입니다.").css("color","green")
				}

			},
			
			error: function(){
				alert("통신실패");
			}
		})
	})	
})

function join(){
	var MEMBERID = $("#MEMBERID").val().trim();
	var MEMBERNAME = $("#MEMBERNAME").val().trim();
	var MEMBERPW = $("#MEMBERPW").val().trim();
	
	console.log(MEMBERID + " : " + MEMBERPW);
	
	if(MEMBERID == null || MEMBERID == "" || MEMBERNAME == null || MEMBERNAME == "" || MEMBERPW == null || MEMBERPW == ""){
		alert("ID, NAME, PW 를 모두 입력해주세요!")
	} else if ($("#loginchk").html() == "이미 존재하는 ID 입니다."){
		alert("이미 존재하는 ID 입니다!!");
		$("#MEMBERID").val("");
		$("#MEMBERID").focus();
	} else {
		$("#joinForm").submit();
	}
}

</script>


</head>
<body>
	<h1>JOIN</h1>
	
	<form id="joinForm" action="join.do" method="post">
		<table border="1">
			<tr>
				<th>ID</th>
				<td><input type="text" id="MEMBERID" name="MEMBERID"></td>
			</tr>
			
			<tr>
				<th>NAME</th>
				<td><input type="text" id="MEMBERNAME" name="MEMBERNAME"></td>
			</tr>
			
			<tr>
				<th>PW</th>
				<td><input type="password" id="MEMBERPW" name="MEMBERPW"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="join" onclick="join();">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center" id="loginchk"></td>
			</tr>
		</table>
	</form>
</body>
</html>