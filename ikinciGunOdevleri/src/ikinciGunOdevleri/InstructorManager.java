package ikinciGunOdevleri;

public class InstructorManager {
	public void login(Instructor instructor) {
		
		System.out.println(instructor.getName() + " Giri� Yapt�");
	}
	
	public void logout(Instructor instructor) {	
		
		System.out.println(instructor.getName() + " ��k�� Yapt�");
	}
}