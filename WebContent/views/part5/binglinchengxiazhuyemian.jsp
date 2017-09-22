<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>兵临城下主页面</title>
<link rel="stylesheet"
	href="../../css/part5/binglinchengxiazhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
	<div data-role="page" class="main">
		<div class="button1" onclick="javascript:history.back(-1);">
			<img src="../../img/part8/back.png" />
		</div>
		<div class="zengjia" onclick="zengjiaClick()">
			<img src="../../img/part5/plus.png" />
		</div>
		<h1 class="head">兵临城下</h1>
		<div class="button2">
			<div class="yiguanzhu" onclick="yiguanzhuClick()">
				<span>已关注</span>
			</div>
			<div class="saishixuanze" onclick="saishixuanzeClick()">
				<span>赛事选择</span>
			</div>
		</div>

		<div class="team">
			<c:choose>
				<c:when test="${!empty duiKangs}">
					<!--搜索的是冰场的名字,若冰场名字存在，则..-->
					<c:forEach items="${duiKangs}" var="duikang" varStatus="st">
						<!--日期-->
						<div class="day">
							<li data-role="list-divider" class="day">${duikang.onDate}</li>
						</div>
						<!--球场和环境指数-->
						<div class="name_content">
							<span>${duikang.address}</span>
							<div class="huanjing">
								<span>环境指数:</span>
								<c:forEach var="v" begin="1" end="${duikang.star}">
									<img src="../../img/part2/star.png" />
								</c:forEach>
							</div>
						</div>

						<!--两个队伍-->

						<div class="content">
							<div class="content_left">
								<div class="img">
									<img src="${duikang.logoA}" />
									<!--球队logo-->
								</div>
								<div class="name">
									<span>${duikang.clubAName}</span>
									<!--球队名字-->
								</div>
							</div>

							<div class="content_mid">
								<div class="">${duikang.degree}</div>
								<div class="">${duikang.onDate}</div>
								<div class="">${duikang.round}</div>

							</div>

							<div class="content_right">
								<div class="img">
									<img src="${duikang.logoB}" />
								</div>
								<div class="name">
									<span>${duikang.clubBName}</span>
								</div>

							</div>
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
				<span>首页</span>
			</div>
			<div class="zhanshu" onclick="zhanshuClick()">
				<span>战术</span>
			</div>
			<div class="zhandui" onclick="zhanduiClick()">
				<span>战队</span>
			</div>
			<div class="wode" onclick="wodeClick()">
				<span>我的</span>
			</div>
		</div>
	</div>

</body>
<script src="../../js/common/common.js"></script>
<script src="../../js/urlApi/api.js"></script>
<script src="../../js/part5/binglinchengxiazhuyemian.js"></script>
</html>