<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>浇冰必拜主页面</title>
<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css" />
<script type="text/javascript" src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script type="text/javascript"
	src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>

</head>


<body>
	<div data-role="page" class="jiaobingbibaizhuyemain">
		<div class="top">
			<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
			<span>浇冰必拜</span>
		</div>

		<!--<div class="search">
			<ul data-role="listview" data-inset="true" data-filter="true" data-filter-placeholder="精确搜索">

				

				<div class="playground">
					<c:choose>
						<c:when test="${!empty places}">
							
							<c:forEach items="${places}" var="place" varStatus="st">

								<div class="day">
									<li data-role="list-divider" class="day">开放日期：${place.openDate}</li>
								</div>

								<div class="name_content">

									<span><a onclick="goto1('${place.placeName}')">${place.placeName}</a></span>

									<div class="huanjing">
										<span>环境指数:</span> <img src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" />
									</div>
								</div>
								<div class="content">
									<div class="content_img">
										<img src="../../img/part2/c.jpg" />
										
									</div>
									<div class="content_div_right">
										<li class="content_top"><a href="">${place.placeName}</a></li>
										<div class="mid">${place.placeNumber}</div>
										<div class="content_bottom">${place.placeAddress}</div>
									</div>
								</div>

							</c:forEach>
						</c:when>
						<c:otherwise>
							<P>没有记录</P>
						</c:otherwise>
					</c:choose>

				</div>

			</ul>
		</div>-->


		<!--	      		
	      		
	     <div class="search">
	      			<form method="post" action="demoform.asp">
						<div data-role="fieldcontain">
							<label for="search">请输入搜索姓名：</label>
							<input data-role="" type="search" name="search" id="search" placeholder="">
						</div>
						<input type="submit" data-inline="true" value="搜索" id="btn">
					</form> 
	      		</div>
		-->




		<div class="search">
			<div class="search_a">
				<div class="search_b">
					<input type="text" name="search" id="search" placeholder="精确查询">
				</div>
				<div>
					<input type="submit" data-role='none' value="搜索" class="submitBtn"></input>
				</div>

			</div>


			<!--
                        	 var：迭代参数的名称。在迭代体中可以使用的变量的名称，用来表示每一个迭代变量。类型为String。 
           					items：要进行迭代的集合。对于它所支持的类型将在下面进行讲解。 
         					  varStatus：迭代变量的名称，用来表示迭代的状态，可以访问到迭代自身的信息。 

                        -->

			<div class="playground">
				<c:choose>
					<c:when test="${!empty places}">
						<!--搜索的是冰场的名字,若冰场名字存在，则..-->
						<c:forEach items="${places}" var="place" varStatus="st">

							<div class="day">
								<li data-role="list-divider" class="day">开放日期：${place.openDate}</li>
							</div>

							<div class="name_content">

								<span><a onclick="goto1('${place.placeName}')">${place.placeName}</a></span>

								<div class="huanjing">
									<span>环境指数:</span> <img src="../../img/part2/star.png" /> <img
										src="../../img/part2/star.png" /> <img
										src="../../img/part2/star.png" /> <img
										src="../../img/part2/star.png" /> <img
										src="../../img/part2/star.png" />
								</div>
							</div>
							<div class="content">
								<div class="content_img">
									<img src="../../img/part2/c.jpg" />
									<!-- <img>${place.image}</img> -->
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="">${place.placeName}</a></li>
									<div class="mid">${place.placeNumber}</div>
									<div class="content_bottom">${place.placeAddress}</div>
								</div>
							</div>

						</c:forEach>
					</c:when>
					<c:otherwise>
						<P>没有记录</P>
					</c:otherwise>
				</c:choose>

			</div>


		</div>







	</div>


	<div class="button">
							<div class="shouye" onclick="shouyeClick()">
								<span class="ch">首页</span>
								<span class="en">	Home</span>
							</div>
							<div  class="zhanshu" onclick="zhanshuClick()">
								<span class="ch">战术</span>
								<span class="en">Tactical</span>
							</div>
							<div  class="zhandui" onclick="zhanduiClick()">
								<span class="ch">战队</span>
								<span class="en">Team</span>
							</div>
							<div class="wode" onclick="wodeClick()">
								<span class="ch">我的</span>
								<span class="en">Mine</span>
							</div>
				   </div>	

</body>
<script src="../../js/common/common.js"></script>
<script src="../../js/urlApi/api.js"></script>
<script src="../../js/part2/jiaobingbibaizhuyemian.js"></script>
<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
</html>
