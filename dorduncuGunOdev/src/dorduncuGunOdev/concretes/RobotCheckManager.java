package dorduncuGunOdev.concretes;

import dorduncuGunOdev.entities.Customer;
import dorduncuGunOdev.interfaces.CustomerCheckService;

public class RobotCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Robot doðrulamasý uygulandý");
		return false;
	}

}
