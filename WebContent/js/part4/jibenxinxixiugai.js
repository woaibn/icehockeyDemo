/**
 * Created by Administrator on 2017/7/4.
 */
$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});

	// 点击'完成'按钮
	$("#imgupload").click(function() {

		var touxiang = $("#touxiang").val();
		var clubName = $("#clubName").val();
		var height = $("#height").val();
		var weight = $("#weight").val();
		var pos = $("#position").val();
		var role = $("#role").val();
		var handling=$("#handling").val();
		var time = $("#time").val();
		
		$("#formimgupload").append($("#touxiang"));
		$("#formimgupload").hide();
		$("#formimgupload").submit();				
		});

});

function callback(content) {
		var clubName = $("#clubName").val();
		var  height= $("#height").val();
		var weight = $("#weight").val();
		var pos = $("#position").val();
		var role = $("#role").val();
		var handling=$("#handling").val();
		var time = $("#time").val();
	// 请求后台服务
	var data = {
		touxiang :content,
		clubName : clubName,
		weight:weight,
		height:height,
		pos:pos,
		role:role,
		handling:handling,
		time:time
		};
		
	jump(ALIASURL, data);
}