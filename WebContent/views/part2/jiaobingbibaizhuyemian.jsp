<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>浇冰必拜主页面</title>
		<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
		<link rel="stylesheet" href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css"/>
		<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css"/>
		<script type="text/javascript"  src="../../js/jQuery/jquery-2.2.3.min.js"></script>
		<script type="text/javascript"  src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>

	</head>
	
	
	<body>
		
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

		<div data-role="page" class="jiaobingbibaizhuyemain">	
				<div class="top">
					<a href="#" onClick="javascript :history.back(-1);" data-ajax="false"></a>
					<span >浇冰必拜</span>
				</div>
								
				<div class="search"	>				
					<!--
                    	data-filter="true"搜索过滤器
    					 如需为列表添加圆角和外边距，请使用 data-inset="true" 属性：
                    	data-filter-placeholder="搜索姓名 ..."搜索框内的内容更改
                    	列表分隔符，请向 <li> 元素添加 data-role="list-divider" 属性：
                    -->
					<ul data-role="listview"  data-inset="true" data-filter="true" data-filter-placeholder="精确搜索">
						
						<!--
							第一个冰场
                        -->
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
	
						<!--
							第二个冰场
                      -->
							<div class="day">
								<li data-role="list-divider" class="day">肖雪期</li>
							</div>
							
							<div class="name_content">
								<span>浩泰冰上中心</span>
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
									<img src="../../img/part2/b.jpg"/>
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="#">浩泰冰上中心</a></li>
									<div class="mid">010-64102356</div>
									<div class="content_bottom">冰球培训、交流</div>
								</div>
							</div>	
							
						
						
						<!--
							第三个冰场
                        -->
                  
							<div class="day">
								<li data-role="list-divider" class="day">日期</li>
							</div>
							
							<div class="name_content">
								<span>博宏俱乐部冰场</span>
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
									<img src="../../img/part2/e.jpg"/>
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="#">博宏俱乐部冰场</a></li>
									<div class="mid">010-64102356</div>
									<div class="content_bottom">冰球培训、交流</div>
								</div>
							</div>	
							
						<!--
							第四个冰场
                        -->
                        
                        
							<div class="day">
								<li data-role="list-divider" class="day">日期</li>
							</div>
							
							<div class="name_content">
								<span>KNX俱乐部冰场</span>
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
									<img src="../../img/part2/d.jpg"/>
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="#">KNX俱乐部冰场</a></li>
									<div class="mid">010-64102356</div>
									<div class="content_bottom">冰球培训、交流</div>
								</div>
							</div>	
							
						</div>
	    
					</ul>
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
	
	<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
</html>
