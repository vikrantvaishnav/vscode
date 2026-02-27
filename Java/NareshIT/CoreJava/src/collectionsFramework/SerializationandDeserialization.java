package collectionsFramework;


import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class SerializationandDeserialization {
	public static void main(String[] args) throws IOException {

		try {
			Student student = Student.getStudentObject();
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Vikrant\\Desktop\\JavaStorage\\student.txt");
			
			byte []bt = student.toString().getBytes();
			fout.write(bt);
			fout.close();
			
			
			
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i=1;i<=5;i++) {
			
		}
	}
}






class Student{
	private Integer studentId;
	private String studentName;
	private Double studentFee;
	private LocalDate dateOfAdmission;
	
	
	public Student(Integer studentId,String studentName,Double studentFee,LocalDate dateOfAdmission) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject() {
		return new Student(101,"John Doe",1500.50,LocalDate.of(2022, 8, 15));
	}
	
	public String toString() {
		return "Student ID: " + studentId + ", Name: " + studentName + ", Fee: " + studentFee + ", Date of Admission: " + dateOfAdmission;
	}
	
	
}



