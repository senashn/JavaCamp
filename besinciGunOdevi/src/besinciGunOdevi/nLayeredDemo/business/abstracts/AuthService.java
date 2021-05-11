package besinciGunOdevi.nLayeredDemo.business.abstracts;

import besinciGunOdevi.nLayeredDemo.entities.concretes.User;

public interface AuthService {
	void logIn(String email, String password);
	void register(User user);
	
}
