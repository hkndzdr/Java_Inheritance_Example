	public class InstructorManager extends UserManager{

		public void createCourse(Instructor instructor, Course course) {
			System.out.println(instructor.getEmail() + " email adresli e�itmen " + course.getCourseName() + " kursunu olu�turdu!");
		}
		
		public void deleteCourse(Instructor instructor, Course course) {
			System.out.println(instructor.getEmail() + " email adresli e�itmen " + course.getCourseName() + " kursunu sildi!");
		}
		
	}
