package card.equipment.minorcharRudolphdeck;

import card.equipment.Equipment;
import deck.Deck;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Rudolph Support Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Rudolph.
 *
 */
public class RudolphDeck {
	private HowFair hf = new HowFair();
	private HowSmart hsm = new HowSmart();
	private HowStrong hst = new HowStrong();
	private HowSwift hsw = new HowSwift();
	private HowTough ht = new HowTough();
	
	public RudolphDeck() {}
	
	public Deck<Equipment> addToDeck(Deck<Equipment> d) {
		d.push(hf.initialize());
		d.push(hsm.initialize());
		d.push(hst.initialize());
		d.push(hsw.initialize());
		d.push(ht.initialize());
		
		return d;
	}
}
