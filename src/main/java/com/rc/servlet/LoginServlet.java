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

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void  doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println(email);
		System.out.println(password);
		 
//
//		RequestDispatcher rd =null;
//		Player p = new Player();
//		p.setEmail(email);
//        p.setPassword(password);

        UserDAO dao = new UserDAO();
        
        
        Player p = dao.login(email, password);
        
        if( p != null) {
        	System.out.println("User Already registered he can login!");
        }
        else {
        	System.out.println("email does not exit !! signup first");
        }

//        int result = dao.loginuser(p);
//		
//		if (result >0) {
//			System.out.println("Player Present");
//			req.setAttribute("message", "Login Sucessfully Welcome to our Page");;
//			
//			
//			rd=req.getRequestDispatcher("welcome.jsp");
//			
//			rd.forward(req, res);
//		}
//		else {
//			System.out.println("Player Not Present");
//
//            req.setAttribute("message", "Invalid Email or Password");
//
//          rd = req.getRequestDispatcher("Userlogin.jsp");
//            rd.forward(req, res);
//		}
//		
//		
//		//res>0 present we should go to welcome page or we should go to web page where we have access to web gape
//		
//		// res <= 0 --> player not present  go to login page only 
//		
//	}
		
	}
}
	


