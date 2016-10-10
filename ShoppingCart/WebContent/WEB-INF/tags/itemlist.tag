<%@tag import="com.binovizer.daos.ItemDAO"%>
<%@tag import="com.binovizer.dtos.ItemDTO"%>
<%@tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%
	out.println("<ul class='nav navbar-nav'>");
	out.print("<li class='active'><a href='index.jsp'>Home</a></li>");
	ArrayList<ItemDTO> itemlist = ItemDAO.getItemList();
	if(itemlist.size()>0){
		for(ItemDTO i : itemlist){
			out.print("<li><a href='#'>"+i.getItemName()+"</a></li>");
		}
	}
	out.print("</ul>");
%>