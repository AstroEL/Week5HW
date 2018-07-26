package codingWK5HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	
	static boolean exit;
	static Scanner sc = new Scanner(System.in);
	static List<Player> players = new ArrayList<Player>();
	
	
	
	//Main Game
	public static void main(String[] args) {
		
		while (!exit) {
			runWelcomeMenu();
			int choice = sc.nextInt();
			performChoice(choice);

		}
		
		
		Deck deck = new Deck();
		deck.displayDeck();
		deck.shuffle();
		deck.displayDeck();
	}
	
	
	//Public Methods
	public static void runWelcomeMenu() {
		System.out.println("\n**** Welcome to my Homework ****");
		System.out.println("********** Start Here **********");
		System.out.println("\n1) Add Player");
		System.out.println("2) Show Players");
		System.out.println("3) Remove a Player");
		System.out.println("4) Clear All Players");
		System.out.println("5) Begin game");
		System.out.println("6) Exit");
		System.out.println("\n**** Please Make a Selection ****\n");
	}
	
	public static void performChoice(int choice) {
		switch(choice) {
			case 1:
				addPlayer();
			case 2:
				showPlayers();
			case 3:
				removeAPlayer();
			case 4:
				clearAllPlayers();
			case 5:
				beginGame();
			case 6:
				exit = true;
			default:
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("... an error has occured.");
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
				break;
		}
		
	}
	
	public static void addPlayer() {
		System.out.println("\nEnter the first name of the player you wish to add.\n");
		
		
	}
	
	public static void showPlayers() {
		
	}
	
	public static void removeAPlayer() {
		
	}
	
	public static void clearAllPlayers() {
		
	}
	
	public static void beginGame() {
		
	}

}
