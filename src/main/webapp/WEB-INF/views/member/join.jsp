<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>영화관</title>








<!-- 모달관련 -->


</head>
<body>




		<!--본문시작 -->
		<div id="content">




			<table style="
    margin-top: 200px;
    margin-left: 880px;
">
				<tr>
					<td colspan="2">회원가입입력 0119</td>
				</tr>
				<!-- 이름        널?       유형             
--------- -------- -------------- 
USER_ID   NOT NULL VARCHAR2(1000) 
USER_PW   NOT NULL VARCHAR2(1000) 
ADD_NUM   NOT NULL NUMBER(38)     
ADDRESS   NOT NULL VARCHAR2(1000) 
PHONE_NUM NOT NULL NUMBER(38)     
RE_NUM             NUMBER(38)     
USER_NUM  NOT NULL NUMBER(38)      -->

				<tr>
					<td>아이디</td>
					<td><input type="text" id="userId"></td>



				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" id="userPw"></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td><input type="text" id="addNum"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" id="address"></td>
				</tr>
				<tr>
					<td>핸드폰번호</td>
					<td><input type="text" id="phoneNum"></td>
				</tr>

















			</table>

			<button type="button" id="submit" style="
    margin-left: 950px;
    margin-top: 50px;
">가입</button>














		</div>
		<!-- 본문끝 -->




	</div>
	<!-- 바디영역끝 -->

	<script>
		$(document).ready(function() {
			App.init();
			EmailCompose.init();
		});

		$("#submit").click(function() {
			var userId = $("#userId").val();
			var userPw = $("#userPw").val();
			var addNum = $("#addNum").val();
			var address = $("#address").val();
			var phoneNum = $("#phoneNum").val();
			
			
	
			
			
			
			
			$.ajax({

				type : "POST",
				url : "join",
				data : {
					"userId" : userId,
					"userPw" : userPw,
					"addNum" : addNum,
					"address" : address,
					"phoneNum" : phoneNum

				},
				dateType : "text",
				success : function(text) {
					if (text == "success") {
						alert("회원가입이 완료되었습니다");
						location.href = "completion";
					}
				},
			
				
				
				error : function(req) {
					alert("응답 에러 코드 =" + req.status);
				}
			})
		});
	</script>

</body>
</html>