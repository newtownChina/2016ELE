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
  <title>登录</title>
  <link type="text/css" rel="stylesheet" href="iconfont/iconfont.css" />
  <link type="text/css" rel="stylesheet" href="iconfont2/iconfont2.css" />
  <link type="text/css" rel="stylesheet" href="css/login.css"/>
 </head>
 <body>
	<div class="logo"></div>
	<div class="login">
		<div class="l_left"></div>
		<div class="l_window">
			<form action="doLogin" method="post">
				<div class="title">
					<span>登录</span>
					<span class="iconfont">&#xe601;</span>
					<a href="javascript:void(0)">手机登录验证</a>
				</div>
				<div class="username">
					<span class="iconfont">&#xe60c;</span>
					<input type="text" name="username" placeholder="手机号/邮箱/用户名"/>
				</div>
				<div class="password">
					<span class="iconfont">&#xe612;</span>
					<input type="password" name="password" placeholder="密码"/>
				</div>
				<div class="verify_code">
					<input type="text" name="veriCode" placeholder="验证码"/>
				<img width="90" height="40" alt="验证码" src="" onclick="" />
				<a href="javascript:void(0)">看不清<br />换一张</a>
				</div>
				<div class="auto_login">
					<input type="checkbox" id="auto">
					<label for="auto">下次自动登录</label>
				</div>
				<div class="login_btn">
					<input type="submit" value="登录" />
				</div>
			</form>
			<div class="newUser_forgotPdw">
				<a href="javascript:void(0)" class="new">新用户注册</a>
				<a href="javascript:void(0)" class="fgt">忘记密码</a>
			</div>
			
			<div class="partner_login">
				<h4><span>可使用以下账户直接登录</span></h4>
				<div class="icon"><a href="javascript:void(0)"></a><a id="second" href="javascript:void(0)"></a></div>
			</div>
		</div>
	</div>
	<div class="footer"></div>
 </body>
</html>