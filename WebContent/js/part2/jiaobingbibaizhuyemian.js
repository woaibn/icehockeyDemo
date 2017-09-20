/**
 * 201709120001bylmy
 */
function goto1(para) {
	var data = {
		operateType : "JiaoZhuToJiaoXiang",
		placeName : para,
	};
	// alert(JSON.stringify(data));
	jump(JIAOBINGBIBAIURL, data);
}

$(".submitBtn").click(function() {
	// 请求后台服务
	var searchName = $("#search").val();
	var data = {
		operateType : "sousuo",
		placeName : searchName,
	};
	//alert(JSON.stringify(data));
	jump(JIAOBINGBIBAIURL, data);
});
