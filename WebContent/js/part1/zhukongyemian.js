$(document).ready(function() {
	$(".a").click(function() {
		// 请求后台服务
		var data = {
			operateType : "zhukongToJiaoZhu",
		};
		alert(JSON.stringify(data));
		jump(JIAOBINGBIBAIURL, data);
		
		//window.location.href = "../part2/jiaobingbibaizhuyemian.jsp";
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
	$(".shouye").click(function() {
		window.location.href = "zhukongyemian.jsp";
	});
	$(".zhanshu").click(function() {
		window.location.href = "../part7/zhanshubanzhuyemian.jsp";
	});
	$(".zhandui").click(function() {
		window.location.href = "";
	});
	$(".wode").click(function() {
		window.location.href = "../part8/wodezhongxinyemian.jsp";
	});
});