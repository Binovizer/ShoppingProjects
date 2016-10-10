package com.binovizer.dtos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.binovizer.daos.LoginDAO;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("email_id");
		String password = request.getParameter("password");
		UserDTO user = new UserDTO();
		user.setUser_email(userName.trim());
		user.setUser_pass(password.trim());
		UserDTO u = LoginDAO.checkLogin(user);
		if(u!=null){
			HttpSession session = request.getSession(true);
			session.setAttribute("userId", u.getUser_id());
			session.setAttribute("user_name", u.getUser_name());
			session.setAttribute("user_email", u.getUser_email());
			response.sendRedirect("index.jsp");
		}else{
			request.setAttribute("FailureMsg", "Sorry!Incorrect UserName or Password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
}
