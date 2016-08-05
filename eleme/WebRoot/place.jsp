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
  <title>[地点]</title>
  <link type="text/css" rel="stylesheet" href="iconfont/iconfont.css" />
  <link type="text/css" rel="stylesheet" href="iconfont3/iconfont3.css" />
  <link type="text/css" rel="stylesheet" href="css/place.css">
 </head>
 <body ondragstart="return false">
	<div class="head_nav">
		<div class="logo"></div>
		<div class="nav">
			<ul>
				<li><a href="index.jsp">首页</a></li>
				<li><a href="place.jsp">品牌商家<span class="iconfont">&#xe67c;</span></a></li>
				<li><a href="profile.jsp">我的订单</a></li>
				<li>加盟合作</li>
			</ul>
		</div>
		<div class="servers"></div>
		<div class="regAndLogin">
			<span id="first" class="iconfont">&#xe60c;</span>
			<span id="second"><a href="register.jsp">注册</a>/<a href="login.jsp">登录</a></span>		
		</div>
	</div>
	<div class="location">
		<div class="loc_left">当前位置: <var>普陀区武宁小城旁(中山北路/兰田路路口南)</var><a href="javascript:void(0)">[切换地址]</a></div>
		<div class="loc_right"><input type="text" placeholder="搜索商家,美食..."><span class="iconfont">&#xe612;</span></div>
	</div>
	<div class="banners">
		<ul id="ban">
			<li><img width="1185" height="100" alt="轮播图" src="images/banner_1.webp" /></li>
			<li><img width="1185" height="100" alt="轮播图" src="images/banner_2.webp" /></li>
			<li><img width="1185" height="100" alt="轮播图" src="images/banner_3.webp" /></li>
			<li><img width="1185" height="100" alt="轮播图" src="images/banner_4.webp" /></li>
		</ul>
		<div id="ban_btn">
			<ul>
				<li>1</li>
				<li>2</li>
				<li>3</li>
				<li>4</li>
			</ul>
		</div>
	</div>
	<div class="classify">
		<div class="c">
			<div id="c_top">
				<span id="c_t_l">商家分类:</span>
				<ul id="c_t_r">
					<li>全部商家</li>
					<li>品牌商家</li>
					<li>快餐便当</li>
					<li>特色菜系</li>
					<li>异国料理</li>

					<li>小吃夜宵</li>
					<li>甜品饮品</li>
					<li>果蔬生鲜</li>
					<li>鲜花蛋糕</li>
					<li>商店超市</li>
				</ul>
			</div>
			<div id="c_bottom">
				<div id="c_b_l">
					<span>默认排序</span>
					<a id="highSales">销量高</a>
					<a id="highEval">评价好</a>
					<a id="otherSort">其它排序</a>
					<a>起送价格:不限</a>
				</div>
				<div id="c_b_r">
					<input id="c_1" type="checkbox">
					<label for="c_1">新开商家</label>
					<input id="c_2" type="checkbox">
					<label for="c_2">免配送费</label>
					<input id="c_3" type="checkbox">
					<label for="c_3">蜂鸟专送</label>
					<input id="c_4" type="checkbox">
					<label for="c_4">可开发票</label>
					<input id="c_5" type="checkbox">
					<label for="c_5">在线支付</label>
				</div>
			</div>
		</div>
	</div>
	<!--品牌商家-->
	<div class="brands">
		<span>想吃好点的，看看附近&nbsp;<var >72家</var>&nbsp;品牌商家吧，<a href="javascript:void(0)">立即查看</a></span>
	</div>
	<div class="allShops">
		<ul id="all">
			<!--根据后台数据循环添加li-->
			${shopsHtml}
		</ul>
		
	</div>
	<div class="footer"></div>
	<!--右侧快捷栏-->
	<div class="shortcutBar">
		<div class="container">
			<div id="order"><span class="iconfont dingdan ">&#xe605;</span></div>
			<div id="cart"><span class="iconfont dingdan ">&#xe66d;</span><b>购物车</b></div>
			<div id="myInfo"><span class="iconfont dingdan ">&#xe60f;</span></div>
			<div id="history"><span class="iconfont dingdan ">&#xe60d;</span></div>
			<div id="qrCode"><span class="iconfont dingdan ">&#xf0030;</span></div>
			<div id="customService"><span class="iconfont dingdan ">&#xe643;</span></div>
		</div>
	</div>
	<div class="shortcutBarCont">
		<div class="s_t">我的订单</div>
		<div class="s_b"></div>
	</div>
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			/*分类按钮*/
			$("#ban_btn ul li").click(function(){
				/*按钮颜色*/
				$(this).css({
					"color":"white",
					"backgroundColor":"#ff6000"
				}).siblings().css({
					"color":"#000",
					"backgroundColor":"#fff"
				});
				var _index = $(this).index();
				$("ul#ban").animate({
					marginTop:(-100*_index)+"px"
				},300);
			});
			/*右侧快捷栏按钮*/
			var flag=true;
			$().click(function(){
				
			});
			$(".container div").click(function(){
				$(this).css({
					"backgroundColor":"#1E89E0"
				}).siblings().css({
					"backgroundColor":"#504D53"
				});
				if(flag){
					$(".shortcutBar").animate({
						"right":"250px"					
					},300);
					$(".shortcutBarCont").animate({
						"right":"0"
					},300);
					flag=false;
				}else{
					$(".shortcutBar").animate({
						"right":"0"					
					},300);
					$(".shortcutBarCont").animate({
						"right":"-250px"
					},300);
					$(".container div ").css({
						"backgroundColor":"#504D53"
					})
					flag=true;
				}
			});
			/*$.ajax({
				type:"post",
				url:"",
				data:,
				success:function(data){
					alert(data);
				}
				
			});*/
		})
	</script>
 </body>
</html>
