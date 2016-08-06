<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<style type="text/css">
			.footer{border-top:1px solid #eee;margin-top:50px;background-color:#f7f7f7;color:#333;}
		</style>
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
							<a href="javascript:history.go(-1)">&lt;返回商家修改</a>
						</div>
						<div class="c_tablehead">
							<div class="t_name">商品</div>
							<div class="t_count">份数</div>
							<div class="t_total">小计（元）</div>
						</div>
		
						<dl class="c_group">
							<dd class="g_scope">
							</dd>	
						</dl>
						<ul class="c_message">
							<li class="m_estra">
								<div class="t_itemname e_name">配送费</div>
								<div class="e_total">￥0.00</div>
							</li>
						</ul>
						<div class="c_total">￥
							<div>0.00</div>
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
						<a class="btn" href="profile.jsp">确认下单</a>
					</div>
				</div>
			</div>
		</div>
		<div class="footer"> 
			<img src="images/footer.png">
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			if(window.sessionStorage){
				var len = sessionStorage.length;
				var key;
				for(var i = 0;i < len ;i++){
					key = sessionStorage.key(i);
					$(".g_scope").append(sessionStorage.getItem(key));
				}
			}
			calTotalFee();
		});
		/*购物车的商品减少鼠标事件*/
		function minus(thisObj){
			/*从购物车删除*/
			var num = $(thisObj).siblings(".num").text();
			var price = $(thisObj).parent().data("price");
			var n = parseInt(num);
			if(n==1){
				$(this).parent().remove();
				--n;
			}else{
				--n;
			}
			$(thisObj).siblings(".num").text(n);
			$(thisObj).siblings(".price").text("￥"+(n*parseFloat(price)).toFixed(2));
			/*增加商品后重新保存*/
			if(window.sessionStorage){
				/*将当前商品的gid加入sessionStorage，如果key相同只会保留最后一个*/
				var gid = $(thisObj).parent().data("gid");
				var price = $(thisObj).parent().data("price");
				var goodListHtml = $(thisObj).parent().html();
				if(n<1){
					sessionStorage.removeItem("gid"+gid);
					$(thisObj).parent().remove();
				}else{
					sessionStorage.setItem("gid"+gid,"<div class='mygoods' data-gid='"+gid+"' data-price='"+price+"'>"+goodListHtml+"</div>");//保证每个商品对应不同的gidkey，用于添加不同的商品
				}
			}
			calTotalFee();
		}
		/*购物车的商品增加事件*/
		function plus(thisObj){
			var num = $(thisObj).siblings(".num").text();
			var price = $(thisObj).parent().data("price");
			var n = parseInt(num);
			n+=1;
			$(thisObj).siblings(".num").text(n);
			$(thisObj).siblings(".price").text("￥"+(n*parseFloat(price)).toFixed(2));
			if(window.sessionStorage){
				/*将当前商品的gid加入sessionStorage，如果key相同只会保留最后一个*/
				var gid = $(thisObj).parent().data("gid");
				var goodListHtml = $(thisObj).parent().html();
				sessionStorage.setItem("gid"+gid,"<div class='mygoods' data-gid='"+gid+"' data-price='"+price+"'>"+goodListHtml+"</div>");//保证每个商品对应不同的gidkey，用于添加不同的商品
			}
			calTotalFee();
		}
		//刚进入页面的时候就要计算总价格
		function calTotalFee(){
			var totalFee = 0;
			var price = 0;
			//运费
			var transCost = 0;
			var len = $(".price").length;
			for(var i=0;i < len;i++){
				var numString =$(".price").eq(i).text().substring(1);
				price += parseFloat(numString);//保留一位小数
			}
			transCost = parseFloat($(".e_total").text().substring(1));
			totalFee = (price+transCost).toFixed(2);
			$(".c_total div").text(totalFee);
		}
	</script>
</body>
</html>