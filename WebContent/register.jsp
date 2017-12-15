<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>register</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Bike-shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<!-- link href='http://fonts.useso.com/css?family=Roboto:500,900,100,300,700,400' rel='stylesheet' type='text/css'-->
<!--webfont-->
<!-- dropdown -->
<script src="js/jquery.easydropdown.js"></script>
<link href="css/nav.css" rel="stylesheet" type="text/css" media="all"/>
<script src="js/scripts.js" type="text/javascript"></script>
<!--js-->

</head>
<body>
<!--banner-->
<script src="js/responsiveslides.min.js"></script>
<script>  
    $(function () {
      $("#slider").responsiveSlides({
      	auto: false,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
 
<div class="banner-bg banner-sec">	
	  <div class="container">
			 <div class="header">
			       <div class="logo">
						 <a href="index.html"><img src="images/logo.png" alt=""/></a>
				   </div>							 
				  <div class="top-nav">										 
						<label class="mobile_menu" for="mobile_menu">
						<span>Menu</span>
						</label>
						<input id="mobile_menu" type="checkbox">
					  <ul class="nav">
						   <li class="dropdown1"><a href="index.jsp">Index</a> 
						  <li class="dropdown1"><a href="bicyclesController">store</a> 
						  </li>
						  <li class="dropdown1"><a href="login.jsp">Login</a>
						 </li>      
						 <li class="dropdown1"><a href="register.jsp">Register</a>
						 </li>               
						  <a class="shop" href="Cart"><img src="images/cart.png" alt=""/></a>
					  </ul>
				 </div>
				 <div class="clearfix"></div>
			 </div>
	  </div> 				 
</div>
<!--/banner-->
<div class="404-page">
	 <div class="container">
		 <form action="UserRegisterController" method="post"> 
								<div class="register-top-grid">
										<h3>个人信息</h3>
										<div>
											<span>用户名<label>*</label></span>
											<input id="name" type="text" value="0-20个字符" name="name"
							onfocus="this.value=''"
							onblur="if (this.value == '') {this.value = '0-20个字符';}checkName(this.value)"> 
										</div>
										<div>
											<span id="nameMessage"></span>
										</div>
										
										<div>
											<span>邮箱地址<label>*</label></span>
											<input type="text" id="mail" value="E-Mail" name="mail"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'E-Mail';}validatemail()">

										</div>
										<div>
											<span id="mailMessage"></span>
										</div>
										
										
										
								</div>
								<div class="clear"> </div>
								<div class="register-bottom-grid">
										<h3>登录信息</h3>
										<div>
											<span>密码<label>*</label></span>
											<input type="text" id="pass" value="6-20个字符" name="password"
							onfocus="this.value = '';this.type='password'"
							onblur="if (this.value == '') {this.value = '6-20个字符';this.type='text'}validatePassword();">

										</div>
										<div>
											<span id="passMessage"></span>
										</div>
										
										<div>
											<span>确认密码<label>*</label></span>
											<input type="text" id="repass" value="6-20个字符" name="repassword"
							onfocus="this.value = '';this.type='password'"
							onblur="if (this.value == '') {this.value = '6-20个字符';this.type='text'}validateRePassword();">
											
										</div>
										<div>
											<span id="repassMessage"></span>
										</div>
											
										<div class="clear"> </div>
								</div>
								<div class="clear"> </div>
								<input type="submit" value="提交">
						</form>
						<script type="text/javascript">
				//查看用户名是否被注册   ajax
				function checkName(str) {
					var xmlhttp;
					if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
						xmlhttp = new XMLHttpRequest();
					} else {// code for IE6, IE5
						xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
					}
					xmlhttp.onreadystatechange = function() {
						if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
							var i = xmlhttp.responseText;
							if (i == "1") {//用户名没有被注册

								document.getElementById("nameMessage").innerHTML = "<span style='color:green'>用户名可以使用!</span>";

							} else {

								document.getElementById("nameMessage").innerHTML = "<span style='color:red'>用户名已经注册!</span>";
							}
						}
					}

					xmlhttp.open("GET", "registCheck?name=" + str, true);
					xmlhttp.send();
				}
				//邮箱格式验证
				function validatemail() {
					var mailElement = document.getElementById("mail");
					var msgElement = document.getElementById("mailMessage");
					if (mailElement.value == "") {

						msgElement.innerHTML = "<span style='color:red'>邮箱不能为空!</span>";
						return false;
					}
					if (/^\w+@\w+\.\w+$/.test(mailElement.value)) {

						msgElement.innerHTML = "<span style='color:green'>邮箱格式正确!</span>";
						return true;
					} else {

						msgElement.innerHTML = "<span style='color:red'>邮箱输入格式错误!</span>";
						return false;
					}
				}

				//第一次输入密码时验证,非空，长度
				function validatePassword() {
					var msgElement = document.getElementById("passMessage");
					var passElement = document.getElementById("pass");
					if (passElement.value == "") {
						msgElement.innerHTML = "<span style='color:red'>密码不能为空!</span>";
						return false;
					}
					if (/^\w{6,20}$/.test(passElement.value)) {
						msgElement.innerHTML = "<span style='color:green'>密码格式正确!</span>";
						return true;
					} else {
						msgElement.innerHTML = "<span style='color:red'>密码长度应该在6-20之间!</span>";
						return false;
					}
				}

				//第二次输入密码时验证，非空，长度，两次密码一致
				function validateRePassword() {
					var passElement = document.getElementById("pass");
					var repassElement = document.getElementById("repass");
					var msgElement = document.getElementById("repassMessage");
					if (repassElement.value == "") {
						msgElement.innerHTML = "<span style='color:red'>密码不能为空!</span>";
						return false;
					}
					if (!(/^\w{6,20}$/.test(repassElement.value))) {
						msgElement.innerHTML = "<span style='color:red'>密码长度应该在6-20之间!</span>";
						return false;
					}
					if (passElement.value == repassElement.value) {
						msgElement.innerHTML = "<span style='color:green'>密码格式正确!</span>";
						return true;
					} else {
						msgElement.innerHTML = "<span style='color:red'>两次密码不一致!</span>";
						return false;
					}
				}
				
				function validate() {
		            return validateName()&&validatePassword()&&validateRePassword()&&validatemail();
		        }
			</script>
						
						
	 </div>
</div>

<!---->
<div class="footer">
	 <div class="container wrap">
		<div class="logo2">
			 <a href="index.html"><img src="images/logo2.png" alt=""/></a>
		</div>
		<div class="ftr-menu">
			 <ul>
				 <li><a href="bicycles.html">BICYCLES</a></li>
				 <li><a href="parts.html">PARTS</a></li>
				 <li><a href="accessories.html">ACCESSORIES</a></li>
				 <li><a href="404.html">EXTRAS</a></li>
			 </ul>
		</div>
		<div class="clearfix"></div>
	 </div>
</div>
<!---->

</body>
</html>

