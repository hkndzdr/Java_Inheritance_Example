
public class Main {

	public static void main(String[] args) {
		
		Course cSharpCourse = new Course(1,"C#");
		Course javaCourse = new Course(2,"JAVA");
		Course[] createdCourses = {cSharpCourse, javaCourse};
		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","123456","engindemirog@kodlama.io","Ankara",createdCourses);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor1);
		
		System.out.println("#Kurs Listesi#");
		for (Course createdCourse : instructor1.getCreatedCourses()) {
		 System.out.println(createdCourse.getCourseName());
		}
		
		instructorManager.createCourse(instructor1, cSharpCourse);
		instructorManager.createCourse(instructor1, javaCourse);
		instructorManager.deleteCourse(instructor1, javaCourse);
		Course[] enrolledCourses = {javaCourse};
		
		Student student1 = new Student(1,"Hakan","Dizdar","987654","hakandizdar@gmail.com","Giresun",enrolledCourses);		
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student1);
		studentManager.enrollCourse(student1, javaCourse);
		studentManager.leaveCourse(student1, javaCourse);
		studentManager.deleteUser(student1);
		instructorManager.deleteUser(instructor1);
	}

}
