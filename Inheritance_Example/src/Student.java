
public class Student extends User {
	private Course [] enrolledCourses;

	public Student(int id, String firstName, String lastName, String password, String email, String address, Course[] enrolledCourses) {
		super(id, firstName, lastName, password, email, address);
		this.enrolledCourses = enrolledCourses;
	}

	public Course[] getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(Course[] enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
	

}
