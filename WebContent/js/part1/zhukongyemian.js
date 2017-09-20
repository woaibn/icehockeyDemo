$(document).ready(function() {
	$(".a").click(function() {
		// 请求后台服务
		var data = {
			operateType : "zhukongToJiaoZhu",
		};
		jump(JIAOBINGBIBAIURL, data);
	});
	$(".b").click(function() {
		window.location.href = "../part3/bingtianxuedizhuyemian.jsp";
	});
	$(".c").click(function() {
		window.location.href = "../part4/tianbingtianjiangzhuyemian.jsp";
	});
	$(".d").click(function() {
		window.location.href = "../part5/binglinchengxiazhuyemian.jsp";
	});
	$(".e").click(function() {
		window.location.href = "../part6/bingbuxuerenzhuyemian.jsp";
	});
	
});