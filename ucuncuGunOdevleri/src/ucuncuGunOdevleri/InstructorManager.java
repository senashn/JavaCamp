package ucuncuGunOdevleri;

public class InstructorManager extends UserManager{
	
	public void createCourse(Instructor instructor){
		System.out.println(instructor.getName() + " Kurs açtý");
	}
	public void deleteCourse(Instructor instructor){
		System.out.println(instructor.getName() + " Kursu sildi");
	}
}
