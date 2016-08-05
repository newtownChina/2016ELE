<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>饿了么_网上订餐_外卖_饿了么订餐官网</title>
  <link href="css/index.css" type="text/css" rel="stylesheet">
 </head>
 <body>	
	<!--上半部分-->
	<div class="up">
		<div class="up_cnt">
			<div class="up_top">
				<div class="logo"></div>
				<div class="regAndLogin">
					<span class="reg"><a href="register.jsp">注册</a></span>|
					<span class="login"><a href="login.jsp">登录</a></span>
					<span class="openShop"><a href="http://kaidian.ele.me/" target="_blank">我要开店</a></span>
				</div>			
			</div>
			<div class="slogan"></div>
			<div class="search">
				<div class="city" onclick="showCityList()"><span id="location">上海</span><span class="triangle"></span></div>
				<div class="search_cont"><input type="text" placeholder="请输入你的收货地址（写字楼、小区，街道或者学校）"/></div>
				<div class="search_btn"><input id="s_btn" type="submit" value="搜索" onclick="showMap()"></div>
			</div>
			<div id="container">
				<div id="infoWindow">
					<a id="close" href="javascript:void(0)" onclick="closeWin()">×</a>
					<p id="p_1">呢经路呢经路呢经路</p>
					<p id="p_2">小区小区小区小区</p>
					<p id="p_3">附近有&nbsp;<span style="color:#0089DC">33</span>&nbsp;家外卖商家</p>
					<a id="viewShop" href="doPlace?cityCode=100000">查看商家</a>
					<span id="pointer"></span>
				</div>
			</div>
			<div class="buildingsAndCar"></div>
			<div class="chooseCity">
				<span class="triangle2"></span>
				<div class="tip"><span id="cp">请选择你所在的城市</span><span id="cp2">选城市&nbsp;&gt;&nbsp;定位置&nbsp;&gt;&nbsp;叫外卖</span></div>
				<div class="searchCity"><span id="guess">猜你在</span><span id="guessCity">上海</span><span id="seperator">|</span><span id="sc"><input type="text" placeholder="请输入城市" /></span></div>
				<div class="citysList"></div>
			</div>
		</div>
	</div>
	<!--下半部分-->
	<div class="down">
		<div class="d"><div>
	</div>
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<!--引入高德地图api-->
	<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=8c62511028c24b24cf623c7e10977e50"></script>
	<!--引入工具条-->
	<script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
	<script type="text/javascript">
		/*用于判断是否显示了地图，显示地图的时候那么城市选择列表的位置也要发生改变*/
		var ifShow = false;
		/*隐藏标语显示地图*/
		function showMap(){
			$(".slogan").animate({
				marginTop:"-600px"
			},300);
			$(".search").animate({
				marginLeft:"0",
				marginTop:"700px"
			},0,function(){
				$(this).animate({
					margin:"500px 0 0 0"
				},400)
			});
			$("#container").slideDown(400);
			$(".chooseCity").hide();
			ifShow = true;
		}
		/*显示城市列表*/
		var firstClick = true;
		function showCityList(){
			$(".chooseCity").toggle();
			if(ifShow){
				$(".chooseCity").css({
					"left":"0",
					"top":"180px"
				});
			}
			if(firstClick){
				$.post("resources/city.txt",function(data){
					   var json = eval("("+data+")");
					   for(var key in json){
						   letter = json[key]//当前字母对应的城市数目
						   var html="";
						   for(var k in letter){
							   html+=("<li>"+letter[k]+"</li>");
						   }
							$(".citysList").append("<div class='c' style='height:"+letter.length/8*58+"px"+"'><a>"+key+"</a><ul>"+html+"</ul></div>");
					   }
					   /*根据城市名称设置中心点*/
						$(".c ul li").each(function(){
							AMap.event.addDomListener($(this).get(0), 'click', function() {
								var cityName = $(this).text().trim();
								$("#location").text(cityName);//更改城市名称
								$(".chooseCity").hide();//隐藏城市选择列表
								if (!cityName) {
									cityName = '北京市';
								}
								map.setCity(cityName);
							});
						})
						/*根据城市名称设置中心点*/
				});
				firstClick = false;
			}
		}
		/*加载地图*/
		var map = new AMap.Map('container', {
			resizeEnable: true,
			zoom:12,
			center: [116.397428, 39.90923]
		});
		/*结束加载地图*/
		/*显示点标记和周边信息*/
		var infoWin = new AMap.InfoWindow({
			isCustom:true,
			autoMove:true,
			content:document.getElementById("infoWindow"),
			offset:new AMap.Pixel(600, -200)
		})
		var marker;
		map.on('click', function(e) {
			$("#infoWindow").show();//显示信息窗体
			if(!marker){
				marker = new AMap.Marker({
					position: e.lnglat,
					map: map,
					draggable:true
				});
				infoWin.setPosition(e.lnglat);
				infoWin.open(map,e.lnglat);
			}else{
				marker.setPosition(e.lnglat);
				infoWin.setPosition(e.lnglat);
				infoWin.open(map,e.lnglat);
			}
		});
		/*显示点标记和周边信息*/
		/*关闭信息窗口*/
		function closeWin(){
			$("#infoWindow").hide();
		}
		/*关闭信息窗口*/

	</script>
 </body>
</html>

