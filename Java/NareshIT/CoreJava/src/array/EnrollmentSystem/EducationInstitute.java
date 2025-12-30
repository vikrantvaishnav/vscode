package array.EnrollmentSystem;

public record EducationInstitute(Course[] courses, Offers[] offers) {


	public void enrollStudentInCourse(int courseId, String StudentName) {
		
		if(courseId < 1 || courseId > courses.length) {
			IO.println("Invalid course ID. Enrollment failed.");
			return;
		}
		for(Course course : courses) {
			if(course.id() == courseId) {
				IO.println("Enrolling " + StudentName + " in course: " + course.name());
				// Additional enrollment logic can be added here
				break;
			}
		}
		
	}
}
