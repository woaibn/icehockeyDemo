<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>搜索或创建球员</title>
<link rel="stylesheet"
	href="../../css/part4/sousuohuochuangjianqiuyuan.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />

<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>

</head>

<body>

	<div data-role="page" class="sousuohuochaungjianqiuyuan main">
		<div data-role="content">
			<div class="header">
				<a href="#" onClick="javascript :history.back(-1);"
					data-ajax="false"></a> 
			</div>
			<h1 class="head">添兵添将</h1>

			<div class="search">
				<div data-role="fieldcontain">
						<label for="search" class="text">请输入搜索姓名：</label> <input data-role=""
							type="search" name="search" id="search" placeholder="">
					</div>
					<input type="submit" data-inline="true" value="搜索" id="searchbtn">
				
			</div>

			<div id="new_btn">
				<button>创建新球员</button>
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
	<script type="text/javascript"
		src="../../js/part4/sousuohuochuangjianqiuyuan.js"></script>
</body>
</html>