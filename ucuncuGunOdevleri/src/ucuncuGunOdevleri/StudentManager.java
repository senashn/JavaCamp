package ucuncuGunOdevleri;

public class StudentManager extends UserManager{
	
	public void selectCourse(Student student){
		System.out.println(student.getName() + " Kursu seçti");
	}
	public void leaveCourse(Student student){
		System.out.println(student.getName() + " Kurstan ayrıldı");
	}
}
