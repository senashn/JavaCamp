package besinciGunOdevi.nLayeredDemo.business.concretes;

import besinciGunOdevi.nLayeredDemo.business.abstracts.AuthService;
import besinciGunOdevi.nLayeredDemo.business.abstracts.EmailService;
import besinciGunOdevi.nLayeredDemo.dataAccess.abstracts.UserDao;
import besinciGunOdevi.nLayeredDemo.entities.concretes.User;


public class AuthManager implements AuthService{

	private UserDao userDao;
	private EmailService emailService;
	public AuthManager(UserDao userDao, EmailService emailService) {
		
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	@Override
	public void logIn(String email, String password) {
		
		int sayac=0;
		for(User user:userDao.getAll()) {
			if(user.getEmail()==email && user.getPassword() == password) {
				System.out.println("Giriþ yapýldý " + user.getFirstName());
				sayac++;
			}
			
		}
		if(sayac==0) {
			System.out.println("Giriþ yapýlamadý");
		}
	}

	@Override
	public void register(User user) {
		if(user.getPassword().length()>=6 && user.getFirstName().length()>2 && user.getLastName().length() > 2) { 
			
			userDao.add(user);
			emailService.send();
		}
		else {
			System.out.println("Kiþi eklenemedi");

		}
	
	}
	
}
