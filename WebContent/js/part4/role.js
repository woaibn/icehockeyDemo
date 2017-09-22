/**
 * Created by Administrator on 2017/7/17.
 */
$(function() {

	var sportEvent = null;

	$("#qiuyuan").click(function() {
		// 每个按钮执行的操作
		sportEvent = "QY";
		submit(sportEvent);
	});

	$("#jiaolian").click(function() {
		sportEvent = "JL";
		submit(sportEvent);
	});

	$("#shoumen").click(function() {
		sportEvent = "SM";
		submit(sportEvent);
	});
	$("#caipan").click(function() {
		sportEvent = "CP";
		submit(sportEvent);
	});
	$("#school").click(function() {
		window.location.href = "school.html";
		// sportEvent = "DS";
		// submit(sportEvent)
	});
	$("#xiehui").click(function() {
		// sportEvent = "DS";
		// submit(sportEvent)
		window.location.href = "team.html";
	});

	// 提交用户选择的信息
	function submit(sportEvent) {

		var data = {
			role : sportEvent,
		};
		jump(ROLEURL, data);

	}
});