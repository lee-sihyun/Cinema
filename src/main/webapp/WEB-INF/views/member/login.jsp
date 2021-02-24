<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>





<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>


<script type="text/javascript">
	function login() {

		loginForm.action = "${pageContext.request.contextPath }/login";
		document.loginForm.submit();

	}
</script>




</head>
<body>


		<!--본문시작 -->
		<div id="content"
			style="display: flex; justify-content: center; align-content: center; margin-top: 250px;">



			<div class="loginForm"
				style="left: 50%; border: 1px solid grey; width: 300px; height: 160px;">
				<form id="loginForm" name="loginForm" method="post"
					style="margin-left: 50px; margin-top: 50px;">

					<table>

						<tr>

							<td>아이디</td>
							<td><input type="text" name="userId"
								placeholder="아이디를 입력하세요"></td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td><input type="password" name="userPw"
								placeholder="비밀번호를 입력하세요"></td>
						</tr>

					</table>
					<input type="button" value="로그인" onclick="login()"
						style="margin-top: 20px; margin-left: 80px;">


				</form>
			</div >
			<!-- 로그인폼끝 -->


		</div>
		<!-- 본문끝 -->




	<!-- 바디영역끝 -->


</body>
</html>