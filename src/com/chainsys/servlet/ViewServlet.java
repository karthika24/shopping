package com.chainsys.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.BikeDAO;
import com.chainsys.model.Bike;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String name=request.getParameter("bike");
      //System.out.println(name);
      Bike bike = new Bike();
      bike.setName(name);
      BikeDAO dao = new BikeDAO();
      Bike bike1=dao.viewBike(bike);
      request.setAttribute("BIKE", bike1);
		RequestDispatcher rd = request.getRequestDispatcher("viewbike.jsp");
		rd.forward(request, response);
	}

}
