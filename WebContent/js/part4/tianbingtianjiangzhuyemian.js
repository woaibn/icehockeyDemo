/**
 * 20170920bylmy
 */
function goto1(para) {
	var data = {
		operateType : "tianbingtianjiangzhuyemian",
		placeName : para,
	};
	// alert(JSON.stringify(data));
	jump(TIANBINGTIANJIANGURL, data);
}

$(".submitBtn").click(function() {
	// 请求后台服务
	var searchName = $("#search").val();
	var data = {
		operateType : "sousuo",
		placeName : searchName,
	};
	//alert(JSON.stringify(data));
	jump(TIANBINGTIANJIANGURL, data);
});
