package dorduncuGunOdev2.entities;

public class Game {
	private int gameId;
	private int price;
	private int stocks;
	private String gameName;
	private String gameDetails; 
	

	public Game() {

	}
	
	public Game(int gameId, int price, int stocks, String gameName, String gameDetails) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
		this.stocks = stocks;
		this.gameDetails= gameDetails;
	}


	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stocks;
	}

	public void setStock(int stocks) {
		this.stocks = stocks;
	}

	public String getGameDetails() {
		return gameDetails;
	}

	public void setGameDetails(String gameDetails) {
		this.gameDetails = gameDetails;
	}
	
}
