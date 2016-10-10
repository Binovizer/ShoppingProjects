package addcart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MySqlCon;

public class SignUp extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	
	Connection connection;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
 

		//Integer userid=Integer.parseInt(request.getParameter("user_id"));

		String emailCheck="";
		String name=request.getParameter("s_name");
		String pass=request.getParameter("s_password");
		String rpass=request.getParameter("sr_password");
		String email=request.getParameter("s_email");
		 String mobile=request.getParameter("s_no");
		 		//Boolean status=Boolean.parseBoolean(request.getParameter("isAdmin"));
		
				//out.print(name+" "+pass+" "+rpass+" "+email+" "+mobile);

 
		String query="insert into users (username,password,cpass,emailaddress,phonenumber) values( '"+name+"', '"+pass+"','"+rpass+"', '"+email+"', '"+mobile+"') ";
		connection=new MySqlCon().mysqlCon();
		System.out.println("connn:::"+connection);
		try {

			PreparedStatement ps=connection.prepareStatement("select emailaddress from users where emailaddress=?");
			ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
			emailCheck=rs.getString(1);
			}
			if(emailCheck.equals(email))
			{
			out.println("<script type=\"text/javascript\">");
			out.println("alert(\"User with this email already exists\")");
			out.println("location='./signup.jsp';");
			out.println("</script>");
			}
			else
			{
			Statement st=connection.createStatement();
			st.executeUpdate(query);

 			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
//			rd.include(request, response);
			//out.print("Patrh::"+request.getContextPath());
                                                 out.println("<script type=\"text/javascript\">");
			out.println("alert(\"Registration successfull......\")");
			out.println("location='./login_01.jsp';");
			out.println("</script>");
			//response.sendRedirect(request.getContextPath()+"/index.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Generate Exception :::"+e);
			out.print("Generated Exception........"+e);
		}

 		out.flush();
		out.close();
	}

}
