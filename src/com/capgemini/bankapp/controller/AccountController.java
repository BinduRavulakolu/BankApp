package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/account")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AccountController() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

}
	