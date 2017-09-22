<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>体重</title>
<link rel="stylesheet"
	href="../../css/part4/tianbingtianjiangzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part4/weight.css" />
<link rel="stylesheet" href="../../css/part4/tizhong.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
</head>

<body>

	<div data-role="page" class="tianbingtianjiangzhuyemian main">
		<div data-role="content">
			<div class="header">
				<a href="#" onClick="javascript :history.back(-1);"
					data-ajax="false"></a>  
			</div>
			<h1 class="head">添兵添将</h1>

			<div class="text">
				<p>
					我们会根据您的身体资料<br /> 优化您的运动算法
				</p>
			</div>
			<br />
			<div class="weight_image" align="center">
				<img src="../../img/part4/manAll.png" />
			</div>
			<div data-role="fieldcontain">
				<input type="range" name="points" id="points" value="65" min="35"
					max="100" data-popup-enabled="true">
			</div>

			<div class="weight">
				<span>KG</span>
			</div>

			<div data-role="controlgroup" data-type="horizontal" class="btn">
				<a href="#" onClick="javascript :history.back(-1);"
					data-ajax="false" data-role="button" data-corners="true"
					data-transition="slide" class="back"> <span>上一步</span>
				</a> <a href="#" data-ajax="false" data-role="button"
					data-corners="true" data-transition="slide" class="next"> <span>下一步</span>
				</a>
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

	</div>

	<script src="../../js/common/common.js"></script>
	<script src="../../js/urlApi/api.js"></script>
	<script src="../../js/part4/weight.js"></script>
</body>
</html>