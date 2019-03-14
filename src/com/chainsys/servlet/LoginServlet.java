package com.chainsys.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.CustomerDAO;
import com.chainsys.model.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
        Customer customer = new Customer();
		customer.setEmail(email);
		customer.setPassword(password);
        CustomerDAO dao = new CustomerDAO();
		boolean result;
		result = dao.existingCustomer(customer);
		if (result == true) {
			RequestDispatcher rd = request.getRequestDispatcher("catagory.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("ERROR",
					"Invalid login!");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);

		}
	}

}
