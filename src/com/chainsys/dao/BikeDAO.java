package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.Bike;
import com.chainsys.util.ConnectionUtil;

public class BikeDAO {
	public Bike viewBike(Bike bike) {
		Bike bike1 = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select name,model,cc,mileage,stroke,price from bike where name=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, bike.getName());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				bike1 = new Bike();
				bike1.setName(resultSet.getString("name"));
				bike1.setModel(resultSet.getString("model"));
				bike1.setCc(resultSet.getInt("cc"));
				bike1.setMileage(resultSet.getInt("mileage"));
				bike1.setStroke(resultSet.getFloat("stroke"));
				bike1.setPrice(resultSet.getFloat("price"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bike1;

	}

}
