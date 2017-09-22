<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>冰天雪地主页面</title>
<link rel="stylesheet" href="../../css/part3/bingtianxuedizhuyemian.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"
	type="text/javascript"></script>
</head>

<body>
	<div data-role="page" class="bingtianxuedizhuyemian">
		<div class="top">
			<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
			<span>冰天雪地主页面</span>
		</div>

		<div class="wait">
			<span> 功能待开发！ </span>
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

</body>
<script src="../../js/common/common.js"></script>
<script src="../../js/urlApi/api.js"></script>
</html>
