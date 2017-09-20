$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});
	// 
	$("#man").click(function() {
		submit('man');
		//window.location.href = "manWeight.html";
	});

	// 性别"lady"击事件
	$("#lady").click(function() {
		submit('lady');
		//window.location.href = "ladyWeight.html";
	});

	// 请求后台服务
	function submit(gender) {
		var data = {
			gender : gender
		};
		// 请求后台保存数据
		var myForm = document.createElement("form");
		myForm.method = "post";
		myForm.action = GENDERURL;
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
	}
});
