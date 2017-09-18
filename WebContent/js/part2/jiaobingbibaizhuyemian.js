/**
 * 201709120001bylmy
 */
function goto1(para) {
	var data={
		operateType:"JiaoZhuToJiaoXiang",
		placeName:para,
	};
	alert(JSON.stringify(data));
	jump(JIAOBINGBIBAIURL,data);
}
