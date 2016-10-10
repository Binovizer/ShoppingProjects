<%@tag import="com.binovizer.dtos.ProductDTO"%>
<%@tag import="java.util.ArrayList"%>
<%@tag import="com.binovizer.daos.TopSellingProductDAO"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	ArrayList<ProductDTO> list = TopSellingProductDAO.getTopSellingProductList();
	if(list.size()>0){
		for(ProductDTO p : list){
			out.println("<div class='single-wid-product'>");
			out.println("<a href='single-product.jsp'><img src='img/product-thumb-"+p.getProduct_id()+".png' alt='' class='product-thumb'></a>");
			out.println("<h2><a href='single-product.jsp'>"+p.getProduct_name()+"</a></h2>");
			out.println("<div class='product-wid-rating'><i class='fa fa-star'></i> <i class='fa fa-star'></i> <i class='fa fa-star'></i> <i class='fa fa-star'></i> <i class='fa fa-star'></i></div>");
			out.println("<div class='product-wid-price'>");
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