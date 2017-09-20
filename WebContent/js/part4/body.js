/**
 * Created by Administrator on 2017/7/4.
 */
$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});
	// 点击"下一步"按钮
	
	$(".next").click(function() {
		var time = $(".time").val();
		var touwei = $(".touwei").val();
		var bichang = $(".bichang").val();
		var tuichang = $(".tuichang").val();
		var xiaojiaochang = $(".xiaojiaochang").val();
		var jiaochang = $(".jiaochang").val();
		var jiaoxing = $(".jiaoxing").val();

		if (touwei == "") {
			alert("请输入您的头围!");
			return false;
		}
		if (bichang == "") {
			alert("请输入您的臂长!");
			return false;
		}
		if (tuichang == "") {
			alert("请输入您的腿长!");
			return false;
		}
		if (xiaojiaochang == "") {
			alert("请输入您的小腿长!");
			return false;
		}
		if (jiaochang == "") {
			alert("请输入您的脚长!");
			return false;
		}
		if (jiaoxing == "") {
			alert("请输入您的脚型!");
			return false;
		}
		var urlUserId = comm.getUrlParameter("userid");// 解析url中的参数获取userid的值
		// 请求后台服务
		var data = {
			time : time,
			touwei : touwei,
			bichang : bichang,
			tuichang : tuichang,
			xiaojiaochang : xiaojiaochang,
			jiaochang : jiaochang,
			jiaoxing : jiaoxing,
			userid : urlUserId
		};
		//alert(JSON.stringify(data));
		var myForm = document.createElement("form");
		myForm.method = "post";
		myForm.action = BODYURL;
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
	});
	
	
	
	$(".tiaoguo").click(function() {
		
		// 请求后台服务
		var data = {
		};
		var myForm = document.createElement("form");
		myForm.method = "post";
		myForm.action = BODYURL;
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
	});
	
	

});