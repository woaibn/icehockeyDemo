<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>其它登录方式页面</title>
		<link rel="stylesheet" href="../../css/part1/qitadenglufangshi.css" />
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css"/>
		<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css"/>
		<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
	
	</head>

	<body>
		
		<div data-role="page" class="qitadenglufangshi">	
				<div class="top">
					<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
					<span >手机注册</span>
				</div>

				<div >
					<input type="text" data-role='none' class="phoneNumber" placeholder="输入注册时的手机号" id="phoneNumber"/>	
				</div>
				
				
				<div class="yanBtn">
					<input type="text" data-role='none' class="verificationCode" placeholder="输入验证码" id="verificationCode"/>
					<a href="#" data-role="button"  class="getCode" id="getCode"><span >获取验证码</span></a>
				</div>
				
				<div >
					<input type="password" data-role='none' class="newPassword" placeholder="请输入至少8位新密码" id="newPassword"/>	
				</div>
				
				<div >
					<input type="submit" data-role='none' value="登录"   class="submitBtn"></input>
				</div>
            	     
			    <div class="errorBtn">
            	    <a href="error.html"  data-ajax="false" style="text-decoration: none;"> 登录遇到问题</a>
                </div>
					
					
					
				<div class="loginOther">
					<span>推荐登录</span>
				</div>
				
				<div class="loginList">
					<a href="" class="weixin" data-ajax="false"><img src="../../img/part1/weixin.png"/></a>
					<a href="" class="weibo" data-ajax="false"><img src="../../img/part1/weibo.png"/></a>
					<a href="" class="qq" data-ajax="false"><img src="../../img/part1/qq.png"/></a>
				</div>	
				
				<div class="button">
							<div class="shouye" onclick="shouyeClick()">
								<span>首页</span>
							</div>
							<div  class="zhanshu" onclick="zhanshuClick()">
								<span>战术</span>
							</div>
							<div  class="zhandui" onclick="zhanduiClick()">
								<span>战队</span>
							</div>
							<div class="wode" onclick="wodeClick()">
								<span>我的</span>
							</div>
				   </div>	
				
        </div>
        
        <script src="../../js/common/common.js"></script>
		<script src="../../js/urlApi/api.js"></script>
		<script src="../../js/part1/qitadenglufangshi.js"></script>
		
	</body>

</html>