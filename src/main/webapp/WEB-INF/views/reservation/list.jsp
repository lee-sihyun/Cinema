<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

		<!--본문시작 -->
		<div id="content">


			<div class="steps">


				<div class="step step1"
					style="height: 595px; display: block; text-align: center;">


					<!--movie -->
					<div class="section section-movie">

						<!-- col-head -->

						<div class="col-head" id="skip_movie_list"></div>
						<!-- col-body -->









						<div class="col-body"
							style="height: 560px; border: 1px solid; margin-top: 100px; display: flex;">

















							<!-- 영화선택 -->
							<div class="movie-select"
								style="border: 1px solid; height: 560px; width: 560px; flex: 1;">
								
									<div style="border: 1px solid;">
									<p>영화선택</p>
								</div>
								
								
		
								<table>
								
				<c:forEach var="movie" items="${reSelectMv}">
					<tr>


						<td><a href="./add">${movie.mvName }
						<input type="hidden" value="${movie.theaterNum} ">
						</a></td>
			


					</tr>
					
					</c:forEach>
								
								
						</table>		

								
						
								
								<!--  	<ul id="movielist">

									<li><a>클래식</a></li>
									<li><a>미술관옆동물원</a></li>

								
								
								
								
								
								</ul>-->
							
								<!-- <div class="pane pane-y"
									style="display: block; opacity: 1; visibility: visible;">
									<div class="slider slider-y" style="height: 50px; top: 0px;"></div>


								</div>
								 -->


							</div>
							<!-- 영화선택끝  -->



							<!-- theater section -->
							<div class="theater-select"
								style="border: 1px solid; height: 560px; width: 560px; flex: 1;">

								<div style="border: 1px solid;">
									<p>지역선택</p>
								</div>

<!--				<ul>
										<li class="selected"><a
											onclick="theaterListClickListener(event);return false;">
												<span class="name">서울</span> <span class="count">(27)</span>

										</a>

											<div class="theater-list-nano">

												<ul class="content scroll-y">
													<li><a href="#"
														onclick="theaterListClickListener(event);return false;">
															강남 </a></li>

												</ul>


											</div></li>

									</ul>  -->

								<div class="theater-list">
					
								</div>


							</div>
							<!-- theater section끝 -->




							<!-- time섹션 -->
							<div class="section section-time " style="flex: 1;">

								
								<div style="border: 1px solid;">
									<p>시간선택</p>
								</div>
								<div>

									<p>시간나열</p>

								</div>


							</div>

							<!-- time섹션끝 -->






							<div></div>

						</div>


					</div>


				</div>







			</div>






		</div>
		<!-- 본문끝 -->




	</div>
	<!-- 바디영역끝 -->



</body>
</html>