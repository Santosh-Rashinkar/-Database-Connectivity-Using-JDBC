package com.prowings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestJdbc {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			//Step 1: Register the driver class (optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loding successfully ");
			//Step 2: Create connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "Santosh@7675");
			//Step 3: Create Statement
			Statement stmt = con.createStatement();
			//Step 4: Execute query
			ResultSet rs = stmt.executeQuery("select * from student1");
			
			while(rs.next())
			{
				System.out.println("ID : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("Subject : "+rs.getString(3));
				System.out.println("RollNo : "+rs.getInt(4));
				System.out.println("------------------");
			}
		}
			catch (ClassNotFoundException e) {
				System.out.println("Unable to load the Driver because driver class not found!!");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Some exception occurred while connecting to the DB!!");
				e.printStackTrace();
			}
			
			finally {
				
			
				try {
					con.close();
					System.out.println("Connection closed successfully!!!");
				} catch (SQLException e) {
					System.out.println("Error while closing the connection!!");
					e.printStackTrace();
				}
			}
	}
}
	
