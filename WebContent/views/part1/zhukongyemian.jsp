<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">	
		<title>主控页面</title>
		<link rel="stylesheet" href="../../css/part1/zhukongyemian.css" />
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css"/>
		<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css"/>
		<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>	
	
	</head>
	
	<body>
		
		<div data-role="page" class="zhukongyemian">
			<div class="zhukongyemian_top">
			
				<div class="backimage">
					<img src="../../img/part1/fengwo.png" />
				</div>
				
				
              	    <div class="f"><span>浇兵必拜</span></div>
					<div class="b"><span>冰天雪地</span></div>
					<div class="c"><span>添兵添将</span></div>
					<div class="d"><span>兵临城下</span></div>
					<div class="e"><span>冰步雪刃</span></div>
				
				
				
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
		
		 <script src="../../js/common/common.js"></script>
		<script src="../../js/urlApi/api.js"></script>
		<script src="../../js/part1/zhukongyemian.js"></script>
	</body>
</html>