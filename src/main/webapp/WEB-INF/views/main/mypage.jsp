<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

</head>
<body>
	<div id="cgvwrap">

		<!-- 헤더시작 -->
		<div id="header">
			<div class="head">
				<div class="sect-service">

					<ul class="gnb">
						<li class="login"><a 
						
						href="${pageContext.request.contextPath }/login" style="padding-right: 30px;">로그인</a></li>
						<li class="login"><a style="padding-right: 30px;"
						href="${pageContext.request.contextPath }/join">회원가입</a></li>
						<li class="login"><a href="${pageContext.request.contextPath }/mypage">마이페이지</a></li>

					</ul>
				</div>

				<div class="in-wrap">


					<h2
						style="position: absolute; top: 28px; left: 50%; width: 428px; height: 31px; margin-left: -214px; text-align: center;">
						<a href="${pageContext.request.contextPath }/">영화관</a> </h2>

					<div class="inb" style="width: 376px; margin: 0 auto; clear: both;">
						<h2 class="__web-inspector-hide-shortcut__">주메뉴</h2>
						<ul id="gnb_list" style="margin-top: 50px; padding-left: 100px;">
							<li class="moive" style="padding-right: 30px;"><a href="${pageContext.request.contextPath }/film/list">영화</a></li>
							<li class="booking" style="padding-right: 30px;"><a href="${pageContext.request.contextPath }/reservation/list">예매</a></li>
							<li class="theater"><a href="${pageContext.request.contextPath }/theater/list"> 극장</a></li>


						</ul>



					</div>


				</div>








			</div>
			<!-- 헤드끝 -->
		</div>
		<!-- 헤더끝 -->

		<!--본문시작 -->
		<div id="content">
	
	<!-- select해서 마이페이지 상세내역  -->
<p>마이페이지</p>
<div class="loginForm"
				style="left: 50%; border: 1px solid grey; width: 300px; height: 160px;">
				<div id="mypage" 
					style="margin-left: 50px; margin-top: 50px;">

					<table>
					
					<!-- 	<c:forEach var="userInfo" items="${mypage} "> </c:forEach>   -->
				
		
					
						<tr>

							<td>아이디</td>
							<td>${userinfo.userId }</td>
						</tr>
						<tr>
							<td>우편번호</td>
							<td>${userinfo.addNum }</td>
						</tr>
						
						<tr>
							<td>주소</td>
							<td>${userinfo.address }</td>
						</tr>
						<tr>
							<td>핸드폰번호</td>
							<td>${userinfo.phoneNum }</td>
						</tr>

					</table>
					


			</div>
			</div>
			
			<!-- 마이페이지 끝  -->

		
		</div>
		<!-- 본문끝 -->




	</div>
	<!-- 바디영역끝 -->
	

	
</body>
</html>