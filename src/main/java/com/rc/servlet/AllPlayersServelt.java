package com.rc.servlet;

import java.io.IOException;
import java.util.List;

import com.rc.dao.AdminDAO;
import com.rc.dao.UserDAO;
import com.rc.model.Player;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/allPlayers")
public class AllPlayersServelt extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("all players data");
		
		AdminDAO dao = new AdminDAO();
		
		List<Player> player = dao.getAllPlayers();
	}
}
