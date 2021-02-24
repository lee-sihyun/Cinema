<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>

	<!--본문시작 -->
	<div id="content">

		<!-- select해서 마이페이지 상세내역  -->
		<p>마이페이지</p>
		<div class="loginForm"
			style="left: 50%; border: 1px solid grey; width: 300px; height: 160px;">
			<div id="mypage" style="margin-left: 50px; margin-top: 50px;">

				<table>

					<c:forEach var="userInfo" items="${mypage} ">



						<tr>

							<td>아이디</td>
							<td>${mypage.userId }</td>
						</tr>
						<tr>
							<td>우편번호</td>
							<td>${mypage.addNum }</td>
						</tr>

						<tr>
							<td>주소</td>
							<td>${mypage.address }</td>
						</tr>
						<tr>
							<td>핸드폰번호</td>
							<td>${mypage.phoneNum }</td>
						</tr>

					</c:forEach>
				</table>


			</div>
		</div>

		<!-- 마이페이지 끝  -->


	</div>
	<!-- 본문끝 -->





	<!-- 바디영역끝 -->



</body>
</html>