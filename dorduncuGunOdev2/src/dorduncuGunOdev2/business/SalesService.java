package dorduncuGunOdev2.business;

import dorduncuGunOdev2.entities.Game;
import dorduncuGunOdev2.entities.Gamer;

public interface SalesService {
	public void buy(Game game, Gamer gamer);
}