
public class Instructor extends User {
	Course [] createdCourses;

	public Instructor(int id, String firstName, String lastName, String password, String email, String address, Course[] createdCourses) {
		super(id, firstName, lastName, password, email, address);
		this.createdCourses = createdCourses;
	}

	public Course[] getCreatedCourses() {
		return createdCourses;
	}

	public void setCreatedCourses(Course[] createdCourses) {
		this.createdCourses = createdCourses;
	}
	
	
}