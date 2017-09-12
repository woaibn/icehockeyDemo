var comm = {
	getUrlParameter : function(name){
	    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
	    var r = window.location.search.substr(1).match(reg);
	    if (r != null) {
	        return unescape(r[2]);
	    }
	    return null;
	}
};
/*这个方法是获得页面url的某个url参数的方法*/

//访问后台函数
function jump(url,data) {
	//var data = {};
	var myForm = document.createElement("form");
	myForm.method = "post";
	myForm.action = url;
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
