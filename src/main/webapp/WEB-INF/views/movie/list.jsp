<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


		<!--본문시작 -->
		<div id="content">

			<!-- <p>영화목록</p> -->
			<table
				style="font-size: 13px; line-height: 1.2; color: #666; font-family: 'CJONLYONENEW', '맑은 고딕', '돋움', Dotum, sans-serif; font-weight: 300; align-content: center; margin-top: 200px; margin-left: 500px;">

				<tr id="movietr" style="border: 1px solid;">

					<th id="movieth" style="text-align: center; color: black;">영화이름</th>
					<th id="movieth" style="text-align: center; color: black;">영화감독</th>
					<th id="movieth" style="text-align: center; color: black;">영화배우</th>

				</tr>

				<c:forEach var="movie" items="${selectMv}">
					<tr>


						<td>${movie.mvName }</td>
						<td>${movie.mvDirector }</td>
						<td>${movie.mvCast }</td>



					</tr>




				</c:forEach>

			</table>











		</div>
		<!-- 본문끝 -->




	</div>
	<!-- 바디영역끝 -->
</body>
</html>