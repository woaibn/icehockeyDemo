<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>待开发</title>
		<link rel="stylesheet" href="../../css/part5/daikaifa.css" />
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
    </head>
    
    
    <body>
		<div data-role="page" class="main">
			<div class="button1" onclick="javascript:history.back(-1);">
				<img src="../../img/part8/back.png" />
			</div>
			<h1 class="head">
				待开发
			</h1>
			
	
		</div>

	</body>
</html>