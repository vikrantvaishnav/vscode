package com.elc;
import java.util.Scanner;
import com.blc.Student;

public class StudentDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter Student ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Marks: ");
		int marks = sc.nextInt();
		
		student.setStudentData(id, name, marks);
		student.calculateGrade();
		
		System.out.println(student.displayStudentDetails());
		
		sc.close();

	}

}
