/**
 * Created by Administrator on 2017/7/17.
 */
$(function() {
	var sportEvent = null;
	$('#left').on('click', function() {
		sportEvent = "LEFT";
		submit(sportEvent);
	});
	$('#right').on('click', function() {
		sportEvent = "RIGHT";
		submit(sportEvent);
	});
	// 提交用户选择的信息
	function submit(sportEvent) {

		var data = {
			handlingId : sportEvent,
		};
	//	alert(JSON.stringify(data));
		jump(HANDLINGURL, data);

	}
});