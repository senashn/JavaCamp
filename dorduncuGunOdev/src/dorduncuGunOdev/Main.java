package dorduncuGunOdev;

import dorduncuGunOdev.abstracts.BaseCustomerManager;
import dorduncuGunOdev.concretes.RobotCheckManager;
import dorduncuGunOdev.entities.Customer;
import dorduncuGunOdev.services.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
			Customer customer = new Customer();
			
			customer.setId(1);
			customer.setFirstName("Sena");
			customer.setLastName("Þahin");
			customer.setIdentityNumber("123456789");
			
			BaseCustomerManager customerManager = new StarbucksCustomerManager(new RobotCheckManager());		
			customerManager.add(customer);

	}

}
