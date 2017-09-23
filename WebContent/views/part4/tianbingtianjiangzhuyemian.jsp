<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>添兵添将主页面</title>
<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
<link rel="stylesheet"
	href="../../css/part4/tianbingtianjiangzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />

<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".tianjia").click(function() {
			window.location.href = "sousuohuochuangjianqiuyuan.jsp";
		});
		$(".content").click(function() {
			window.location.href = "qiuyuanxiangxixinxi.jsp";
		});

	});
</script>
</head>

<body>
	<div data-role="page" class="tianbingtianjiangzhuyemian main">
		<div data-role="content">
			<div class="header">
				<a href="#" onClick="javascript :history.back(-1);"
					data-ajax="false"></a> 
					<img
					src="../../img/part4/plus.png" / class="tianjia">
			</div>
			<h1 class="head">添兵添将</h1>
			<div class="search">
			<div class="search_a">
				<div class="search_b">
					<input type="text" name="search" id="search" placeholder="精确查询">
				</div>
				<div>
					<input type="submit" data-role='none' value="搜索" class="submitBtn"></input>
				</div>

			</div>
			</div>
			
			
			<div class="playground">
				<c:choose>
					<c:when test="${!empty users}">
						<c:forEach items="${users}" var="user" varStatus="st">

							<div class="day">

								<li data-role="list-divider" class="day">2017-01-12星期日</li>

							</div>

							<div class="name_content">
								<span>球员姓名：${user.userName}</span>
							</div>
							<div class="content">
								<div class="content_img">
									<img src="../../img/part2/c.jpg" />
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="">球员姓名：${user.userName}</a></li>
									<div class="mid">性别：${user.sex}</div>
									<div class="content_bottom">身高：${user.height}</div>
									<div class="content_bottom">体重：${user.weight}</div>
									<div class="content_bottom">国籍：${user.country}</div>
									<div class="content_bottom">城市：${user.city}</div>
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

	<script src="../../js/common/common.js"></script>
	<script src="../../js/urlApi/api.js"></script>
	<script src="../../js/part4/tianbingtianjiangzhuyemian.js"></script>
</body>
</html>