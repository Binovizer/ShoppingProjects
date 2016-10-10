<%@tag import="com.binovizer.daos.NewProductDAO"%>
<%@tag import="com.binovizer.dtos.ProductDTO"%>
<%@tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="utf-8"%>
<%
	ArrayList<ProductDTO> newproductlist = NewProductDAO.getNewProductList();
	if (newproductlist.size() > 0) {
		for (ProductDTO p : newproductlist) {
			out.println(
					"<div class='single-product'><div class='product-f-image'><img src='img/product-"+p.getProduct_id()+".png' alt=''><div class='product-hover'><a href='#' class='add-to-cart-link'><i class='fa fa-shopping-cart'></i> Add to cart</a><a href='single-product.jsp' class='view-details-link'><i class='fa fa-link'></i> See details</a></div></div>");
			out.println("<h2><a href='single-product.jsp?product_id="+p.getProduct_id()+"'>"+p.getProduct_name()+"</a></h2>");
			out.println("<div class='product-carousel-price'>");
			double price = p.getProduct_price();
			float discount = p.getProduct_discount();
			if(discount==0){
				out.println("<ins>Rs. "+Math.round(price)+"/-</ins>");
			}else{
				double selling_price = price * (100-discount) / 100;
				out.println("<ins>Rs. "+Math.round(selling_price)+"/-</ins>");
				out.println("<del>Rs. "+Math.round(price)+"/-</del>");
			}
			out.println("</div></div>");
		}
	}
%>
