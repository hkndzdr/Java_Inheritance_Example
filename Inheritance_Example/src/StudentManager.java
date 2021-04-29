
public class StudentManager extends UserManager {
	public void enrollCourse(Student student, Course course) {
		System.out.println(student.getEmail() + " email adresli ��renci " + course.getCourseName() + " kursuna kaydoldu!");
	}
	
	public void leaveCourse(Student student, Course course) {
		System.out.println(student.getEmail() + " email adresli ��renci " + course.getCourseName() + " kursundan ayr�ld�!");
	}
}
