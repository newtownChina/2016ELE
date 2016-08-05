<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="Keywords" content="饿了么">
  <meta name="Description" content="饿了么个人中心">
  <link type="text/css" rel="stylesheet" href="iconfont/iconfont.css" />
  <link type="text/css" rel="stylesheet" href="iconfont3/iconfont3.css" />
  <title>Document</title>
  <link type="text/css" rel="stylesheet" href="css/profile.css" />
 </head>
 <body>
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
			<span id="second">注册/登录</span>		
		</div>
	</div>
	<div class="location">
		<div class="loc_left">当前位置: <var>普陀区武宁小城旁(中山北路/兰田路路口南)</var><a href="javascript:void(0)">[切换地址]</a></div>
	</div>
	<div class="body">
		<div class="b_left">
			<ul class="first_layer">
				<li><span class="iconfont">&#xe686;</span>个人中心</li>
				<li><span class="iconfont">&#xe605;</span>我的订单
					<a href="javascript:void(0)">近三个月订单</a>
					<a href="javascript:void(0)">待评价订单</a>
					<a href="javascript:void(0)">退单记录</a>
				</li>
				<li><span class="iconfont">&#xe68a;</span>我的资产
					<a href="javascript:void(0)">我的红包</a>
					<a href="javascript:void(0)">账户余额</a>
					<a href="javascript:void(0)">我的积分</a>
				</li>
				<li><span class="iconfont">&#xe60c;</span>我的资料
					<a href="javascript:void(0)">个人资料</a>
					<a href="javascript:void(0)">地址管理</a>
					<a href="javascript:void(0)">安全中心</a>
					<a href="javascript:void(0)">修改密码</a>
				</li>
				<li><span class="iconfont">&#xe616;</span>我的收藏</li>
			</ul>
		</div>
		<div class="b_right">
			<div class="b_r_top">
				<div class="t_1">
					<div id="t1">
						<img width="120" height="120" src="images/defaultphoto.png" alt="头像" />
						<a id="shadow" href="javascript:void(0)">编辑资料</a>
					</div>
					<div id="t2">
						<h3><span>早上好，</span>新乡医学院牛孝英</h3>
						<p id="tip">订餐了吗？提前订餐送的快！</p>
						<p id="safe">账户安全：高 查看详情</p>
						<p id="contact"><a href="javascript:void(0)">Tel</a>&nbsp;<a href="javascript:void(0)">Email</a></p>
					</div>
				</div>
				<div class="t_2">
					<p class="row_1">我的红包</p>
					<p class="row_2">0个</p>
					<a href="javascript:void(0)">查看红包</a>
				</div>
				<div class="t_3">
					<p class="row_1">我的红包</p>
					<p class="row_2">0个</p>
					<a href="javascript:void(0)">查看红包</a>
				</div>
				<div class="t_4">
					<p class="row_1">账户余额</p>
					<p class="row_2">0.00元</p>
				</div>
			</div>
			<div class="b_r_mid">
				<div class="tab_nav"><a class="recent_order" href="javascript:void(0)">最近订单</a><a class="all_order" href="javascript:void(0)">查看全部订单&gt;</a></div>
				<div class="tab_cont">
					<div class="note">
						<p>
							<img src="images/noorder.png" width="90" height="110" alt="没有订单图"/>
							你最近没有下过单，现在就去&nbsp;<a href="javascript:void(0)" style="color:#0089dc">订餐</a>&nbsp;吧~
						</p>
					</div>
				</div>
			</div>
			<div class="b_r_btm">
				<div class="tab_nav">
					<a class="footprint" href="javascript:void(0)">美食足迹</a>
					<a class="collection" href="javascript:void(0)">我的收藏</a>
					<a class="paginate" href="javascript:void(0)">&gt;</a>
					<a class="paginate" href="javascript:void(0)">&lt;</a>
					<span>1/7</span>
				</div>
				<div class="tab_cont">
					<div class="shop">
						<div class="s_l">
							<img width="70" height="70" alt="" src="images/frypan.webp" />
							<span id="time">30分钟</span>
						</div>
						<div class="s_r">
							<h3>The frypan炸鸡啤酒</h3>
							<p>★★★★★月售4000单</p>
							<p>20元起送/免费配送</p>
							<p>付</p>
						</div>
					</div>
					<div class="shop">
						<div class="s_l">
							<img width="70" height="70" alt="" src="images/frypan.webp" />
							<span id="time">30分钟</span>
						</div>
						<div class="s_r">
							<h3>The frypan炸鸡啤酒</h3>
							<p>★★★★★月售4000单</p>
							<p>20元起送/免费配送</p>
							<p>付</p>
						</div>
					</div>
					<div class="shop">
						<div class="s_l">
							<img width="70" height="70" alt="" src="images/frypan.webp" />
							<span id="time">30分钟</span>
						</div>
						<div class="s_r">
							<h3>The frypan炸鸡啤酒</h3>
							<p>★★★★★月售4000单</p>
							<p>20元起送/免费配送</p>
							<p>付</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer"></div>
	<div class="shortcutBar">
		<div id="order"><span class="iconfont dingdan ">&#xe605;</span></div>
		<div id="cart"><span class="iconfont dingdan ">&#xe66d;</span><b>购物车</b></div>
		<div id="myInfo"><span class="iconfont dingdan ">&#xe60f;</span></div>
		<div id="history"><span class="iconfont dingdan ">&#xe60d;</span></div>
		<div id="qrCode"><span class="iconfont dingdan ">&#xf0030;</span></div>
		<div id="customService"><span class="iconfont dingdan ">&#xe643;</span></div>
	</div>
 </body>
</html>
