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
		var r = confirm("确认要提交么");
		if (r == true) {
			var data = {
				handlingId : sportEvent,
			};

			// alert(JSON.stringify(data));
			var myForm = document.createElement("form");
			myForm.method = "post";
			myForm.action = HANDLINGURL;
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
		} else {
		}
	}
});