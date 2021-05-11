package besinciGunOdevi.nLayeredDemo.business.adapters;

import besinciGunOdevi.nLayeredDemo.business.abstracts.AuthService;
import besinciGunOdevi.nLayeredDemo.entities.concretes.User;
import besinciGunOdevi.nLayeredDemo.googleAuth.googleAuthManager;

public class googleAuthManagerAdapter implements AuthService{

	
	googleAuthManager googleAuth = new googleAuthManager();	
	
	
	@Override
	public void logIn(String email, String password) {
		googleAuth.login(email, password);	
	
	}

	@Override
	public void register(User user) {
		googleAuth.register(user);
		
	}
	
}
