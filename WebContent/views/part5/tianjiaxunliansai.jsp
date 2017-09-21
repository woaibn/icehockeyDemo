<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>添加训练赛</title>
<link rel="stylesheet" href="../../css/part5/tianjiaxunliansai.css" />
<link rel="stylesheet"
	href="../../css/jqueryMobile/jquery.mobile-1.4.5.min.css" />
<link rel="stylesheet" href="../../css/part1/zhucedengluyemain.css" />
<script src="../../js/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../js/jqueryMobile/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".yiguanzhu").click(function() {
			window.location.href = "daikaifa.jsp";
		});
		$(".saishixuanze").click(function() {
			window.location.href = "daikaifa.jsp";
		});
	});
</script>

</head>

<body>
	<div data-role="page" class="main">
		<div class="button1" onclick="javascript:history.back(-1);">
			<img src="../../img/part8/back.png" />
		</div>

		<h1 class="head">兵临城下</h1>

		<div class="button2">
			<div class="yiguanzhu">
				<span>已关注</span>
			</div>
			<div class="saishixuanze">
				<span>赛事选择</span>
			</div>
		</div>
		<div class="button3">
			<div class="a">
				<span>时间:</span>
			</div>
			<input type="datetime-local"  class="time"
				placeholder="" id="time" />
		</div>
		<div class="button3">
			<div class="a">
				<span>场地:</span>
			</div>

			<input type="text" data-role='none' class="shurukuang1"
				placeholder="" id="address" />

		</div>


		<div class="button4">
			<div class="a">
				<span>对阵双方:</span>
			</div>
			<div>
				<input type="text" data-role='none' class="shurukuang2"
					placeholder="" id="clubAName" />
			</div>
			<div class="vs">
				<span>VS</span>
			</div>
			<div>
				<input type="text" data-role='none' class="shurukuang2"
					placeholder="" id="clubBName" />
			</div>
		</div>


		<div class="button5">
			<div class="a">
				<span>备注:</span>
			</div>
			<div>
				<input type="text" data-role='none' class="shurukuang4"
					placeholder="" id="beizhu" />
			</div>
		</div>

		<div class="queren">
			<input type="submit" data-role='none' value="确认" class="submitBtn"></input>
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

</body>
<script src="../../js/common/common.js"></script>
<script src="../../js/urlApi/api.js"></script>
<script src="../../js/part5/tianjiaxunliansai.js"></script>
</html>