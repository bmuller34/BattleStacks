package card.equipment.minorcharStevedeck;

import card.equipment.Equipment;
import deck.Deck;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Steve Support Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Steve.
 *
 */
public class SteveDeck {
	private BlankCheck bc = new BlankCheck();
	private Calculator cal = new Calculator();
	private DrinkingWater dw = new DrinkingWater();
	private Fitness fit = new Fitness();
	private HondaCivic hc = new HondaCivic();
	
	public SteveDeck() {}
	
	public Deck<Equipment> addToDeck(Deck<Equipment> d) {
		d.push(bc.initialize());
		d.push(cal.initialize());
		d.push(dw.initialize());
		d.push(fit.initialize());
		d.push(hc.initialize());
		
		return d;
	}
}
