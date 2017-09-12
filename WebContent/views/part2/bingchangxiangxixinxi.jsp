<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<title>冰场详细信息</title>
<link rel="stylesheet" href="../../css/part2/bingchangxiangxixinxi.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"
	type="text/javascript"></script>
</head>

<body>
	<script>
		(function(doc, win) {
			var docEl = doc.documentElement, resizeEvt = 'orientationchange' in window ? 'orientationchange'
					: 'resize', recalc = function() {
				var clientWidth = docEl.clientWidth;
				if (!clientWidth)
					return;
				docEl.style.fontSize = 16 * (clientWidth / 720) + 'px';
			};

			if (!doc.addEventListener)
				return;
			win.addEventListener(resizeEvt, recalc, false);
			doc.addEventListener('DOMContentLoaded', recalc, false);
		})(document, window);
	</script>



	<div data-role="page" class="bingchangxiangxixinxi">
		<div class="top">
			<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
			<span>场地信息</span>
		</div>

		<div class="logo">
			<img src="../../img/part2/top.jpg" />
		</div>


		<div class="content">
			<div class="content_div">
				<span>位置、电话</span>
				<!--
                       <div><img src="../../img/part2/next1.png"   /></div>
                        -->
			</div>

			<div class="content_div">
				<span>所属机构</span>

			</div>

			<div class="content_div">
				<span>场地名称</span>

			</div>

			<div class="content_div">
				<span>冰场等级</span>

			</div>

			<div class="content_div">
				<span>陆地训练室</span>

			</div>

			<div class="content_div">
				<span>冰场面积</span>

			</div>

			<div class="content_div">
				<span>是否接受散滑</span>

			</div>

			<div class="content_div">
				<span>开放时间</span>

			</div>


		</div>
	</div>

	<div class="button">
		<div onclick="shouyeClick()">
			<span>首页</span>
		</div>
		<div onclick="zhanshuClick()">
			<span>战术</span>
		</div>
		<div onclick="zhanduiClick()">
			<span>战队</span>
		</div>
		<div onclick="wodeClick()">
			<span>我的</span>
		</div>
	</div>

</body>
<script src="../../js/common/common.js"></script>
<script src="../../js/urlApi/api.js"></script>
</html>
