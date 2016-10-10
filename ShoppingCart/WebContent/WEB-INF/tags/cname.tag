<%@tag import="java.util.ResourceBundle"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%
	ResourceBundle rb = ResourceBundle.getBundle("companyDetails");
	String CName = rb.getString("company_name");
%>
<%=CName%>