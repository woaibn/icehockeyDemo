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
<link rel="stylesheet" href="../../css/part1/allpagesame.css" />

<style>
.ui-page-theme-a .ui-btn {
	text-decoration: none;
	color: white;
	background-color: rgb(0, 43, 47);
	border-color: rgb(0, 47, 47);
}
</style>


</head>

<div data-role="page" id="pageone" class="allpage">
	<!--标题-->
	<div class="top">
		<div onClick="javascript :history.back(-1);" data-ajax="false"
			class="back">
			<img src="../../img/part1/back.png" />
		</div>
		<div class="biaoti">兵临城下</div>
		<div class="zengjia" onclick="zengjiaClick()">
			<img src="../../img/part5/plus.png" />
		</div>
	</div>




	<!--导航栏-->
	<div data-role="navbar" class="navbar">
		<ul>
			<li><a href="#"><div>已关注</div></a></li>
			<li><a href="#pagetwo"><div>赛事选择</div></a></li>
		</ul>
	</div>

	<!--导航栏下面内容-->
	<div data-role="content" class="all">
		<c:choose>
			<c:when test="${!empty competitions}"}>
				<c:forEach items="${competitions}" var="competition" varStatus="st">
					<div class="everyone" onclick="goto1('${rink.rinkId}')">

						<div class="day">比赛时间：${competition.competitionTime}</div>
						<!--年月日时间 -->

						<div class="changdi">比赛场地：${rink.rinkName}</div>
						<div class="huanjing">环境指数:</div>
						<div class="team">
							<div class="content_left">
								<div class="img">
									<img src="${competition.teamAImage}" />
								</div>
								<div class="name">${competition.teamAId}</div>
							</div>

							<div class="content_mid">
								<div class="">${competition.competitionDegree}</div>
								<div class="">${competition.Time}</div>
								<!--时、分时间 -->
								<div class="">${competition.round}</div>

							</div>

							<div class="content_right">
								<div class="img">
									<img src="${competition.teamBImage}" />
								</div>
								<div class="name">${competition.teamBId}</div>
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


<div data-role="page" id="pagetwo" class="allpage">
	<!--标题-->
	<div class="top">
		<div onClick="javascript :history.back(-1);" data-ajax="false"
			class="back">
			<img src="../../img/part1/back.png" />
		</div>
		<div class="biaoti">兵临城下</div>
		<div class="zengjia" onclick="zengjiaClick()">
			<img src="../../img/part5/plus.png" />
		</div>
	</div>




	<!--导航栏-->
	<div data-role="navbar" class="navbar">
		<ul>
			<li><a href="#pageone"><div>已关注</div></a></li>
			<li><a href="#"><div>赛事选择</div></a></li>
		</ul>
	</div>

	<!--导航栏下面内容-->
	<div data-role="content" class="all">
		<c:choose>
			<c:when test="${!empty rinkId}"}>
				<c:forEach items="${rinkId}" var="rinkId" varStatus="st">
					<div class="everyone" onclick="goto1('${rink.rinkId}')">

						<div class="day">比赛时间：${competition.competitionTime}</div>
						<!--年月日时间 -->

						<div class="changdi">比赛场地：${rink.rinkName}</div>
						<div class="huanjing">环境指数:</div>
						<div class="team">
							<div class="content_left">
								<div class="img">
									<img src="${competition.teamAImage}" />
								</div>
								<div class="name">${competition.teamAId}</div>
							</div>

							<div class="content_mid">
								<div class="">${competition.competitionDegree}</div>
								<div class="">${competition.Time}</div>
								<!--时、分时间 -->
								<div class="">${competition.round}</div>

							</div>

							<div class="content_right">
								<div class="img">
									<img src="${competition.teamBImage}" />
								</div>
								<div class="name">${competition.teamBId}</div>
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