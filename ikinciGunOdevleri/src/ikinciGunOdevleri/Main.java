package ikinciGunOdevleri;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C#", 50, "C# yazýlým geliþtirici yetiþtirme kampý");
		Course course2 = new Course(2, "JAVA", 90, "JAVA yazýlým geliþtirici yetiþtirme kampý");
		
		Course[] courses = new Course[] {course1, course2} ;
		
		for (Course course : courses) {
			System.out.println(course.getId());
			System.out.println(course.getName());
			System.out.println(course.getProgress());
			System.out.println(course.getContent());
			System.out.println("*******************************************");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);
		System.out.println("*******************************************");
		courseManager.add(course2);
		courseManager.delete(course2);
		courseManager.update(course2);
		
		//***********************************************
		
		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor();
		
		
		instructor1.setName("Engin Demiroð");
		instructor1.setAge(30);
		
		instructor2.setName("Sena Þahin");
		instructor2.setAge(21);
		

		
		Instructor[] instructors = new Instructor[] {instructor1,instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructor : instructors) {
			instructorManager.login(instructor);
		}		
	}
}
