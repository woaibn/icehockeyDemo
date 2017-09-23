<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>球员实名页</title>
<link rel="stylesheet"
	href="../../css/part4/tianbingtianjiangzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part4/qiuyuanshimingye.css" />

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

			<div data-role="content">
				<div class="text">
					<p>
						有头有脸，有名有姓
						<br/>更受欢迎
					</p>
				</div>

				<!--上传用户头像-->
				<form action="">
					<span class="uploadImg"> <input type="file"
						data-role="none" accept="image/png" name="touxiang"
						class="touxiang" id="touxiang" /> <img
						src="../../img/part4/user-photo.png" class="image" />
					</span>
					<!-- 上传用户昵称 -->
					<input type="text" name="name" class="name" id="name"
						data-role='none' placeholder="您的昵称" />

					<!--‘完成’按钮，点击触发事件-->
					<input type="button" value="完成" data-role='none' class="submitBtn"
						name="imgupload" id="imgupload" />
				</form>
				<form id="formimgupload" action="../../ImageUploadServlet"
					method="post" target="hidden_frame" enctype="multipart/form-data">
				</form>
				<iframe name="hidden_frame" id="hidden_frame" style="display: none;"></iframe>
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
	<script type="text/javascript" src="../../js/part4/alias.js"></script>
</body>
</html>