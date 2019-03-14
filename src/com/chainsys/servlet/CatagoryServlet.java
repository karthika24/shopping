package com.chainsys.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.CatagoryDAO;
import com.chainsys.model.Bike;
import com.chainsys.model.Laptop;
import com.chainsys.model.Mobile;

/**
 * Servlet implementation class CatagoryServlet
 */
@WebServlet("/CatagoryServlet")
public class CatagoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("catagory");
		System.out.println(name);
		CatagoryDAO dao = new CatagoryDAO();
		if ("bike".equalsIgnoreCase(name)) {
			try {
				List<Bike> bikelist = dao.bike();
				request.setAttribute("Bike", bikelist);
				RequestDispatcher rd = request.getRequestDispatcher("bike.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if ("laptop".equalsIgnoreCase(name)) {
			try {
				List<Laptop> laptoplist = dao.laptop();
				request.setAttribute("Laptop", laptoplist);
				RequestDispatcher rd = request
						.getRequestDispatcher("laptop.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if ("mobile".equalsIgnoreCase(name)) {
			try {
				List<Mobile> mobilelist = dao.mobile();
				request.setAttribute("Mobile", mobilelist);
				RequestDispatcher rd = request
						.getRequestDispatcher("mobile.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
