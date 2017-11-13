<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>添兵添将主页面</title>
<link rel="stylesheet" href="../../css/part2/jiaobingbibaizhuyemian.css" />
<link rel="stylesheet"
	href="../../css/part4/tianbingtianjiangzhuyemian.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part1/allpagesame.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>


<script type="text/javascript">
	$(document).ready(function() {
		$(".submitBtn1").click(function() {
			window.location.href = "sousuohuochuangjianqiuyuan.jsp";
		});
		$(".submitBtn").click(function() {
			window.location.href = "";
		});
	});
</script>
</head>



<body>
	<body >

			 		   
		<div data-role="page" id="pageone" class="allpage">
			<!--标题-->
			<div class="top">	
				        <div href="#" onClick="javascript :history.back(-1);" data-ajax="false" class="back">	
		                    	<img src="../../img/part1/back.png" />
				        </div>
					    <div class="biaoti">
								添兵添将
					    </div>
			</div>
		
			<!--查询框-->
			<div class="search_a">
							<div class="search_c">
								<input type="submit" data-role='none' value="添加" class="submitBtn1"></input>
							</div>
				
							<div class="search_b">
								<input type="text" name="search" id="search" placeholder="输入球员姓名模糊查询">
							</div>
							
							<div class="search_d">
                                                  <!--搜索之后在当前页面显示  -->
								<input type="submit" data-role='none' value="搜索" class="submitBtn"></input>
							</div>
			</div>
			

			
			<div data-role="content" class="all">
				<c:choose>
		    		<c:when test="${!empty playerId}">
		    			<c:forEach items="${playerId}" var="playerId" varStatus="st">
					    	<div class="everyone" onclick="goto1('${player.playerId}')">
								<div class="day">所属俱乐部：</div>
								<div class="team">
									<div class="content_left">
													<div class="image">
														<img src="../../img/part4/lady.png" />
													</div>
									</div>
					
									<div class="content_mid">
													<div class="name">姓名:${player.name}</div>
													<div class="sex">性别:${player.sex}</div>
													<div class="height">身高:${player.height}</div>
					
									</div>
					
									<div class="content_right">
													<div class="weight">体重:${player.weight}</div>
													<div class="countryId">国籍:${player.countryId}</div>
													<div class="cityId">城市:${player.cityId}</div>
									</div>		
								</div>	
							</div>
						</c:forEach>		
    		        </c:when>
    			</c:choose>

	        </div>
	        <!--
                	<div class="everyone">
					<div class="day">所属俱乐部：</div>
					<div class="team">
						<div class="content_left">
										<div class="image">
											<img src="../../img/part4/lady.png" />
										</div>
						</div>
		
						<div class="content_mid">
										<div class="name">姓名</div>
										<div class="sex">性别</div>
										<div class="height">身高</div>
		
						</div>
		
						<div class="content_right">
										<div class="weight">体重</div>
										<div class="countryId">国籍</div>
										<div class="cityId">城市</div>
						</div>		
					</div>	
				</div>
                -->
				
			<!--
            	<div class="playground">
				<c:choose>
					<c:when test="${!empty users}">
						<c:forEach items="${users}" var="user" varStatus="st">

							<div class="day">

								<li data-role="list-divider" class="day">2017-01-12星期日</li>

							</div>

							<div class="name_content">
								<span>球员姓名：${user.userName}</span>
							</div>
							<div class="content">
								<div class="content_img">
									<img src="../../img/part2/c.jpg" />
								</div>
								<div class="content_div_right">
									<li class="content_top"><a href="">球员姓名：${user.userName}</a></li>
									<div class="mid">性别：${user.sex}</div>
									<div class="content_bottom">身高：${user.height}</div>
									<div class="content_bottom">体重：${user.weight}</div>
									<div class="content_bottom">国籍：${user.country}</div>
									<div class="content_bottom">城市：${user.city}</div>
								</div>
							</div>

						</c:forEach>
					</c:when>
					<c:otherwise>
						<P>没有记录</P>
					</c:otherwise>
				</c:choose>

			</div>

            -->
			

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

		</div>

	<script src="../../js/common/common.js"></script>
	<script src="../../js/urlApi/api.js"></script>
	<script src="../../js/part4/tianbingtianjiangzhuyemian.js"></script>
</body>
</html>