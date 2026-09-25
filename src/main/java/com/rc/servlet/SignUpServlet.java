package com.rc.servlet;


import java.io.IOException;

import com.rc.dao.UserDAO;
import com.rc.model.Player;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/signUp")
public class SignUpServlet extends HttpServlet{
	
	@Override
	protected void  doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("pname");
		String tname = req.getParameter("tname");
		String jersey = req.getParameter("jersey");
		
		int jerseyNo = Integer.parseInt(jersey); // parse it to orginal data type 
		
		String phone = req.getParameter("phone");
		
		long phoneNo = Long.parseLong(phone);
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String cp = req.getParameter("cp");
		
		System.out.println("Name:" +name+", Team:"+tname+", Jersey:" + jersey +", Phone:" +phone+", Email:"+email+
				", Password:" +password +", Confirm:"+cp);
		
		
		RequestDispatcher rd = null;
		
		
		
		// validation
		if(password.equals(cp)) {
			// register the user
			
			// create player object
			
			
			Player p = new Player(name,tname,jerseyNo,phoneNo,email,password);
			//always role will be the user for all the users 
			
			p.setRole("user");
			
			//dao object
			
			UserDAO dao = new UserDAO();
			int result = dao.signUpUser(p);
			
			if(result>0) {
				System.out.println("inserted");
				
				//requestdisplacher
				//msg signup successfull login to continue 
				//login.jsp
				String successMsg = "signup successful";
				
				
			
				
				req.setAttribute("successMsg", successMsg);

				rd = req.getRequestDispatcher("Userlogin.jsp");
				rd.forward(req, res);
			
			}
			else {
				System.out.println("Failed to sign up");
				req.setAttribute("error", "failed to signUp");
				rd = req.getRequestDispatcher("signUp.jsp");
				rd.forward(req,res);
			}
			
			
			
			
			
			
		}
		else {
			//send error message to web page
			
			//define error message
			String msg = "password and confirm password should match";
			
			//send message
			
			req.setAttribute("message", msg);
			
			
			
			//set the page
			rd = req.getRequestDispatcher("signUp.jsp");
			
			rd.forward(req,res);
		}
		
		
		
	}

}
