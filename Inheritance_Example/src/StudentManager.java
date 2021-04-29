
public class StudentManager extends UserManager {
	public void enrollCourse(Student student, Course course) {
		System.out.println(student.getEmail() + " email adresli öğrenci " + course.getCourseName() + " kursuna kaydoldu!");
	}
	
	public void leaveCourse(Student student, Course course) {
		System.out.println(student.getEmail() + " email adresli öğrenci " + course.getCourseName() + " kursundan ayrıldı!");
	}
}
