<%@tag import="com.binovizer.daos.BrandDAO"%>
<%@tag import="com.binovizer.dtos.BrandDTO"%>
<%@tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%
	ArrayList<BrandDTO> brandlist = BrandDAO.getBrandList();
	if(brandlist.size()>0){
		for(BrandDTO b  : brandlist){
			out.println("<img src='img/brand"+b.getBrand_id()+".png' alt='"+b.getBrand_name()+"'>");
		}
	}
%>
