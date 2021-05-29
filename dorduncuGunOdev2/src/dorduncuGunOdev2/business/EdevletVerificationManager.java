package dorduncuGunOdev2.business;

import dorduncuGunOdev2.entities.Gamer;

public class EdevletVerificationManager implements VerificationService {

	@Override
	public boolean verify(Gamer gamer) {
		System.out.println("E-Devlet dogrulamasi saglandi, devam edebilirsiniz :) ");
		return true;
	}

	@Override
	public boolean update(Gamer gamer) {
		System.out.println("Bilgileriniz güncellenmiştir, devam edebilirsiniz :) ");
		return true;
	}

	@Override
	public boolean delete(Gamer gamer) {
		System.out.println("Gitmene üzüldük :'( ");
		return true;
	}
}
