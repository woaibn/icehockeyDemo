$(function() {
	$('body').css({
		'min-height' : $(window).height()
	});
	$('.next').click(function() { // ---> 注意function为小写
		var weight = $(".number").text();// 得到weight的值
		submit(weight);
	});

	function submit(weight) {
		var data = {
			weight : weight,
		};
		var myForm = document.createElement("form");
		myForm.method = "post";
		myForm.action = WEIGHTURL;
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
