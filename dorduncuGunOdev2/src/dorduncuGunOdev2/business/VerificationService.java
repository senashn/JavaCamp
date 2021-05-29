package dorduncuGunOdev2.business;

import dorduncuGunOdev2.entities.Gamer;

public interface VerificationService {

	public boolean verify(Gamer gamer);
	public boolean update(Gamer gamer);
	public boolean delete(Gamer gamer);

}
