package com.mayexpress.foodcourt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FoodCourtDbUtil {
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException{
	ArrayList<Food> food = new ArrayList<>();
	String url = "jdbc:mysql://localhost:3306/food";
	String userName = "root";
	String password = "Mayur@123";
	
	// load the mysql driver
	Class.forName("com.mysql.jdbc.Driver");
	
	///get the connection
	Connection con = DriverManager.getConnection(url, userName, password);
	
	//create the statement
	Statement stm = con.createStatement();			
	
	//execute the statement  and loop over the result set	
	ResultSet rs = stm.executeQuery("select * from food_court");
	
	while(rs.next()) {
		int id = rs.getInt(1);
		String name = rs.getString(2);
		String type = rs.getString(3);
		int status = rs.getInt(4);
		int price = rs.getInt(5);
		Food f = new Food(id, name, type, status, price);
		food.add(f);
	}
		
		
		return food;
	}
}
