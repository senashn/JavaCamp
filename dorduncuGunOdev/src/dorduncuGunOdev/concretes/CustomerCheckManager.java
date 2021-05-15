package dorduncuGunOdev.concretes;

import dorduncuGunOdev.entities.Customer;
import dorduncuGunOdev.interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Mernis onaylandý : ");
		return false;
	}
	
	
}
	
