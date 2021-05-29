package dorduncuGunOdev2.business;

import dorduncuGunOdev2.entities.Gamer;

public class GamerManager implements GamerService {
	VerificationService service;

	public GamerManager(VerificationService service) {
		this.service = service;
	}

	@Override
	public void add(Gamer gamer) {
		if (service.verify(gamer)) {
			System.out.println(gamer.getFirstName() + gamer.getLastName()+ " eklendi.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		if (service.update(gamer)) {
			System.out.println(gamer.getFirstName() + gamer.getLastName()+ " bilgileriniz güncellenmiþtir.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if (service.delete(gamer)) {
			System.out.println(gamer.getFirstName() + gamer.getLastName()+ " oyuncusu sistemden silinmiþtir");
		}
	}
}
