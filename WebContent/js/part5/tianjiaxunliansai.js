$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});

	// 点击登录
	$(".submitBtn").click(function() {
		var time = $("#time").val();
		var address = $("#address").val();
		var clubAName = $("#clubAName").val();
		var clubBName = $("#clubBName").val();
		var beizhu = $("#beizhu").val();

		if (time == "") {
			alert("请选择比赛时间");
			return false;
		}

		if (address == "") {
			alert("请输入比赛场地");
			return false;
		}

		if (clubAName == -1) {
			alert("请选择俱乐部");
			return false;
		}

		if (clubBName == -1) {
			alert("请选择俱乐部");
			return false;
		}
		if (clubBName == clubAName) {
			alert("您选择的对战双方俱乐部相同，请重新选择");
			return false;
		}
		// 请求后台服务
		var data = {
			operateType : "tijiaolinshisaishi",
			rinkId : address,
			teamAId : clubAName,
			teamBId : clubBName,
			remark : beizhu,
			time : time
		};
		//alert(JSON.stringify(data));
		jump(BINGLINCHENGXIAURL, data);
	});
});