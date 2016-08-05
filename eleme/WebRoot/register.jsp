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
  <title>用户注册</title>
  <link href="css/register.css" type="text/css" rel="stylesheet">
 </head>
 <body>
	<div class="logo"></div>
	<div class="register">
		<div class="title">使用手机注册</div>
		<form action="doReg" method="post">
			<div class="username">
				<label for="name">手机号码</label>
				<input id="name" type="text" name="phoneNumber" placeholder="请输入你的手机号" />
			</div>
			<div class="phoneVeriCode">
				<label for="name">手机验证码</label>
				<input id="name" name="veriCode" type="text" placeholder="请输入验证码" />
			</div>
			<div class="password">
				<label for="name">设置密码</label>
				<input id="name" name="password" type="text" placeholder="请输入密码" />
			</div>
			<div class="submit">
				<input type="submit" value="同意协议并注册"/>
			</div>
		</form>
		<div class="agreement"><a href="https://m.ele.me/agreement">《使用条款和协议》</a></div>
		<div class="login">
			<h3>已经注册过？</h3>
			<p>请点击，<a href="javascript:void(0)">直接登录</a></p>
			<div class="partner_login">
				<h4>可使用以下账号直接登录</h4>
				<a href="javascript:void(0)"></a><a class="second" href="javascript:void(0)"></a>
			</div>
		</div>
	</div>
	<div class="footer"></div>
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript"></script>
 </body>
</html>

