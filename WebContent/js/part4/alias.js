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
		var name = $("#name").val();
		if (touxiang == "") {
			alert("请选择您的头像");
			return false;
		}
		if (name == "") {
			alert("请输入您的昵称!");
			return false;
		}
		$("#formimgupload").append($("#touxiang"));
		$("#formimgupload").hide();
		$("#formimgupload").submit();				
		});

});
function callback(content) {
	var name = $("#name").val();
	// 请求后台服务
	var data = {
		touxiang : content,
		name : name,
		};
	jump(ALIASURL, data);
}