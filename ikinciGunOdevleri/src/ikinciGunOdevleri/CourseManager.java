package ikinciGunOdevleri;

public class CourseManager {
	public void add(Course course) { 
		
		System.out.println(course.getName() + " Kurslarınıza Eklendi");
	}
	
	public void update(Course course) { 
		
		System.out.println(course.getName() + " Kurslarınız Güncellendi");
	}
	
	public void delete(Course course) { 
		
		System.out.println(course.getName() + " Kurslarınızdan Silindi");
	}
}
