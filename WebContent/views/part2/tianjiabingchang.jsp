<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>基本信息修改</title>
<link rel="stylesheet" href="../../css/part1/allpagesame.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part2/tianjiabingchang.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
</head>

<body>
	<div data-role="page" class="allpage">
		<div class="top">
			<div onClick="javascript :history.back(-1);" data-ajax="false"
				class="back">
				<img src="../../img/part1/back.png" />
			</div>
			<div class="biaoti">添加冰场</div>

		</div>

		<div  data-role="content"  class="content">
				<div class="content_div">
					<div class="content_div_left">冰场名称：</div>
					<div class="content_div_right">
						<input type="text" name="rinkName" class="rinkName" id="rinkName"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">位置：</div>
					<div class="content_div_right">
						<input type="text" name="heiaddressght" class="address" id="address"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">场地电话：</div>
					<div class="content_div_right">
						<input type="text" name="telephone" class="telephone" id="telephone"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">所属机构：</div>
					<div class="content_div_right">
						<input type="text" name="jigou" class="jigou" id="jigou"
							data-role='none' />
					</div>
				</div>


				<div class="content_div">
					<div class="content_div_left">室内/室外:</div>
					<div class="content_div_right">
						<select data-role='none' id="indoor" class="select_div">
							<c:choose>
								<c:when test="${!empty indoors}">
									<c:forEach items="${indoors}" var="indoor" varStatus="st">
										<option class="option" value='${rink.indoor}'></option>
									</c:forEach>
								</c:when>
							</c:choose>
						</select>
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">有无更衣室:</div>
					<div class="content_div_right">
						<select data-role='none' id="hasLocker" class="select_div">
							<c:choose>
								<c:when test="${!empty hasLockers}">
									<c:forEach items="${hasLockers}" var="hasLocker" varStatus="st">
										<option class="option" value='${rink.hasLocker}'></option>
									</c:forEach>
								</c:when>
							</c:choose>
						</select>
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">有无停车场:</div>
					<div class="content_div_right">
						<select data-role='none' id="hasCarparks" class="select_div">
							<c:choose>
								<c:when test="${!empty hasCarparks}">
									<c:forEach items="${hasCarparks}" var="hasCarpark" varStatus="st">
										<option class="option" value='rink.hasCarpark'></option>
									</c:forEach>
								</c:when>
							</c:choose>
						</select>
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">冰场训练等级:</div>
					<div class="content_div_right">
						<select data-role='none' id="trainingDegree" class="select_div">
							<c:choose>
								<c:when test="${!empty trainingDegrees}">
									<c:forEach items="${trainingDegrees}" var="trainingDegree" varStatus="st">
										<option class="option" value='rink.trainingDegree'></option>
									</c:forEach>
								</c:when>
							</c:choose>
						</select>
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">规模：</div>
					<div class="content_div_right">
						<input type="text" name="scale" class="scale" id="scale"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">有无陆地训练室:</div>
					<div class="content_div_right">
						<select data-role='none' id="hasLandTrainingRoom" class="select_div">
							<c:choose>
								<c:when test="${!empty hasLandTrainingRooms}">
									<c:forEach items="${hasLandTrainingRooms}" var="hasLandTrainingRoom" varStatus="st">
										<option class="option" value='rink.hasLandTrainingRoom'></option>
									</c:forEach>
								</c:when>
							</c:choose>
						</select>
					</div>
				</div>
				
				
				<div class="content_div">
					<div class="content_div_left">占地面积：</div>
					<div class="content_div_right">
						<input type="text" name="area" class="area" id="area"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">冰面面积：</div>
					<div class="content_div_right">
						<input type="text" name="iceArea" class="iceArea" id="iceArea"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">建成时间：</div>
					<div class="content_div_right">
						<input type="text" name="completionDate" class="completionDate" id="completionDate"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">投入使用时间：</div>
					<div class="content_div_right">
						<input type="text" name="beginUseDate" class="beginUseDate" id="beginUseDate"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">开放时间：</div>
					<div class="content_div_right">
						<input type="text" name="openTime" class="openTime" id="openTime"
							data-role='none' />
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">是否接受散滑:</div>
					<div class="content_div_right">
						<select data-role='none' id="allowedSlip" class="select_div">
							<c:choose>
								<c:when test="${!empty allowedSlips}">
									<c:forEach items="${allowedSlips}" var="allowedSlip" varStatus="st">
										<option class="option" value='rink.allowedSlip'></option>
									</c:forEach>
								</c:when>
							</c:choose>
						</select>
					</div>
				</div>
				
				<div class="content_div">
					<div class="content_div_left">冰面类型：</div>
					<div class="content_div_right">
						<input type="text" name="iceType" class="iceType" id="iceType"
							data-role='none' />
					</div>
				</div>


				<input type="button" value="修改完成" data-role='none' class="submitBtn"
					name="imgupload" id="imgupload" />
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
	<script type="text/javascript" src="../../js/part4/jibenxinxixiugai.js"></script>
</body>
</html>