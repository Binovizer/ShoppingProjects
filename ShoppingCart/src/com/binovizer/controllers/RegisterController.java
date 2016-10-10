package com.binovizer.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.binovizer.daos.RegisterDAO;
import com.binovizer.dtos.UserDTO;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		doPost(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_name = request.getParameter("fname")+" "+request.getParameter("lname");
		String user_email = request.getParameter("email");
		String user_pass = request.getParameter("pass");
		UserDTO user = new UserDTO();
		user.setUser_name(user_name);
		user.setUser_email(user_email);
		user.setUser_pass(user_pass);
		boolean flag = RegisterDAO.regsiter(user);
		if(flag){
			request.setAttribute("successMsg", "Registered Successfully.Please LogIn to Continue...");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("error.jsp");	
		}
	}
}
