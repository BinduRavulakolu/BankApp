package com.capgemini.bankapp.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		String dburl = "jdbc:mysql://localhost/bank";
		String username = "root";
		String password = "root";
		
		try  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection(dburl, username, password)) {
				if(connection != null)
					System.out.println("--connected -- ");
			}
			catch(SQLException e) {
				e.printStackTrace();
				System.out.println("-- failed to connect --");
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver class not found.");
			e.printStackTrace();
		}
	}
	

}
