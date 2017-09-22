$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});
	$('.next').click(function() { // ---> 注意function为小写
		var height = $(".number").value;// 得到height的值
		submit(height);
	});
	function submit(height) {
		var data = {
			height : height,
		};
		jump(HEIGHTURL, data);

	}
});
