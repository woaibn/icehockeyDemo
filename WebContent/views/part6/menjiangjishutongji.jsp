<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>门将技术统计</title>
		<link rel="stylesheet" href="../../css/part6/menjiangjishutongji.css" />
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
		<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
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
		<script type="text/javascript">
			$(document).ready(function(){
			  $(".shouye").click(function(){
			    window.location.href="../part1/zhukongyemian.jsp";
			  });
			  $(".zhanshu").click(function(){
			    window.location.href="../part7/zhanshubanzhuyemian.jsp";
			  });
			  $(".zhandui").click(function(){
			    window.location.href="";
			  });
			  $(".wode").click(function(){
			    window.location.href="../part8/wodezhongxin.jsp";
			  });
			});
		</script>
	</head>
	<body>
		<div data-role="page" class="main">
			
			<div id="saishigundong">
				<span>赛事滚动</span>
			</div>
			<div class="button1">
				<div  onclick="diyijieClick()">
					<span>第一节</span>
				</div>
				<div  onclick="dierjieClick()">
					<span>第二节</span>
				</div>
				<div  onclick="disanjieClick()">
					<span>第三节</span>
				</div>
				<div  onclick="disijieClick()">
					<span>第四节</span>
				</div>
				<div  onclick="diwujieClick()">
					<span>第五节</span>
				</div>
			</div>
		</div>
	</body>
</html>
