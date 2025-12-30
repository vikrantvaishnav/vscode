package array.EnrollmentSystem;

public record Student(String name, EducationInstitute institute) {
	
	public void viewCoursesAndFees() {
		
		for(Course course : institute.courses()) {
			IO.println("Course ID: " + course.id() + ", Name: " + course.name() + ", Fee: " + course.fee());
		}
		
		
	}
	
	public void viewOffers() {
		for(Offers offer : institute.offers()) {
			IO.println("Offer: " + offer.offerText());
		}
	}
	
	public void enrollInCourse(Integer courseId) {
		institute.enrollStudentInCourse(courseId,name);
	}
}
