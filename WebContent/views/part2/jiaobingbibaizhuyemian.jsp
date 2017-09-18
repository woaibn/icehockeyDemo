<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>浇冰必拜主页面</title>
<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css" />
<script type="text/javascript" src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script type="text/javascript"
	src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".shouye").click(function() {
			window.location.href = "../part1/zhukongyemian.jsp";
		});
		$(".zhanshu").click(function() {
			window.location.href = "../part7/zhanshubanzhuyemian.jsp";
		});
		$(".zhandui").click(function() {
			window.location.href = "";
		});
		$(".wode").click(function() {
			window.location.href = "../part8/wodezhongxin.jsp";
		});
	});
</script>

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

	<div data-role="page" class="jiaobingbibaizhuyemain">
		<div class="top">
			<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
			<span>浇冰必拜</span>
		</div>

		<div class="search">
			<!--
                    	data-filter="true"搜索过滤器
    					 如需为列表添加圆角和外边距，请使用 data-inset="true" 属性：
                    	data-filter-placeholder="搜索姓名 ..."搜索框内的内容更改
                    	列表分隔符，请向 <li> 元素添加 data-role="list-divider" 属性：
                    -->
			<ul data-role="listview" data-inset="true" data-filter="true"
				data-filter-placeholder="精确搜索">

				<!--
							<div class="playground">
							<div class="day">
								<li data-role="list-divider" class="day">日期</li>
							</div>
							
							<div class="name_content">
								<span>西三旗冰场</span>
								
								<div class="huanjing">
									<span>环境指数:</span>
									<img src="../../img/part2/star.png" />
									<img src="../../img/part2/star.png" />
									<img src="../../img/part2/star.png" />
									<img src="../../img/part2/star.png" />
									<img src="../../img/part2/star.png" />
								</div>
							</div>	
							
							<div class="content">
								<div class="content_img">
									<img src="../../img/part2/c.jpg"/>
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="#">西三旗虎仔俱乐部冰场</a></li>
									<div class="mid">010-64102356</div>
									<div class="content_bottom">冰球培训、交流</div>
								</div>
							</div>	
						</div>
                        -->
				<!--
                        	 var：迭代参数的名称。在迭代体中可以使用的变量的名称，用来表示每一个迭代变量。类型为String。 
           					items：要进行迭代的集合。对于它所支持的类型将在下面进行讲解。 
         					  varStatus：迭代变量的名称，用来表示迭代的状态，可以访问到迭代自身的信息。 

                        -->

				<div class="playground">
					<c:choose>
						<c:when test="${!empty places}">
							<!--搜索的是冰场的名字,若冰场名字存在，则..-->
							<c:forEach items="${places}" var="place" varStatus="st">

								<div class="day">
									<li data-role="list-divider" class="day">开放日期：${place.openDate}</li>
								</div>

								<div class="name_content">

									<span><a onclick="goto1('${place.placeName}')">${place.placeName}</a></span>

									<div class="huanjing">
										<span>环境指数:</span> <img src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" /> <img
											src="../../img/part2/star.png" />
									</div>
								</div>
								<div class="content">
									<div class="content_img">
										<img src="../../img/part2/c.jpg" />
										<!-- <img>${place.image}</img> -->
									</div>
									<div class="content_div_right">
										<li class="content_top"><a href="">${place.placeName}</a></li>
										<div class="mid">${place.placeNumber}</div>
										<div class="content_bottom">${place.placeAddress}</div>
									</div>
								</div>

							</c:forEach>
						</c:when>
						<c:otherwise>
							<P>没有记录</P>
						</c:otherwise>
					</c:choose>

				</div>

			</ul>
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
<script src="../../js/part2/jiaobingbibaizhuyemian.js"></script>
<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
</html>
