package codingWK5HW;

import java.util.List;

/*
	 *	o	Player
	 *		-	Fields
	 *			•	[x] Hand (List of Card)
	 *			•	[x] Score
	 *			•	[x] Name
	 *		-	Methods
	 *			•	[x] Describe (should print out info about the Player)
	 *			•	[x] Discard (should remove a specific card from the Hand field)
	 *			•	[x] Draw (should take a Deck as an argument and call the draw() method 
	 *					on the Deck an add the returned Card to the hand field)
	 *
	 */

public class Player {
	
	//Fields
	private static String playerName;
	private static List<Card> playerHand;
	private static int playerScore;

	//Constructors
	public Player() {}
	
	public Player(String playerName) {
		Player.playerName = playerName;
	}
	
	public Player(String playerName, List<Card> playerHand, int playerScore) {
		Player.playerName = playerName;
		Player.playerHand = playerHand;
		Player.setPlayerScore(playerScore);
	}
	
	//Public Methods
	public static void getPlayerInfo() {
		System.out.println("\n******PLAYER INFORMATION*******\n");
		System.out.println("Player Name: " + playerName);
		System.out.println("Player Hand: " + playerHand);
		System.out.println("Player Score: ");
		System.out.println("***********************************");
	}

	public static Card playerDraw(Deck deck) {
		return deck.draw();
	}

	public static void getHand() {
		for (Card card : playerHand) {
			System.out.println(card.toString());
		}
	}
	public boolean discard(Card card) {
		return playerHand.remove(card);
	}
	
	public static int getPlayerScore() {
		return playerScore;
	}

	public static void setPlayerScore(int playerScore) {
		Player.playerScore = playerScore;
	}
}
