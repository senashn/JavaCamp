package dorduncuGunOdev2;

import dorduncuGunOdev2.business.EdevletVerificationManager;
import dorduncuGunOdev2.business.GamerManager;
import dorduncuGunOdev2.business.GamerService;
import dorduncuGunOdev2.business.SalesManager;
import dorduncuGunOdev2.business.SalesService;
import dorduncuGunOdev2.entities.Game;
import dorduncuGunOdev2.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
			Gamer gamer = new Gamer();
			gamer.setId(1);
			gamer.setFirstName("Sena");
			gamer.setLastName("Þahin");
			gamer.setIdentificationNumber("56789");
			
			Game game = new Game();
			game.setGameId(9);
			game.setGameName("CSGO");
			game.setPrice(15);
			game.setStock(80);
			
			GamerService gamerService = new GamerManager(new EdevletVerificationManager());
			gamerService.add(gamer);
			
			SalesService salesService = new SalesManager();
			salesService.buy(game, gamer);
		}

	

}
