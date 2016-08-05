<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
	<head>
		<!--声明当前页面的编码集：charset=gbk,gb2312(中文编码)，utf-8国际编码-->
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<!--当前页面的三要素-->
		<title>订单信息</title>
		<meta name="Keywords" content="关键词,关键词">
		<meta name="description" content="">
		<link href="css/checkout.css" rel="stylesheet" type="text/css">
	</head>
<body>
	<div class="content">
		<div class="c_header">
			<div class="c_nav">
				<span class="c_nav_path">当前位置：
					<a href="#">红旗区大学城新乡医学院图书馆</a>
					<a href="#">吃米</a>
					订单信息
				</span>
			</div>
		</div>
		<div class="up">
			<div class="up_top">
				<div class="t_container">
					<a class="c_logo" href="#" >
						<i class="l_icon"></i>
					</a>
					<span class="l_text">订单信息</span>
				</div>
			</div>
			<div class="up_container">
				<div class="c_left">
					<div class="l_cont">
						<div class="c_title">
							<h2>订单详情</h2>
							<a href="#">&lt;返回商家修改</a>
						</div>
						<div class="c_tablehead">
							<div class="t_name">商品</div>
							<div class="t_count">份数</div>
							<div class="t_total">小计（元）</div>
						</div>
		
						<dl class="c_group">
							<dt class="g_grouptitle">1号购物车</dt>
							<dd class="g_scope">
								<div class="s_tabrow">
									<div class="t_itemname">米</div>
									<div class="t_quantity">
										<button type="button" >-</button>
										<input type="text" class="q_valid" value="1" >
										<button type="button">+</button>
									</div>
									<div class="t_total">￥1.00</div>
								</div>
							</dd>
							<dd class="g_scope">
								<div class="s_tabrow">
									<div class="t_itemname">西红柿炒鸡蛋</div>
									<div class="t_quantity">
										<button type="button" >-</button>
										<input type="text" class="q_valid" value="1" >
										<button type="button">+</button>
									</div>
									<div class="t_total">￥1.00</div>
								</div>
							</dd>
						</dl>
						<ul class="c_message">
							<li class="m_estra">
								<div class="t_itemname e_name">配送费</div>
								<div class="e_quantity"></div>
								<div class="e_total">￥0.00</div>
							</li>
						</ul>
						<div class="c_total">￥
							<div>11.00</div>
						</div>
						<div class="c_extra">共
							<span>2</span>份商品
						</div>
					</div>
				</div>
		<style type="text/css">
		
		</style>
				<div class="c_right">
					<div class="r_title">
						<h2>收货地址</h2>
						<a href="">+添加新地址</a>
					</div>
					<div class="r_select">
						<h2>付款方式
							<span>推荐使用在线支付，不用找零，优惠更多</span>
						</h2>
						<ul>
							<li class="s_u1">
								<p>在线支付</p>
								<p class="u_p">支持微信、支付宝、QQ钱包及大部分银行卡</p>
							</li>
							<li class="s_u2">
								<p>货到付款</p>
								<p class="u_p">送货上门后再付款</p>
							</li>
						</ul>
					</div>
					<div class="r_select">
						<h2>选择优惠</h2>
						<p class="s_info">
							<span class="i_pan1">使用红包</span>
							<span class="i_pan2">无可用红包</span>
						</p>
						<p class="s_info">
							<span class="i_pan3">使用优惠券</span>
							<span class="i_pan4">网站不支持
								<em>（仅手机客户端可用）</em>
							</span>
						</p>
					</div>
					<div class="r_select">
						<h2>其他信息</h2>
						<div class="s_info">
							<span class="i_pan1">配送方式</span>
							<span class="i_pan5">本订单由
								<a href="#"> [蜂鸟专送] </a> 提供配送
							</span>
						</div>
						<div class="s_info">
							<span class="i_pan1">送达时间</span>
							<div class="i_form">
								<span>立即送达</span>
							</div>
						</div>
						<div class="s_info">
							<span class="i_pan1">发票信息</span>
							<span class="i_pan6">
								<input placeholder="商家不支持开发票">
							</span>
						</div>
						<div class="s_info">
							<span class="i_pan1">订单备注</span>
							<span class="i_pan6">
								<input type="text" class="p_inpu">
							</span>
						</div>
					</div>
					<div>
						<input type="button" value="确认下单" class="btn">
						<div ></div>
					</div>

				</div>
			</div>
		</div>
	<style type="text/css">
		.footer{border-top:1px solid #eee;margin-top:50px;background-color:#f7f7f7;color:#333;}
	</style>
		<div class="footer"> 
			<img src="images/footer.png">
		</div>
	</div>
	<script type="text/javascript">
		alert(sessionStorage.getItem("gid"));
	</script>
</body>
</html>