package codingWK5HW;

import java.util.Random;

/*
	 *	o	Deck
	 *		-	Fields
	 *			•	[x] A List of Card
	 *		-	Methods
	 *			•	[x] Shuffle (should randomize the order of the cards)
	 *			•	[x] Draw (should remove the top card from the list of cards and return it)
	 *			•	[x] In the constructor, when a new Deck is instantiated, it should have the standard 52 cards in a Deck.
	 */

public class Deck {
	
	//Fields
	public static final int totalCards = 52; 		// Standard Amount 52
	private int deckSize;							// Deck size of populated deck
	private Card[] deck;							// List of Card
	public Card currentCard = deck[0];						// Index
	public int cardsUsed;							// Counter for cards dealt/used
	public int cardsLeft = totalCards - cardsUsed;	// How many cards are left in the deck
		
	//Constructor 
	public Deck() {
		String[] faces = {"2", "3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		deck = new Card[totalCards];
		
		//Ask Nick to clarify - or if using enums makes this less complicated
		for (int suit = 0; suit < 4; suit++) {
			for(int face = 0; face < 13; face++) {
				deck[face + (suit*13)] = new Card(faces[face],suits[suit], face+2);
			}
		}	
		deckSize = 52;
		
	}
	
	//Public Methods
	public void displayDeck() {
		System.out.println("\nDisplaying All Cards in the Deck:\n");
		for(Card card: deck) {
			card.toPrint();
		}
		System.out.println("\n************************************\n");
			
	}

	public void shuffle() {
		Random r =  new Random();
		int swapIndex;
		Card temp;
		for (int startIndex = 0; startIndex < deckSize; startIndex++) {
			swapIndex = r.nextInt(deckSize);
			temp = deck[swapIndex];
			deck[swapIndex] = deck[startIndex];
			deck[startIndex] = temp;
		}
	}
 	
	public Card draw() {
		cardsUsed = cardsUsed + 1;
		return currentCard;			
	}	
}
