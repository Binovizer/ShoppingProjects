<%@tag import="com.binovizer.daos.MenuDAO"%>
<%@tag import="com.binovizer.dtos.MenuDTO"%>
<%@tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%	
	out.print("<ul>");
	ArrayList<MenuDTO> menulist = MenuDAO.getMenuList();
	if(menulist.size()>0){
		for(MenuDTO m : menulist){
			if(session.getAttribute("user_name")!=null && ( m.getMenuID()==5 || m.getMenuID()==6)){
				
			}else{
				out.print("<li><a href='"+m.getMenuLink()+"'><i class='"+m.getFont_awesome_id()+"'></i>"+m.getMenuName()+"</a></li>");
			}
		}
	}
	if(session.getAttribute("user_name")!=null){
		out.println("<li><a href='#'><i class='fa fa-user'></i>Welcome "+session.getAttribute("user_name")+"</a></li>");
	}
	out.print("</ul>");
%>