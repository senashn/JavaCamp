package ucuncuGunOdevleri;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getName() + " Giriþ yaptý");
	}
	
	public void logout(User user) {
		System.out.println(user.getName() + " Çýkýþ yaptý");
	}
}
