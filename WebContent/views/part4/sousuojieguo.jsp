<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>搜索结果页面</title>
		<link rel="stylesheet" href="../../css/part4/tianbingtianjiangzhuyemian.css" />
		
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
		<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />

		<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
	</head>

	<body>
		<div data-role="page" class="tianbingtianjiangzhuyemian main">
			<div data-role="content">
				<div class="header">
					<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
				</div>
				<h1 class="head">添兵添将(球员搜索结果)</h1>
				<br/>
				<div class="playground">
					<c:choose>
						<c:when test="${!empty users}">
							<c:forEach items="${users}" var="user" varStatus="st">
								<!--<div class="name_content">
									<span>球员姓名：<a onclick="goto1('${user.userName}')">${user.userName}</a></span>
								</div>-->
								<div class="content">
									<div class="content_left">
										<div class="img">
											<img src="../../img/part4/pic/i7.jpg" />
											<!--球队logo-->
										</div>
									</div>
		
									<div class="content_mid">
										<div class="">球员姓名：${user.userName}</div>
										<div class="">性别：${user.sex}</div>
										<div class="">身高：${user.height}</div>
		
									</div>
		
									<div class="content_right">
										<div class="">体重：${user.weight}</div>
										<div class="">国籍：${user.country}</div>
										<div class="">城市：${user.city}</div>
		
									</div>
									
									<!--<div class="content_mid">
										<div class="">球员姓名：ss</div>
										<div class="">性别ff</div>
										<div class="">身高：ff</div>
		
									</div>
		
									<div class="content_right">
										<div class="">体重：ffdf</div>
										<div class="">国籍zfd</div>
										<div class="">城市bgsd</div>
		
									</div>
									-->
									
									
									<!-- <div class="tj" onclick="tjClick()">
										<span>添加</span>
									</div> -->
							</div>

							</c:forEach>
						</c:when>
						<c:otherwise>
							<P>没有记录</P>
						</c:otherwise>
					</c:choose>


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

			</div>

		</div>

		<script src="../../js/common/common.js"></script>
		<script src="../../js/urlApi/api.js"></script>
		<script type="text/javascript" src="../../js/part4/sousuojieguo.js"></script>
	</body>

</html>