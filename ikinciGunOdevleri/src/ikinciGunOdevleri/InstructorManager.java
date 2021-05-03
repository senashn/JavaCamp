package ikinciGunOdevleri;

public class InstructorManager {
	public void login(Instructor instructor) {
		
		System.out.println(instructor.getName() + " Giriþ Yaptý");
	}
	
	public void logout(Instructor instructor) {	
		
		System.out.println(instructor.getName() + " Çýkýþ Yaptý");
	}
}