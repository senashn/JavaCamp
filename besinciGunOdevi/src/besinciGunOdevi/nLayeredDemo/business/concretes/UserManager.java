package besinciGunOdevi.nLayeredDemo.business.concretes;

import java.util.List;

import besinciGunOdevi.nLayeredDemo.business.abstracts.EmailService;
import besinciGunOdevi.nLayeredDemo.business.abstracts.UserService;
import besinciGunOdevi.nLayeredDemo.dataAccess.abstracts.UserDao;
import besinciGunOdevi.nLayeredDemo.entities.concretes.User;

public class UserManager implements UserService  {

	private UserDao userDao;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, EmailService emailService) {
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	
	@Override
	public void add(User user) {
		if(user.getPassword().length()>=6 && user.getFirstName().length()>=2 && user.getLastName().length() > 2) { 
			userDao.add(user);
			emailService.send();
		}
		
		else {
			System.out.println("Kiþi eklenemedi");
		}
		
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}
	
}
