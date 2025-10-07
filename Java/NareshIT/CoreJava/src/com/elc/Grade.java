package com.elc;
import com.blc.GradeSystem;
import java.util.Scanner;


public class Grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		
		System.out.println("Your Grade: "+GradeSystem.calculateGrade(marks));

	}

}

