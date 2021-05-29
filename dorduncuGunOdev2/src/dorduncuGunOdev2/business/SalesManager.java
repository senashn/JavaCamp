package dorduncuGunOdev2.business;

import dorduncuGunOdev2.entities.Campaign;
import dorduncuGunOdev2.entities.Game;
import dorduncuGunOdev2.entities.Gamer;

public class SalesManager implements SalesService {
	
	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kisisi " + game.getGameName() + " oyununu satin alindi");
	}
	
	public void buy(Game game, Campaign campaign, Gamer gamer) {
		System.out.println(" Kampanyali satis yapildi");
	}
}
