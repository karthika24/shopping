package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.model.Bike;
import com.chainsys.model.Laptop;
import com.chainsys.model.Mobile;
import com.chainsys.util.ConnectionUtil;

public class CatagoryDAO {

	public List<Bike> bike() throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select name,model,price from bike";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Bike> bikelist = new ArrayList<Bike>();
		while (resultSet.next()) {
			Bike bikeobj = new Bike();
			bikeobj.setName(resultSet.getString("name"));
			bikeobj.setModel(resultSet.getString("model"));
			bikeobj.setPrice(resultSet.getInt("price"));
			bikelist.add(bikeobj);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return bikelist;
	}

	public List<Laptop> laptop() throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select name,model,price from laptop";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Laptop> laptoplist = new ArrayList<Laptop>();
		while (resultSet.next()) {
			Laptop laptopobj = new Laptop();
			laptopobj.setName(resultSet.getString("name"));
			laptopobj.setModel(resultSet.getString("model"));
			laptopobj.setPrice(resultSet.getInt("price"));
			laptoplist.add(laptopobj);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return laptoplist;
	}

	public List<Mobile> mobile() throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select name,model,price from mobile";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Mobile> mobilelist = new ArrayList<Mobile>();
		while (resultSet.next()) {
			Mobile mobileobj = new Mobile();
			mobileobj.setName(resultSet.getString("name"));
			mobileobj.setModel(resultSet.getString("model"));
			mobileobj.setPrice(resultSet.getInt("price"));
			mobilelist.add(mobileobj);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return mobilelist;
	}
}
