<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="mnc"%>
<jsp:include page="includes/header.jsp"/>
	<div class="mainmenu-area">
		<div class="container">
			<div class="row">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div class="navbar-collapse collapse">
					<mnc:itemlist />
				</div>
			</div>
		</div>
	</div>
	<!-- End mainmenu area -->

	<div class="slider-area">
		<!-- Slider -->
		<div class="block-slider block-slider4">
			<ul class="" id="bxslider-home4">
				<li><img src="img/h4-slide.png" alt="Slide">
					<div class="caption-group">
						<h2 class="caption title">
							iPhone <span class="primary">6 <strong>Plus</strong></span>
						</h2>
						<h4 class="caption subtitle">Dual SIM</h4>
						<a class="caption button-radius" href="#"><span class="icon"></span>Shop
							now</a>
					</div>
				</li>
				<li><img src="img/h4-slide2.png" alt="Slide">
					<div class="caption-group">
						<h2 class="caption title">
							by one, get one <span class="primary">50% <strong>off</strong></span>
						</h2>
						<h4 class="caption subtitle">school supplies & backpacks.*</h4>
						<a class="caption button-radius" href="#"><span class="icon"></span>Shop
							now</a>
					</div>
				</li>
				<li><img src="img/h4-slide3.png" alt="Slide">
					<div class="caption-group">
						<h2 class="caption title">
							Apple <span class="primary">Store <strong>Ipod</strong></span>
						</h2>
						<h4 class="caption subtitle">Select Item</h4>
						<a class="caption button-radius" href="#"><span class="icon"></span>Shop
							now</a>
					</div>
				</li>
				<li><img src="img/h4-slide4.png" alt="Slide">
					<div class="caption-group">
						<h2 class="caption title">
							Apple <span class="primary">Store <strong>Ipod</strong></span>
						</h2>
						<h4 class="caption subtitle">& Phone</h4>
						<a class="caption button-radius" href="#"><span class="icon"></span>Shop
							now</a>
					</div>
				</li>
			</ul>
		</div>
		<!-- ./Slider -->
	</div>
	<!-- End slider area -->

	<div class="promo-area">
		<div class="zigzag-bottom"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-3 col-sm-6">
					<div class="single-promo promo1">
						<i class="fa fa-refresh"></i>
						<p>30 Days return</p>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="single-promo promo2">
						<i class="fa fa-truck"></i>
						<p>Free shipping</p>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="single-promo promo3">
						<i class="fa fa-lock"></i>
						<p>Secure payments</p>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="single-promo promo4">
						<i class="fa fa-gift"></i>
						<p>New products</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End promo area -->

	<div class="maincontent-area">
		<div class="zigzag-bottom"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="latest-product">
						<h2 class="section-title">Latest Products</h2>
						<div class="product-carousel">
							<mnc:newproductslist/>					
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End main content area -->

	<div class="brands-area">
		<div class="zigzag-bottom"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="brand-wrapper">
						<div class="brand-list">
							<mnc:brandlist/>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End brands area -->

	<div class="product-widget-area">
		<div class="zigzag-bottom"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="single-product-widget">
						<h2 class="product-wid-title">Top Sellers</h2>
						<a href="#" class="wid-view-more">View All</a>
							<mnc:top_selling_productlist/>
					</div>
				</div>
				<div class="col-md-4">
					<div class="single-product-widget">
						<h2 class="product-wid-title">Recently Viewed</h2>
						<a href="#" class="wid-view-more">View All</a>
							<mnc:top_selling_productlist/>
					</div>
				</div>
				<div class="col-md-4">
					<div class="single-product-widget">
						<h2 class="product-wid-title">Top New</h2>
						<a href="#" class="wid-view-more">View All</a>
							<mnc:top_selling_productlist/>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End product widget area -->
<jsp:include page="/includes/footer.jsp"/>