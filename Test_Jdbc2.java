package com.prowings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_Jdbc2 {

	public static void main(String[] args) {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver class loding succssefully");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company", "root", "Santosh@7675");

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {

				Student s = new Student();

				s.setName(rs.getString(1));
				s.setId(rs.getInt(2));
				s.setAddress(rs.getString(3));
				s.setMarks(rs.getInt(4));
				s.setSubject(rs.getString(5));
				s.setRollNo(rs.getInt(6));

				System.out.println(s);
				System.out.println("-----------------------");

			}

		} catch (ClassNotFoundException e) {

			System.out.println("Unable to load the Driver because driver class not found!!");

			e.printStackTrace();
		} catch (SQLException e) {

			System.out.println("Some exception occurred while connecting to the DB!!");
			e.printStackTrace();
		} finally {

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
