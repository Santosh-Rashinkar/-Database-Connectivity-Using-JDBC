package com.prowings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_Jdbc4 {
	
	public static void main(String[] args) {
		Connection connection = null;
		try {
			//Step 1: Register the driver class (optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2: Create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company", "root", "Santosh@7675");			//Step 3: Create Statement
			//Step 3: Create Statement
			Statement stmt = connection.createStatement();
			//Step 4: Execute query
			int res = stmt.executeUpdate("update student set name = 'SSS' where id = 40");
			
			if(res > 0)
				System.out.println("DB Operation executed successfully.. afftected rows are : "+res);
				
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load the Driver because driver class not found!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Some exception occurred while connecting to the DB!!");
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				System.out.println("Connection closed successfully!!!");
			} catch (SQLException e) {
				System.out.println("Error while closing the connection!!");
				e.printStackTrace();
			}
		}

	}

}