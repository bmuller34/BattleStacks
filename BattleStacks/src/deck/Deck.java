package deck;

import card.equipment.Equipment;
import card.equipment.basedeck.BaseDeck;
import card.equipment.knightdeck.KnightDeck;
import card.equipment.minorcharFighterdeck.FighterDeck;
import card.equipment.minorcharRudolphdeck.RudolphDeck;
import card.equipment.minorcharStevedeck.SteveDeck;
import card.equipment.minorcharThiefdeck.ThiefDeck;
import card.equipment.roguedeck.RogueDeck;
import card.equipment.warriordeck.WarriorDeck;
import card.equipment.wizarddeck.WizardDeck;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import card.characters.Character;

/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * This class creates a Deck of cards for a player to use
 * in the game.
 * 
 * When calling initializeBase, the 12 Default Cards are
 * pushed onto the Stack and returned to the Player.
 * 
 * Things to do:
 * 
 * 1) Implement shuffle method to randomly shuffle Stack.
 * 2) Implement addSupport method to return a Stack of Cards
 * 		that returns a Supporting Characters Deck (5 cards).
 */
public class Deck<E> {
	private Stack<Equipment> deck;
	private int size;

	public Deck() {
		deck = new Stack<Equipment>();
	}


	/****************These Methods Load Cards Into Player Hand****************/
	public Stack<Equipment> initializeBase() {
		return deck = this.addDefaultCards();
	}

	private Stack<Equipment> addDefaultCards() {
		BaseDeck bs = new BaseDeck();
		size += 12;
		return bs.addBaseDeck();
	}

	public Stack<Equipment> initializeMain(Character c) {
		Stack<Equipment> temp = new Stack<Equipment>();
		temp = this.addMain(c);
		while (temp.peek() != null) {
			deck.push(temp.pop());
			size++;
		}

		return deck;
	}

	private Stack<Equipment> addMain(Character c) {
		switch (c.getCharClass()) {
		case "Warrior": 
			WarriorDeck wd = new WarriorDeck();
			return wd.addCharacterDeck();
		case "Wizard":
			WizardDeck wizd = new WizardDeck();
			return wizd.addCharacterDeck();
		case "Rogue":
			RogueDeck rd = new RogueDeck();
			return rd.addCharacterDeck();
		case "Knight":
			KnightDeck kd = new KnightDeck();
			return kd.addCharacterDeck();
		}

		return null;
	}

	public void initializeSupport(Character c, Deck<Equipment> d) {
		this.addSupport(c, d);
	}

	private void addSupport(Character c, Deck<Equipment> d) {
		switch (c.getCharClass()) {
		case "Backup Fighter": 
			FighterDeck fd = new FighterDeck();
			fd.addToDeck(d);
			break;
		case "Rudolph the Brown-Nosed Jester":
			RudolphDeck rd = new RudolphDeck();
			rd.addToDeck(d);
			break;
		case "Steve from Accounting":
			SteveDeck sd = new SteveDeck();
			sd.addToDeck(d);
			break;
		case "Buddy Thief":
			ThiefDeck td = new ThiefDeck();
			td.addToDeck(d);
			break;
		}
	}

	/****************Misc Utility Methods****************/
	public void shuffle() {
		Equipment[] arr = new Equipment[30];
		int i = 0;
		
		// pop stack into array
		while (deck.getSize() != 0) {
			arr[i++] = deck.pop();
		}
		
		// shuffle elements
		shuffleDeck(arr);
		shuffleDeck(arr); //because why not?
		
		// push shuffled elements onto stack
		for (int j = 0; j < arr.length; j++) {
			deck.push(arr[j]);
		}
	}
	
	private void shuffleDeck(Equipment[] arr)
	  {
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = arr.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      Equipment a = arr[index];
	      arr[index] = arr[i];
	      arr[i] = a;
	    }
	  }

	public void push(Equipment card) {
		deck.push(card);
		size++;
	}

	public Equipment pop() {
		Equipment card = deck.pop();
		size--;
		return card;
	}

	public Equipment peek() {
		return deck.peek();
	}

	public int getCardsLeft() {
		return deck.getSize();
	}

	public int getDeckSize() {
		return size;
	}
}
