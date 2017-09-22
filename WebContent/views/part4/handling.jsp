<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>左右手杆</title>
<link rel="stylesheet"
	href="../../css/part4/tianbingtianjiangzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part4/zuoyoushougan.css" />

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
				<span> 告诉我们你的用杆习惯 </span>
			</div>


			<div class="chiganfangshi_bottom">
				<div class="chiganfangshi_left">
					<div>
						<img src="../../img/part4/zuoshougan.png" id="left" /> <span>左手杆</span>
					</div>
				</div>
				<div class="chiganfangshi_right">
					<div>
						<img src="../../img/part4/youshougan.png" id="right" /> <span>右手杆</span>
					</div>
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

	</div>

	<script src="../../js/common/common.js"></script>
	<script src="../../js/urlApi/api.js"></script>
	<script src="../../js/part4/handling.js"></script>
	
</body>
</html>