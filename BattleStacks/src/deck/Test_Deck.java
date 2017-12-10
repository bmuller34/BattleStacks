package deck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * This class tests the Deck class created as well as attempts
 * to fetch a single piece of data related to a particular card.
 * 
 * This will be useful in calculations for the Player.
 */
public class Test_Deck {

	public static void main(String[] args) {
		Deck<Equipment> myDeck = new Deck<Equipment>();
		Equipment eq = new Equipment();
		
		myDeck.initializeBase();
		
		for(int i = 0; i < myDeck.getDeckSize(); i++) {
			eq = myDeck.pop();
			System.out.println(eq.getCon());
			System.out.println();
		}
	}

}
