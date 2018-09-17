package com.capgemini.bankapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.BankAccount;


/*@WebServlet("/balance")
public class BalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BankAccountDao bankAccountDao;
       public ServletContext context;
    
    public BalanceController() {
        super();
        
    }
@Override
public void init(ServletConfig config) throws ServletException {
	context=config.getServletContext();
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		context.setAttribute("BankAccountDao", "bankAccountDao");
		BankAccount accounts=new BankAccount();
		int accountid = Integer.parseInt(request.getParameter("accountId"));
		accounts=bankAccountDao.getBalance(accountid);
		request.setAttribute("accounts", accounts);

		RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");

		
	}

}
*/