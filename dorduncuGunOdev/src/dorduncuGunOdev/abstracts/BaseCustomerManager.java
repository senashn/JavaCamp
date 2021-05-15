package dorduncuGunOdev.abstracts;

import dorduncuGunOdev.entities.Customer;
import dorduncuGunOdev.interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " kaydedildi");
		
	}
	
}
