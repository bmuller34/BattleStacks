package deck;

import card.equipment.Equipment;
import card.characters.Character;
import deck.FieldStack;

/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * This class represents the Player's Hand that will pop
 * the first five cards off of the Deck and allow the player
 * to use them during a battle.
 * 
 * Things to do:
 * 
 * 1) Constructor with Characters as parameters.
 * 2) Create three separate Stacks for the Main & 
 * 		2 Supports and load Base Character to the bottom
 * 		and supporting methods.
 * 
 * 		These will be the Stacks Players will add to
 * 		during the Build Phase of the game.
 */
public class Player {
	private int order;
	private String teamColor;
	private int cardsPlayed;
	private final int maxHand = 5;
	private int cardsInHand;
	private boolean isActive = false;
	private Equipment[] hand = new Equipment[maxHand];
	private Deck<Equipment> deck = new Deck<Equipment>();
	public FieldStack main;

	public Player() {}

	public Player(Character main) {
		deck.initializeBase();
		deck.initializeMain(main);
		this.main = new FieldStack(main);
	}

	public Player(Character main, Character sup1, Character sup2) {
		deck.initializeBase();
		deck.initializeMain(main);
		//deck.initializeSupport(sup1);
		//deck.initializeSupport(sup2);
		this.main = new FieldStack(main);
	}
	
	public void initializeSupport(Character sup) {
		deck.initializeSupport(sup, this.deck);
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	public String getTeamColor() {
		return teamColor;
	}

	public void setTeamColor(String teamColor) {
		this.teamColor = teamColor;
	}
	
	public int getCardsPlayed() {
		return cardsPlayed;
	}

	public void setCardsPlayed(int cardsPlayed) {
		this.cardsPlayed = cardsPlayed;
	}

	public int getMaxHand() {
		return maxHand;
	}

	public int getCardsInHand() {
		return cardsInHand;
	}

	public void setCardsInHand(int cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public FieldStack useFieldStackByInt(int i) {
		if (i == 1)
			return this.main;
		else return null;
	}
	
	public void drawCards() {
		while (cardsInHand != maxHand) {
			for (int i = 0; i < hand.length; i++) {
				if (hand[i] == null) {
					hand[i] = deck.pop();
					cardsInHand++;
				}
			}
		}
	}
	
	public void playCard(int i, FieldStack f) {
		f.push(hand[i]);
		hand[i] = null;
		cardsInHand--;
		cardsPlayed++;
	}

	public void getInfo() {
		Deck<Equipment> newDeck = new Deck<Equipment>();
		while (deck.getDeckSize() != 0) {
			newDeck.push(deck.pop());
			System.out.println(newDeck.peek());
			System.out.println();
		}
		while (newDeck.getDeckSize() != 0) {
			deck.push(newDeck.pop());
		}
	}
	
	public void showHand() {
		for (int i = 0; i < hand.length; i++)
			System.out.println("\n" + hand[i] + "\n");
	}
	
	public void showHandWithNumbers() {
		System.out.println("\n*********************************************************");
		for (int i = 0; i < hand.length; i++) {
			if (hand[i] == null) {
				System.out.println("Card Number " + (i + 1));
				System.out.println("\n{Empty slot}\n");
				System.out.println("*********************************************************");
			} else {
				System.out.println("Card Number " + (i + 1));
				System.out.println("\n" + hand[i] + "\n");
				System.out.println("*********************************************************");
			}
		}
	}
	
	public void showHandByIndex(int i) {
		System.out.println(hand[i]);
	}
	
	public Equipment getCardInHandByIndex(int i) {
		return hand[i];
	}
	
	public Equipment getCardInHandByName(String str) {
		int i = 0;
		while (!hand[i].getName().equals(str)) {
			i++;
		}
		return hand[i];
	}
	
	public void showDeck() {
		while (this.deck.getDeckSize() != 0) {
			System.out.println("**********************************************************************");
			System.out.println(this.deck.peek());
			this.deck.pop();
		}
	}
	
	public void shuffleDeck() {
		this.deck.shuffle();
	}
}
