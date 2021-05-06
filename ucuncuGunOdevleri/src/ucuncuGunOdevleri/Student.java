package ucuncuGunOdevleri;

public class Student extends User{
	
	private int progressPercent;
	
	public Student() {
		
	}

	public Student(int id, String name, String lastName, String userName, String email, String password, int progressPercent) {
		super(id, name, lastName, userName, email, password);
		this.progressPercent = progressPercent;
	}

	
	public int getProgressPercent() {
		return progressPercent;
	}

	public void setProgressPercent(int progressPercent) {
		this.progressPercent = progressPercent;
	}
}
