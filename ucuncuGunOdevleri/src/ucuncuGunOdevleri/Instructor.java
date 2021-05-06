package ucuncuGunOdevleri;

public class Instructor extends User{
	
	private String certificate;
	
	public Instructor() {
		
	}

	public Instructor(int id, String name, String lastName, String userName, String email, String password, String certificate) {
		super(id, name, lastName, userName, email, password);
		this.certificate = certificate;
		
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
}


	


