<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>영화관</title>

<style type="text/css">
body, input, textarea, select, button, table {
	font-size: 13px;
	line-height: 1.2;
	color: #666;
	font-family: 'CJONLYONENEW', '맑은 고딕', '돋움', Dotum, sans-serif;
	font-weight: 300;
}

#cgvwrap {
	position: relative;
	width: 100%;
	min-width: 980px;
}

#cgvwrap #header>.head {
	position: relative;
	z-index: 100;
}

.sect-service>.gnb {
	float: right;
	margin: 0;
	text-align: left;
}

ul {
	display: block;
	list-style-type: disc;
	margin-block-start: 1em;
	margin-block-end: 1em;
	margin-inline-start: 0px;
	margin-inline-end: 0px;
	padding-inline-start: 40px;
}

li {
	display: list-item;
	text-align: -webkit-match-parent;
	float: left;
	display: inline-block;
}

.sect-service>.gnb li:first-child {
	margin-left: 0;
	background-image: none;
}

.im-wrap {
	position: relative;
	z-index: 100;
	height: 50px;
	padding-top: 69px;
}

.im-wrap>h2 {
	position: absolute;
	top: 28px;
	left: 50%;
	width: 428px;
	height: 31px;
	margin-left: -214px;
	text-align: center;
}

.lnb h2 {
	font: 0px/0 a;
	visibility: hidden;
}

.im-wrap .lnb {
	width: 376px;
	margin: 0 auto;
	clear: both;
}

.im-wrap .lnb>ul>li {
	position: relative;
	height: 35px;
}

.im-wrap .lnb>ul>li.movie>a {
	width: 60px;
	background-position: 13px -28px;
}

.im-wrap .lnb>ul>li.booking {
	margin-left: 25px;
}

.im-wrap .lnb>ul>li.booking>a {
	width: 60px;
	background-position: -77px -28px;
}

.im-wrap .lnb>ul>li.theaters {
	margin-left: 25px;
}

.im-wrap .lnb>ul>li.theaters>a {
	width: 60px;
	background-position: -166px -28px;
}

.__web-inspector-hide-shortcut__, .__web-inspector-hide-shortcut__ *,
	.__web-inspector-hidebefore-shortcut__::before,
	.__web-inspector-hideafter-shortcut__::after {
	visibility: hidden !important;
}
</style>



<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>



<!-- 모달관련 -->


</head>
<body>
	<div id="cgvwrap">

		<!-- 헤더시작 -->
		<div id="header">
			<div class="head">
				<div class="sect-service">

					<ul class="gnb">
						<li class="login"><a
							href="${pageContext.request.contextPath }/login"
							style="padding-right: 30px;">로그인</a></li>
						<li class="login"><a style="padding-right: 30px;"
							href="${pageContext.request.contextPath }/join">회원가입</a></li>
						<li class="login"><a>마이페이지</a></li>

					</ul>
				</div>

				<div class="in-wrap">


					<h2
						style="position: absolute; top: 28px; left: 50%; width: 428px; height: 31px; margin-left: -214px; text-align: center;">
						<a href="${pageContext.request.contextPath }/">영화관</a>
					</h2>

					<div class="inb" style="width: 376px; margin: 0 auto; clear: both;">
						<h2 class="__web-inspector-hide-shortcut__">주메뉴</h2>
						<ul id="gnb_list" style="margin-top: 50px; padding-left: 100px;">
							<li class="moive" style="padding-right: 30px;"><a
								href="${pageContext.request.contextPath }/film/list">영화</a></li>
							<li class="booking" style="padding-right: 30px;"><a
								href="${pageContext.request.contextPath }/reservation/list">예매</a></li>
							<li class="theater"><a
								href="${pageContext.request.contextPath }/theater/list"> 극장</a></li>


						</ul>



					</div>


				</div>








			</div>
			<!-- 헤드끝 -->
		</div>
		<!-- 헤더끝 -->

		<!--본문시작 -->
		<div id="content">




			<table style="
    margin-top: 200px;
    margin-left: 880px;
">
				<tr>
					<td colspan="2">회원가입입력</td>
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
					<td><input type="text" id="userPw"></td>
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