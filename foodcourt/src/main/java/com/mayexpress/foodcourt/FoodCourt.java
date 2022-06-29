package com.mayexpress.foodcourt;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodCourt
 */
@WebServlet("/FoodCourt")
public class FoodCourt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data from database(model)
		List<Food> foodItems = null;
		try {
			foodItems = FoodCourtDbUtil.getFoodList();
			request.setAttribute("foodItems", foodItems);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("foodItems", foodItems);
		//redirect to a different page
		RequestDispatcher dispacter = request.getRequestDispatcher("show-food.jsp");
		dispacter.forward(request, response);
	}

}
