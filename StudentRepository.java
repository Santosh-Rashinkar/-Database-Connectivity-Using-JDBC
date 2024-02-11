//package com.prowings;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class StudentRepository {
//
//	public int createStudent(Student s) {
//		
//		Connection connection = null;
//		
//		int res = 0;
//		
//		try {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company", "root", "Santosh@7675");
// 
//			Statement stmt = connection.createStatement();
//			
//			int id = s.getId();
//			String name = s.getName();
//			String address = s.getAddress();
//			int marks = s.getMarks();
//			String subject = s.getSubject();
//			int rollNo = s.getRollNo();
//			String insertQuery =  "insert into student values("+id+","+"'"+name+"'"+"',"+address+","+"'"+marks+"'"+","+"'"+subject+"'"+"'"+","+rollNo+")";
//			
//			res = stmt.executeUpdate(insertQuery);
//			
//			if(res > 0)
//				System.out.println("Student record inserted successfully.. afftected rows are : " + res);
//			
//			else
//				System.out.println("Record not inserted!!");	
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return res;	}
//}


package com.prowings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {

    public int createStudent(Student s) {
        Connection connection = null;
        int res = 0;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company", "root", "Santosh@7675");
            Statement stmt = connection.createStatement();
            
            int id = s.getId();
            String name = s.getName();
            String address = s.getAddress();
            int marks = s.getMarks();
            String subject = s.getSubject();
            int rollNo = s.getRollNo();
            
            // Correcting the SQL query syntax
            String insertQuery = "INSERT INTO student VALUES(" + name + ", '" + id + "', '" + address + "', " + marks + ", '" + subject + "', " + rollNo + ")";
            
            res = stmt.executeUpdate(insertQuery);
            
            if (res > 0)
                System.out.println("Student record inserted successfully. Affected rows: " + res);
            else
                System.out.println("Record not inserted.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }
}


