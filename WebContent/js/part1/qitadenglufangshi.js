$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});

	// 点击登录
	$(".submitBtn").click(function() {
		var phoneNumber = $("#phoneNumber").val();
		var verificationCode = $("#verificationCode").val();
		var password = $("#newPassword").val();

		if (phoneNumber == "") {
			alert("请输入手机号码");
			return false;
		}

		if (verificationCode == "") {
			alert("验证码不能为空!");
			return false;
		}

		if (password.length < 8) {
			alert("请输入至少8位密码");
			return false;
		}
		// 请求后台服务
		var data = {
			phoneNumber : phoneNumber,
			verificationCode : verificationCode,
			newPassword : password
		};
		//alert(JSON.stringify(data));
		jump(LOGIN_API, data);
	});
});