function update(id) {
	var sid = "#" + id;
	var iid = "#instruction" + id;
	// alert($(iid).val());
	var url = "update.do?sql_id=" + id + "&exe_sql=" + $(sid).val()
			+ "&instruction=" + $(iid).val();
	$.post(url);
	// alert(url);
	var bid = "#li" + id;
	// alert(bid);
	$(bid).html("已更改");
	// alert(url);
}
function errorSqls() {
	var r = confirm("请确认错误sql的bug已经更改！！！")
	if (r == true) {
		url = "errorSqlsExe.do"
		$.post(url);
		alert("程序已经开始执行，请耐心等待！！！")
	}
}
function exe(id) {
	var bid = "#exe" + id;
	var startId = "#start" + id;
	var intervalId = "#interval" + id;
	var startDay = $(startId).val();
	var num = $(intervalId).val();
	var runId = '#ru' + id;
	if ($(bid).html() == "已执行") {
		alert("正在执行");
	} else {
		if ($(runId).text() != "running") {

			if ((/^[1-9]*[1-9][0-9]*$/.test(num))
					&& (/^\d{4}\-[0-1]\d\-[0-3]\d$/g.test(startDay))) {
				var url = "exeAgineServlet.do?sql_id=" + id + "&start_time="
						+ startDay + "&interval=" + num;
				// alert(url);
				$.post(url);
				$(runId).text('running');
				$(bid).html('已执行');
			} else {
				alert("请按格式输入日期跟间隔");
				// $(function() {
				// $(".popup01 a").on('click' , function(){
				// popWin.showWin("500","630","warn","warn.html");
				// });
				// });
			}
		} else {
			alert("此sql（" + id + "）后台正在执行！！！请勿重新提交");
		}
	}

	// alert(url);
	// $.post(url);
	// alert(bid);

	// alert(url);
}
$(function() {
	$("#p").on('click', function() {
		popWin.showWin("600", "375", "manySqlExe", "manySqls.do");
	});
});
function patchExe() {
	var sqlIdList = $("#sqlId").val();
	var time = $("#time").val();
	var interval = $("#interval").val();
	
	if (sqlIdList.indexOf("-") >= 0) {
		var one = sqlIdList.split(",");
		var lastr = "";
		var len = one.length
		for (var v = 0; v < len; v++) {
			var s1 = one[v].split("-");
			var slen = s1.length
			if (slen >= 2) {
				var start = parseInt(s1[0]);
				var end = parseInt(s1[1]);
				for (var i = start; i <= end; i++) {
					if (lastr == "") {
						lastr = "" + i;
					} else {
						lastr = lastr + "," + i;
					}
				}
			} else {
				if (lastr == "") {
					lastr = "" + s1[0];
				} else {
					lastr = lastr + "," + s1[0];
				}
			}

		}
		sqlIdList=lastr;
		//alert(lastr);
	}
	var sqlIdCheck = sqlIdList.split(",").join("");
	// alert((!isNaN(sqlIdCheck))&&(/^\d{4}\-[0-1]\d\-[0-3]\d$/g.test(time))&&(!isNaN(interval)));
	if ((!isNaN(sqlIdCheck))
			&& (/^\d{4}\-[0-1]\d\-[0-3]\d$/g.test(time) && (/^\d{4}\-[0-1]\d\-[0-3]\d$/g
					.test(interval)))) {
		var date = new Date(time);
		var date1 = new Date(interval);
		var date_diff = Math.abs(date.getTime() - date1.getTime()) / 86400000;
		var url = "manySqlsExe.do?sqlIdList=" + sqlIdList + "&start_time="
				+ time + "&interval=" + date_diff;
		 alert(url);
		$.post(url);
		alert("程序已经开始执行，请耐心等待！！！")
	} else {
		alert("请按格式输入日期跟间隔");

	}

}
