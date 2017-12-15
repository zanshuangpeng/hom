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
						  <li class="dropdown1"><a href="index.jsp">Index</a> 
						  <li class="dropdown1"><a href="bicyclesController">store</a> 
						  </li>
						  <li class="dropdown1"><a href="login.jsp">Login</a>
						 </li>      
						 <li class="dropdown1"><a href="register.jsp">Register</a>
						 </li>               
						  <a class="Cart" href="Cart"><img src="images/cart.png" alt=""/></a>
					  </ul>
				 </div>
				 <div class="clearfix"></div>
			 </div>
	  </div> 				 
</div>
<!--/banner-->
<div class="bikes">		 
	<a href="m-bicycesController?typeid=1">M-bicycles</a>
	<a href="m-bicycesController?typeid=2">S-bicycles</a>
	<a href="m-bicycesController?typeid=3">R-bicycles</a>
	 <div class="road-sec" >
		 <c:if  test="${requestScope.typeid==1}">
   			<h2>MOUNTAIN BIKES</h2>
		 </c:if>
		 <c:if  test="${requestScope.typeid==2}">
   			<h2>SINGLE SPEED-BIKES</h2>
		 </c:if>
		 <c:if  test="${requestScope.typeid==3}">
   			<h2>ROAD-BIKES</h2>
		 </c:if>
		 
		 <c:forEach items="${list }" var="p">
		 <a href="ProductFindById?id=${p.id}"><div class="bike">				 
			 <img src="images/bik${p.id}.jpg" alt=""/>
		     <div class="bike-cost">
					 <div class="bike-mdl">
						 <h4>${p.name }<span>$${p.price }</span></h4>
					 </div>
					 <div class="bike-cart">						 
						 <a class="buy" href="ProductFindById?id=${p.id}">BUY NOW</a>
					 </div>
					 <div class="clearfix"></div>
				 </div>
				 <div class="fast-viw">
						<a href="ProductFindById?id=${p.id}">Quick View</a>
				 </div>
			 </div></a>
			 	</c:forEach>
			 
		 
	  
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

