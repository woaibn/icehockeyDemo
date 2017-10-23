<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>球员详细信息</title>
<link rel="stylesheet"
	href="../../css/part4/tianbingtianjiangzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part4/jiechubangding.css" />

<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$(".jiechubangding").click(function() {
			alert("您确认要解除绑定吗？");
		});
		$(".xinxione").click(function() {
			window.location.href = "xiangxixinxi.jsp";
		});
		$(".xinxitwo").click(function() {
			window.location.href = "shujvxinxi2.jsp";
		});
		$(".retu").click(function() {
			window.location.href = "retu.jsp";
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
			</div>
            <h1 class="head">添兵添将(待开发)</h1>			
			<span class="jiechubangding">解除绑定</span>
			
			
			<div class="xinxione">
				<h1>详细信息1</h1>
					
			</div>
			<div class="xinxitwo">
				<h1>详细信息2</h1>
			</div>
			<div class="retu">
				<h1>热图</h1>
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
	<script type="text/javascript" src="../../js/part4/zuoyoushougan.js"></script>
</body>
</html>