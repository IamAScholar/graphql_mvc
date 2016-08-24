<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="js/jquery-1.10.1.min.js"></script>
<script src="js/side.js" type="text/javascript"></script>
<script src="js/former.js" type="text/javascript"></script>

<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body>
<!-- Popup -->
<div id="Popup">

<!-- SubPopup -->
<div id="SubPopup">
<script type="text/javascript">
$(function(){
$(".select").each(function(){
var s=$(this);
var z=parseInt(s.css("z-index"));
var dt=$(this).children("dt");
var dd=$(this).children("dd");
var _show=function(){dd.slideDown(200);dt.addClass("cur");s.css("z-index",z+1);};
var _hide=function(){dd.slideUp(200);dt.removeClass("cur");s.css("z-index",z);};
dt.click(function(){dd.is(":hidden")?_show():_hide();});
dd.find("a").click(function(){dt.html($(this).html());_hide();});
$("body").click(function(i){ !$(i.target).parents(".select").first().is(s) ? _hide():"";});})})
</script>
<div class="form_boxC">
<table cellpadding="0" cellspacing="0">
<tr>
<th width="100">sql id 列表</th>
<td><!-- selectbox -->
<div class="selectbox" style="width:230px;">
<dl class="select">
<input id="sqlId" type=text></dl>
</div>
<!-- /selectbox --></td><td>每个id以逗号隔开</td>
</tr>
<tr>
<th>开始时间</th>
<td><!-- selectbox -->
<div class="selectbox" style="width:230px;">
<dl class="select">
<input id='interval'type=text>
</dl>
</div>
<!-- /selectbox --></td><td>格式yyyy-MM-dd</td>
</tr>
<tr>
<th>结束时间</th>
<td><!-- selectbox -->
<div class="selectbox" style="width:230px;">
<dl class="select">
<input id="time"type=text></dl>
</div>
<!-- /selectbox --></td><td>格式yyyy-MM-dd</td>
</tr>

</table>
</div>
</div>
<!-- SubPopup -->

<div id="BtmBtn">
<div class="btn_boxB floatR mag_l20"><input name="" type="button" value="取消" style="visibility:hidden;" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
<div class="btn_box floatR"><input onclick="patchExe()" name="" type="button" value="提交" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
</div>
</div>
<!-- /Popup -->
</body>
</html>