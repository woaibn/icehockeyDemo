<!DOCTYPE html>
<html class="teamInfo_html">
	<head>
		<meta charset="UTF-8">
		<title>冰场详细信息</title>
		<link rel="stylesheet" href="../../css/part2/bingchangxiangxixinxi.css"/>
		<script src="../../js/jQuery/jquery-2.2.3.min.js" type="text/javascript"></script>
		<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css"/>
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
		<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js" type="text/javascript"></script>
		
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
	
	<body >
		<script>
			(function(doc, win) {
				var docEl = doc.documentElement,
					resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
					recalc = function() {
						var clientWidth = docEl.clientWidth;
						if(!clientWidth) return;
						docEl.style.fontSize = 16 * (clientWidth / 720) + 'px';
					};

				if(!doc.addEventListener) return;
				win.addEventListener(resizeEvt, recalc, false);
				doc.addEventListener('DOMContentLoaded', recalc, false);
			})(document, window);
		</script>
		
		
		
		<div data-role="page" class="bingchangxiangxixinxi">
			    <div class="top">
					<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
					<span >场地信息</span>
				</div>

				<div class="logo"> <img src="../../img/part2/top.jpg" /></div>

			
				<div class="content">
					<div class="content_div">
						<span>位置、电话 :${Place.placeNumber}</span>
					</div>
		
					<div class="content_div">
						<span>所属机构:${Place.suoshujigou}</span>
		
					</div>
		
					<div class="content_div">
						<span>场地名称:${Place.placeName}</span>
		
					</div>
		
					<div class="content_div">
						<span>冰场等级:${Place.trainingDegree}</span>
		
					</div>
		
					<div class="content_div">
						<span>陆地训练室:${Place.landTrainingRoom}</span>
		
					</div>
		
					<div class="content_div">
						<span>冰场面积:${Place.iceArea}</span>
		
					</div>
		
					<div class="content_div">
						<span>是否接受散滑:${Place.acceptIndividual}</span>
		
					</div>
		
					<div class="content_div">
						<span>开放时间:${Place.openDate}</span>
		
					</div>
		
		
				</div>
					
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
		
	</body>
</html>
