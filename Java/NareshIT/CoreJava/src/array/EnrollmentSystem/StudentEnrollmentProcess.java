package array.EnrollmentSystem;

public class StudentEnrollmentProcess {
	
	void main() {
		String studentName = IO.readln("Enter student Name:");
		
		
		Course c1 = new Course(1, "Java" ,35000.0);
		Course c2 = new Course(2, ".Net" ,30000.0);
		Course c3 = new Course(3, "Python" ,32000.0);
		Course[] cour = {c1,c2,c3};
		
		Offers o1 = new Offers("Special discount: Get 20% off on all courses!\n"
				+ "Limited time offer: Enroll in any two courses and get one course free!");
		Offers[] off = {o1};
		
		EducationInstitute e1 = new EducationInstitute(cour,off);
		
		Student s1 = new Student(studentName,e1);
		
		s1.viewCoursesAndFees();
		s1.viewOffers();
		
		Integer id = Integer.parseInt(IO.readln("Enter course id:"));
		
		s1.enrollInCourse(id);
				
	
	}
}
