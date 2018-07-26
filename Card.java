package codingWK5HW;

	/*
	 * Create the following classes that interact with each other:
	 * 
	 * 	 o	Card
	 *		-	Fields
	 *			•	[x] Value (e.g. 2 – 10 are their respective values. Jack – Ace is 11 – 14)
	 *			•	[x] Name (e.g. Ace of Diamonds, or Two of Hearts)
	 *		-	Methods
	 *			•	[x] Getters and setters for the fields
	 *			•	[x] A method that prints out information about the card
	 */

public class Card {
	
	//Fields
	private String face;
	private String suit;
	private int value;
	
	//Constructors
	public Card() {}
	
	public Card(String face, String suit, int value) {
		this.setFace(face); //this represents self, the instance of the object when its created
		this.setSuit(suit);
		this.setValue(value);
	}

	//Public Methods
	public  void cardInfo() {
		System.out.println("\nCard Name: " +face + " of " + suit);
		System.out.println("This card is worth: "+ value + " points.");
		System.out.println("*************************************\n");
	}
	
	public void toPrint() {
		System.out.println(face + " of " + suit);
	}
	
	//Getters & Setters
	public  String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public  String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public  int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
		
}