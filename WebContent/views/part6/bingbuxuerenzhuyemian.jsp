<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>兵步雪刃主页面</title>
<link rel="stylesheet" href="../../css/part6/bingbuxuerenzhuyemian.css" />
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

		<h1 class="head">兵布雪刃</h1>
		<div class="button2">
			<div id="xunlian" onclick="xunlianClick()">
				<span>训练</span>
			</div>
			<div id="bisai" onclick="bisaiClick()">
				<span>比赛</span>
			</div>
		</div>
		<div class="renyuanxuanze">人员选择</div>
		<div class="renyuan">
			<div class="renyuan1" onclick="renyuan1Click()"></div>
			<div class="renyuan2" onclick="renyuan2Click()"></div>
			<div class="renyuan3" onclick="renyuan3Click()"></div>
			<div class="renyuan4" onclick="renyuan4Click()"></div>
			<div class="renyuan5" onclick="renyuan5Click()"></div>
		</div>
		<div class="button3" onclick="xiayibuClick()">
			<span>下一步</span>
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
</html>