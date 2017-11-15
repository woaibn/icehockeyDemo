/**
 * 
 */
$(document).ready(function() {
		
		$(".zengjia").click(function() {//添加赛事
			var data = {
					operateType : "tianjianxunliansai"
				};
				jump(BINGLINCHENGXIAURL, data);
			//window.location.href = "tianjiaxunliansai.jsp";
		});
		$(".yiguanzhu").click(function() {
			window.location.href = "daikaifa.jsp";
		});
		$(".saishixuanze").click(function() {
			window.location.href = "daikaifa.jsp";
		});
	});