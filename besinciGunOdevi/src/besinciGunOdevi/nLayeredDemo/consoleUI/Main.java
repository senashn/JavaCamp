package besinciGunOdevi.nLayeredDemo.consoleUI;

import besinciGunOdevi.nLayeredDemo.business.abstracts.AuthService;
import besinciGunOdevi.nLayeredDemo.business.adapters.googleAuthManagerAdapter;
import besinciGunOdevi.nLayeredDemo.business.concretes.AuthManager;
import besinciGunOdevi.nLayeredDemo.business.concretes.EmailManager;
import besinciGunOdevi.nLayeredDemo.business.concretes.UserManager;
import besinciGunOdevi.nLayeredDemo.dataAccess.concretes.inMemory;
import besinciGunOdevi.nLayeredDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Sena","Þahin","****@outlook.com","123456");
		
		inMemory memory = new inMemory();
		
		UserManager userManager = new UserManager(memory, new EmailManager());
		userManager.add(user);
		
		
		AuthService authService = new AuthManager(memory, new EmailManager());
		authService.logIn(user.getEmail(), user.getPassword());	
		
		
		AuthService authService2 = new googleAuthManagerAdapter();
		authService2.logIn("afsgg", "grgdhds");
		
	}

}
