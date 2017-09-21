$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});
	$('.next').click(function() { // ---> 注意function为小写
		var weight = $("#points").text();// 得到weight的值
		submit(weight);
	});

	function submit(weight) {
		var data = {
			weight : 50,
		};
		//alert(JSON.stringify(data));
		jump(WEIGHTURL, data);
		
	}
});
