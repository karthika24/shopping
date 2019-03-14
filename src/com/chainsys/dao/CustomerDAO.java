package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.Customer;
import com.chainsys.util.ConnectionUtil;

public class CustomerDAO {
	public boolean newCustomer(Customer customer) {
		boolean success = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into customer(id,name,phone,email,password) values(customer_id_seq.nextval,?,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setLong(2, customer.getPhone());
			preparedStatement.setString(3, customer.getEmail());
			preparedStatement.setString(4, customer.getPassword());
			int rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
			if (rows > 0) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}

	public boolean checkCustomer(Customer customer) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean signup = false;
		String sql = "select email from customer where email=?";
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getEmail());
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				signup = false;

			} else {
				signup = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		return signup;
	}

	public boolean existingCustomer(Customer customer) {
		boolean result = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select id,name,phone,email,password from customer where email=? and password=?";
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getEmail());
			preparedStatement.setString(2, customer.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			result = resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
