<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <link
	href="${pageContext.servletContext.contextPath }/css/css.css"
	rel="stylesheet" />
    
    
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<div id="cgvwrap">

		<!-- 헤더시작 -->
		<div id="header">
			<div class="head">
				<div class="sect-service">

					<ul class="gnb">

						<!-- 	<li>${loginUserinfo.userId }님<c:if test="${userId==null}">
								<li class="login"><a
									href="${pageContext.request.contextPath }/login"
									style="padding-right: 30px;">로그인 </a></li>

							</c:if>



						</li> -->

						<!--  <li><c:choose>
								<c:when test="${userId eq null}">
									<li class="login"><a
										href="${pageContext.request.contextPath }/login"
										style="padding-right: 30px;">로그인 비회원 </a></li>
								</c:when>

								<c:when test="${userId ne null}">
									<li>${loginUserinfo.userId }님</li>
								</c:when>
							</c:choose></li>
-->
						<!-- <c:set var="userId" value="${userId}" /> -->
					
						<c:if test="${userId eq null}">
								
								<li>
								<a href="${pageContext.request.contextPath }/login"
									style="padding-right: 30px;">로그인 </a>
							</li>
							
							
							
							</c:if>
							
								<li>	${loginUserinfo.userId }님</li>
							
						








						<li class="login"><a
							href="${pageContext.request.contextPath }/logout"
							style="padding-right: 30px;">로그아웃</a></li>


						<li class="login"><a style="padding-right: 30px;"
							href="${pageContext.request.contextPath }/join">회원가입</a></li>
						<li class="login"><a
							href="${pageContext.request.contextPath }/mypage">마이페이지</a></li>

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