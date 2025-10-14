package com.blc;

public class Student {
	private Integer studentId;
	private String studentName;
	private Integer studentMarks;
	private Character studentGrade;
	
	public void setStudentData(Integer id, String name,Integer marks) { 
		this.studentId = id;
		this.studentName = name;
		this.studentMarks = marks;
	}
	
	public void calculateGrade() {
		if(this.studentMarks >= 90) {
			this.studentGrade = 'A';
		} else if(this.studentMarks >= 80) {
			this.studentGrade = 'B';
		} else if(this.studentMarks >= 70) {
			this.studentGrade = 'C';
		} else if(this.studentMarks >= 60) {
			this.studentGrade = 'D';
		} else if(this.studentMarks >= 50) {
			this.studentGrade = 'E';
		} else {
			this.studentGrade = 'F';
		}
	}
	
	public String displayStudentDetails() {
		
		return "Student ID: "+this.studentId+"\nStudent Name: "+this.studentName+"\nStudent Marks: "+this.studentMarks+"\nStudent Grade: "+this.studentGrade;
		
	}
}
