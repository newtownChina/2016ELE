<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="Keywords" content="饿了么,店铺详情">
  <meta name="Description" content="饿了么店铺页面">
  <title>${shop.name}</title>
  <link type="text/css" rel="stylesheet" href="iconfont/iconfont.css" />
  <link type="text/css" rel="stylesheet" href="css/shop.css" />
 </head>
 <body>
	<!--顶部开始-->
	<div class="top">
		<!--导航条开始-->
		<div class="t_nav">
			<img src="images/eleme_logo.png" width="236" height="46" alt="饿了么logo" />
			<a class="nav_l">首页</a>
			<a class="nav_l">品牌商家</a>
			<a class="nav_l">我的订单</a>
			<a class="nav_l">加盟合作</a>
			<a class="nav_r">积分商城</a>
			<a class="nav_r">服务中心</a>
			<a class="nav_r">手机应用</a>
			<a class="nav_r">个人信息</a>
		</div>
		<!--导航条结束-->
		<!--商家信息-->
		<div class="t_info">
			<div class="info_left">
				<img src="images/logo.webp" width="100" height="100" alt="店铺logo" />
				<div class="detail">
					<h1>${shop.name}</h1>
					<p>星级</p>
					<p>特色</p>
				</div>
			</div>
			<div class="info_right">
				<div id="info_start">
					<span>起送价</span>
					<span>${shop.lowest}元</span>
				</div>
				<div id="info_fee">
					<span>配送费</span>
					<span>${shop.transcost}元</span>
				</div>
				<div id="info_time">
					<span>平均送达速度</span>
					<span>${shop.avgtime}分钟</span>
				</div>
			</div>
		</div>
		<!--商家信息结束-->
	</div>
	<!--顶部结束-->
	<!--菜品搜索选项卡开始-->
	<div class="tabSearch">
		<div class="tab">
			<a href="javascript:void(0)" class="t_l">所有商品</a>
			<a href="javascript:void(0)" class="t_l">评价</a>
			<a href="javascript:void(0)" class="t_l">商家详情</a>

			<a href="javascript:void(0)" class="t_r"><span class="iconfont" style="border-left:0;color:#666;">&#xe61a;</span><span class="iconfont" style="background:#0089dc;">&#xe6da;</span></a>
			<a href="javascript:void(0)" class="t_r">价格</a>
			<a href="javascript:void(0)" class="t_r">销量</a>
			<a href="javascript:void(0)" class="t_r">评分</a>
			<a href="javascript:void(0)" class="t_r">默认排序</a>
		</div>
		<div class="search">
			<form action="" method="get">
				<input id="txt" type="text" placeholder="搜索商家,美食..." />
				<input id="sub" type="submit" value="&#xe612;" class="iconfont"/>
			</form>
		</div>
	</div>
	<!--菜品搜索选项卡结束-->
	<!--中间开始-->
	<div class="middle">
		<div class="m_left">
			<div class="items">
				<ul>
					<li>热销榜</li>
					<li>酸辣</li>
					<li>单人精选</li>
					<li>双人分享</li>
					<li>传统经典系列</li>
					
					<li>面条</li>
					<li>馄钝拌料</li>
					<li>川味凉菜</li>
					<li>点心</li>
					<li>饮料</li>
				</ul>
			</div>
			<div class="foods">
				<!--第一类食物-->
				<div class="food_1">
					<h3>热销榜</h3>
					<div class="food_display">
						<ul>
							${goodsHtml}
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="m_right">
			<div class="notice">
				<div class="n_title"><span>商家公告</span></div>
				<div class="n_cont">
					${shop.announce}
				</div>
				<div class="support">
					<ul>
						<li>
							<span class="icon">付</span><span class="sup_cont">可使用支付宝、微信、手机QQ进行在线支付</span>
						</li>
						<li>
							<span class="icon">付</span><span class="sup_cont">可使用支付宝、微信、手机QQ进行在线支付可使用支付宝、微信、手机QQ进行在线支付</span>
						</li>
						<li>
							<span class="icon">付</span><span class="sup_cont">可使用支付宝、微信、手机QQ进行在线支付可使用支付宝、微信、手机QQ进行在线支付可使用支付宝、微信、手机QQ进行在线支付</span>
						</li>

					</ul>
				</div>
				<div class="report">举报商家</div>
			</div>
			<div class="hygieneCheck"></div>
		</div>
	</div>
	<!--中间结束-->
	<!--底部开始-->
	<div class="bottom"></div>
	<!--底部结束-->
	<div class="bar">
		<div class="bar_1"><span class="iconfont">&#xe667;</span></div>
		<div class="bar_2"><span class="iconfont">&#xf0030;</span></div>
		<div class="bar_3"><span class="iconfont">&#xe643;</span></div>
		<div class="bar_4"><span class="iconfont">∧</span></div>
	</div>
	<div class="cart">
		<div class="up">
			<div class="up_left">购物车<a href="javascript:void(0)">[清空]</a></div>
			<div class="up_right"><span class="iconfont">&#xe605;</span></div>
			<div class="up_cont"></div>
		</div>
		<div class="down">
			<div class="down_left"><span class="iconfont">&#xe66d;</span></div>
			<div class="down_right"><a href="doCheckout">购物车是空的</a></div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			AddedGoods();
			$(".tabSearch div.tab a.t_r span.iconfont").click(function(){
				$(this).css({"background":"#0089dc","color":"#fff"}).siblings().css({"background":"#fff","color":"#666"});
			});
			/*添加到购物车*/
			$(".describe a").click(function(){
				alert(1);
				var gid = $(this).data("gid");
				var name = $(this).data("name");
				var price = $(this).data("price");
				var htmlToCart ="<div class='mygoods' data-gid="+gid+" data-price="+price+">"+name+"<div class='minus' onclick='minus(this)'>&#45</div><div class='num'>1</div><div class='plus' onclick='plus(this)'>&#43</div><div class='price'>"+"￥"+price+"</div></div>";
				$(".up_cont").append(htmlToCart);
				$(".up").stop().css({
					"height":"+=41px"
				});
				if(window.sessionStorage){
					//点击按钮的时候，添加到购物车，也添加到sessionStorage
					sessionStorage.setItem("gid"+gid,htmlToCart);//保证每个商品对应不同的gidkey，用于添加不同的商品
				}
				forbidAddSameGood();
				ifCartEmpty();
			});
			/*清空购物车*/
			$(".up_left a").click(function(){
				$(".up_cont").empty();
				ifCartEmpty();
				sessionStorage.clear();
				forbidAddSameGood();
			});
			forbidAddSameGood();
			/*向购物车添加session中缓存的已经添加过的商品*/
			function AddedGoods(){
				var item_num = sessionStorage.length;//会话中缓存的商品数
				for(var i = 0;i < item_num;i++){
					var key = sessionStorage.key(i);
					var value = sessionStorage.getItem(key);
					$(".up_cont").append(value);
					$(".up").stop().css({
						"height":"+=41px"
					});
				}
				ifCartEmpty();
			}
		});
		/*购物车的商品减少鼠标事件*/
		function minus(thisObj){
			/*从购物车删除*/
			var num = $(thisObj).siblings(".num").text();
			var price = $(thisObj).parent().data("price");
			var n = parseInt(num);
			if(n==1){
				$(this).parent().remove();
				$(".up").stop().css({
					"height":"-=41px"
				});
				--n;
			}else{
				--n;
			}
			$(thisObj).siblings(".num").text(n);
			$(thisObj).siblings(".price").text("￥"+(n*parseFloat(price)).toFixed(1));
			/*增加商品后重新保存*/
			if(window.sessionStorage){
				/*将当前商品的gid加入sessionStorage，如果key相同只会保留最后一个*/
				var gid = $(thisObj).parent().data("gid");
				var price = $(thisObj).parent().data("price");
				var goodListHtml = $(thisObj).parent().html();
				/*var date = new Date();
				console.log(date.getMilliseconds());*/
				if(n<1){
					sessionStorage.removeItem("gid"+gid);
					$(thisObj).parent().remove();
					forbidAddSameGood();
				}else{
					sessionStorage.setItem("gid"+gid,"<div class='mygoods' data-gid='"+gid+"' data-price='"+price+"'>"+goodListHtml+"</div>");//保证每个商品对应不同的gidkey，用于添加不同的商品
				}
			}
			ifCartEmpty();
			forbidAddSameGood();//从购物车删除时可以重新添加
			
		}
		/*购物车的商品增加事件*/
		function plus(thisObj){
			var num = $(thisObj).siblings(".num").text();
			var price = $(thisObj).parent().data("price");
			var n = parseInt(num);
			n+=1;
			$(thisObj).siblings(".num").text(n);
			$(thisObj).siblings(".price").text("￥"+(n*parseFloat(price)).toFixed(1));
			if(window.sessionStorage){
				/*将当前商品的gid加入sessionStorage，如果key相同只会保留最后一个*/
				var gid = $(thisObj).parent().data("gid");
				var goodListHtml = $(thisObj).parent().html();
				sessionStorage.setItem("gid"+gid,"<div class='mygoods' data-gid='"+gid+"'>"+goodListHtml+"</div>");//保证每个商品对应不同的gidkey，用于添加不同的商品
			}
			ifCartEmpty();
		}
		function ifCartEmpty(){
			var goodsNum = $(".mygoods").length;
			if(goodsNum < 1){
				$(".down_right a").text("购物车是空的 ").attr("href","javascript:void(0)").css({
					"color":"#111",
					"background":"#E4E4E4",
					"cursor":"default"
				});
				$(".up").css("height","0");
			}else{
				$(".down_right a").text("去结算").attr("href","doCheckout").css({
					"background":"#51D862",
					"color":"white",
					"cursor":"pointer"
				});
				//备用，防止鼠标点击过快，使得高度增加到应有高度。
				$(".up").css("height",(goodsNum+1)*41+"px");//本身高41px，多+1
			}
		}
		function forbidAddSameGood(){
			/*sessionStorage中的就是购物车中的，因此可以将sessionStorage看做购物车*/
			/*当重新加载了当前页面的时候，根据sessionStorage中的商品确定禁止商品列表按钮以防止添加重复的商品*/
			var food_display_num = $(".food_display .describe").length;//所有陈列的商品数
			var item_num = sessionStorage.length;//会话中缓存的商品数
			var food_display_gid;
			for(var i = 0;i < food_display_num;i++){
				$(".food_display .describe").eq(i).find("a").text("加入购物车").unbind("click").click(function(){
					var gid = $(this).data("gid");
					var name = $(this).data("name");
					var price = $(this).data("price");
					var htmlToCart ="<div class='mygoods' data-gid="+gid+" data-price="+price+">"+name+"<div class='minus' onclick='minus(this)'>&#45</div><div class='num'>1</div><div class='plus' onclick='plus(this)'>&#43</div><div class='price'>"+"￥"+price+"</div></div>";
					$(".up_cont").append(htmlToCart);
					$(".up").stop().css({
						"height":"+=41px"
					});
					if(window.sessionStorage){
						//点击按钮的时候，添加到购物车，也添加到sessionStorage
						sessionStorage.setItem("gid"+gid,htmlToCart);//保证每个商品对应不同的gidkey，用于添加不同的商品
					}
					forbidAddSameGood();
					ifCartEmpty();
				});
				food_display_gid = "gid"+$(".food_display .describe").eq(i).find("a").data("gid");
				for(var j = 0;j < item_num;j++){
					var key = sessionStorage.key(j);
					if(food_display_gid == key){
						$(".food_display .describe").eq(i).find("a").text("已加入").unbind("click");
						break;
					}
				}
				/*商品陈列中的gid*/
			}
		}
	</script>
 </body>
</html>
