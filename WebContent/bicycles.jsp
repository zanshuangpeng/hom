<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bicycles</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
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
						  <li class="dropdown1"><a href="bicycles.html">Store</a> 
						  </li>
						  <li class="dropdown1"><a href="parts.html">Login</a>
						 </li>      
						 <li class="dropdown1"><a href="accessories.html">user</a>
						 </li>               
						  <a class="shop" href="cart.html"><img src="images/cart.png" alt=""/></a>
					  </ul>
				 </div>
				 <div class="clearfix"></div>
			 </div>
	  </div> 				 
</div>
<!--/banner-->
<div class="bikes">		 
	 <div class="mountain-sec">
		 <h2>MOUNTAIN BIKES</h2>
		 <c:forEach items="${list }" var="p">
		 <a href="single.html"><div class="bike">				 
			 <img src="images/bik${p.id}.jpg" alt=""/>
		     <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>${p.name }<span>$${p.price }</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 	</c:forEach>
			 
		 
	  <div class="singlespeed-sec">
		   <h2>SINGLE SPEED-BIKES</h2>
			 <a href="single.html"><div class="bike">				 
				 <img src="images/s1.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <a href="single.html"><div class="bike">				 
				 <img src="images/s2.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <a href="single.html"><div class="bike none2">				 
				 <img src="images/s3.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <a href="single.html"><div class="bike none1">				 
				 <img src="images/s4.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <div class="clearfix"></div>
		 </div>
		 
		 <div class="road-sec">
		   <h2>ROAD-BIKES</h2>
			 <a href="single.html"><div class="bike">				 
				 <img src="images/r1.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <a href="single.html"><div class="bike">				 
				 <img src="images/r3.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <a href="single.html"><div class="bike none2">				 
				 <img src="images/r2.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <a href="single.html"><div class="bike none1">				 
				 <img src="images/r4.jpg" alt=""/>
				 <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>NAME<span>Model:M4585</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="single.html">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="single.html">Quick View</a>
				 </div>
			 </div></a>
			 <div class="clearfix"></div>
		 </div>
		 
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

