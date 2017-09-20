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
	var myForm = document.createElement("form");
	myForm.method = "post";
	myForm.action = ALIASURL;
	myForm.style.display = "none";
	for ( var k in data) {
		var myInput = document.createElement("input");
		myInput.name = k;
		myInput.value = data[k];
		myForm.appendChild(myInput);
	}
	document.body.appendChild(myForm);
	myForm.submit();
	return myForm;
	
	$.post(ALIASURL,data,function(result) {
		var jsonReturn = JSON.parse(result);// 将JSON字符串转换为对象
		if (jsonReturn.result == "0") {
			window.location.href = "../main.html?userid="+jsonReturn.userid;
			}else if (jsonReturn.result == "-1") {
				alert("当前没有登录用户");
			}
		}, "json");
}