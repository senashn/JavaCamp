package ikinciGunOdevleri;

public class CourseManager {
	public void add(Course course) { 
		
		System.out.println(course.getName() + " Kurslarýnýza Eklendi");
	}
	
	public void update(Course course) { 
		
		System.out.println(course.getName() + " Kurslarýnýz Güncellendi");
	}
	
	public void delete(Course course) { 
		
		System.out.println(course.getName() + " Kurslarýnýzdan Silindi");
	}
}
