$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});
	$('.next').click(function() { // ---> 注意function为小写
		var height = $(".number").text();// 得到height的值
		submit(height);
	});
	function submit(height) {
		var data = {
			height : height,
		};
		var myForm = document.createElement("form");
		myForm.method = "post";
		myForm.action = HEIGHTURL;
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
