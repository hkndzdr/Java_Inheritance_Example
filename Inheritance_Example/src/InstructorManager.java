	public class InstructorManager extends UserManager{

		public void createCourse(Instructor instructor, Course course) {
			System.out.println(instructor.getEmail() + " email adresli eğitmen " + course.getCourseName() + " kursunu oluşturdu!");
		}
		
		public void deleteCourse(Instructor instructor, Course course) {
			System.out.println(instructor.getEmail() + " email adresli eğitmen " + course.getCourseName() + " kursunu sildi!");
		}
		
	}
