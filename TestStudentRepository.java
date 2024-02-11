package com.prowings;
//
public class TestStudentRepository {
//
	public static void main(String[] args) {
//		
//		Student s1 = new Student(60,"shree","A.nagar",80,"Java",10);
//		
//		StudentRepository repo = new StudentRepository();
//		if(repo.createStudent(s1)>0)
//			
//			System.out.println("Record inserted!!!");
//		else
//			
//			System.out.println("Record not inserted");		
//	}
//}
        Student s1 = new Student("name" ,110, "A.nagar", 80, "Java", 10);
        StudentRepository repo = new StudentRepository();
        
        if (repo.createStudent(s1) > 0)
            System.out.println("Record inserted.");
        else
            System.out.println("Record not inserted.");
    }
}
