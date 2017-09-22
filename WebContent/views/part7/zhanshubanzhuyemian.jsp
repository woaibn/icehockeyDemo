<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>战术板主页面</title>
<link rel="stylesheet" href="../../css/part7/zhanshubanzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
	<div data-role="page" class="main"></div>
	<div class="wait">
		<span> 功能待开发！ </span>
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
</body>
<script src="../../js/common/common.js"></script>
<script src="../../js/urlApi/api.js"></script>
</html>
