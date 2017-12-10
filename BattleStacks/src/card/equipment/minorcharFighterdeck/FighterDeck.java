package card.equipment.minorcharFighterdeck;

import card.equipment.Equipment;
import deck.Deck;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Fighter Support Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Fighter.
 *
 */
public class FighterDeck {
	private AxeofGrog aog = new AxeofGrog();
	private Derivative der = new Derivative();
	private Loincloth lc = new Loincloth();
	private Rage rage = new Rage();
	private Smarts smarts = new Smarts();
	
	public FighterDeck() {}
	
	public Deck<Equipment> addToDeck(Deck<Equipment> d) {
		d.push(aog.initialize());
		d.push(der.initialize());
		d.push(lc.initialize());
		d.push(rage.initialize());
		d.push(smarts.initialize());
		
		return d;
	}
}
