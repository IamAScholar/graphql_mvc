<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<link href="css/haiersoft.css" rel="stylesheet" type="text/css"
	media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"
	media="print" />
<script src="js/jquery-1.10.1.min.js"></script>
<script src="js/side.js" type="text/javascript"></script>
<script src="js/former.js" type="text/javascript"></script>
<script src="js/popwin.js" type="text/javascript"></script>
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body>
	<!-- wrap_left -->
	<div class="wrap_left" id="frmTitle" name="fmTitle">
		<!-- Logo -->
		<div id="Logo">
			<span>人单合一</span>
		</div>
		<!-- /Logo -->

		<!-- menu_list -->
		<script>
$(function() {
    $(".menu_list dd");
    $(".menu_list dt").click(function(){
        $(this).toggleClass("open").next().slideToggle("fast");
    });
});
</script>
		<div class="menu_list">
			<dl>
				<dt>
					<span>执行操作</span>
				</dt>
				<dd>
					<a href="showSqls.do" title="查看所有sql">查看所有sql</a> <a href="showErrorSqls.do" title="查看错误sql">查看错误sql</a>
					 <a id="p" href="javascript:void(0)" title="执行多个sql">执行多个sql</a>
					 <a  href="javascript:void(0)" onclick="errorSqls()" title="执行错误sql">执行错误sqls</a>
			</dl>
		</div>
		<!-- /menu_list -->
	</div>
	<!-- /wrap_left -->

	<!-- picBox -->
	<div class="picBox" onclick="switchSysBar()" id="switchPoint"></div>
	<!-- /picBox -->



	<!-- wrap_right -->
	<div class="wrap_right">
		<header>
			<!-- Header -->
			<div id="Header">
				<!-- Head -->
				<div id="Head">
					<h1 title="途游游戏bi sql后台管理">
						<img src="images/common/page_ttl.gif" width="398" height="26"
							alt="途游游戏bi sql后台管理">
					</h1>
					<script language="javascript">
function showmenu(id){id.style.visibility = "visible";}
function hidmenu(){UserList.style.visibility = "hidden";}
document.onclick = hidmenu;
</script>
		</header>


		<!-- Contents -->
		<div id="Contents">
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

			<div id="MainForm">
				<div class="form_boxA">
					<h2>错误sql</h2>
					<table cellpadding="0" cellspacing="0">
						<tr>
							<th>序号</th>
							<th>sid</th>
							<th>sql</th>
							<th>介绍</th>
							<th>错误exception</th>
					        <th>exe_time</th>
					        <th>sql_time</th>
					        <th>操作</th>
						</tr>
						<tr>
						   <c:if test="${ListSqls.size()!=0}">
							<c:forEach var="sql" items="${ListSqls}" begin="0"
								end="${ListSqls.size()-1}" step="1" varStatus="i">
								<tr>
									<td>${sindex+i.index+1}</td>
									<td>${sql.exe_id}</td>
									<td><textarea id='${sql.exe_id}'
											style="width: 400px; height: 120px;">${sql.exe_sql}</textarea></td>
									<td style="width: 200px; height: 120px;">${sql.instruction}</td>
									<td style="width: 200px; height: 120px;">${sql.exception}</td>
									<td >${sql.sql_day}</td>
									<td >${sql.exe_time}</td>
									<td><ul id='exe'>
											<li id='li${sql.exe_id}' onclick='update(${sql.exe_id})'>更改</li>|
											<li id='exe${sql.exe_id}' onclick='exe(${sql.exe_id})'>重新执行</li>
										</ul></td>
								</tr>
							</c:forEach>
							</c:if>
						</tr>

					</table>
					<p class="msg">共找到${count}条错误sql记录</p>
				</div>
			</div>
			<!-- /MainForm -->
			<!-- PageNum -->
			<ul id="PageNum">
				<li><a href="showSql.do?start=${start-1}">上一页</a></li>
				<c:forEach begin="1" end="${count/10+1}" step="1" varStatus="i">
					<c:if test="${start==i.index}">
						<li style='background-color:#CFF; height:35px; line-height:35px; padding:0px 15px;font-size:16px;color:#343;'>${i.index}
						<li>
					</c:if>
					<c:if test="${start!=i.index}">
						<li><a href="showErrorSqls.do?start=${i.index}">${i.index}</a></li>
					</c:if>

				</c:forEach>
				<li><a href="showErrorSqls.do?start=${start+1}">下一页</a></li>

			</ul>
			<!-- /PageNum -->
		</div>
		<!-- /Contents -->

		<!-- /footer -->
		<footer>
			<address>
				电子邮箱：@tuyoogame.com 技术支持：数据平台项目组<br>在线途游科技有限公司
			</address>
		</footer>
		<!-- /footer -->

	</div>
	<!-- /wrap_right -->
</body>
</html>