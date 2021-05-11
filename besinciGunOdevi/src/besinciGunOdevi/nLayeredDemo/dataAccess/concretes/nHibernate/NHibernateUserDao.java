package besinciGunOdevi.nLayeredDemo.dataAccess.concretes.nHibernate;

import java.util.List;

import besinciGunOdevi.nLayeredDemo.dataAccess.abstracts.UserDao;
import besinciGunOdevi.nLayeredDemo.entities.concretes.User;

public class NHibernateUserDao implements UserDao{


	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " güncellendi");
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}
	
}
