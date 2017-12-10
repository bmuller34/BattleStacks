package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;
import deck.Deck;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Thief Support Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Thief.
 *
 */
public class ThiefDeck {
	private Caltrops ct = new Caltrops();
	private PoisonDart pd = new PoisonDart();
	private Smile smi = new Smile();
	private Speed spd = new Speed();
	private WhatAnAss waa = new WhatAnAss();
	
	public ThiefDeck() {}
	
	public Deck<Equipment> addToDeck(Deck<Equipment> d) {
		d.push(ct.initialize());
		d.push(pd.initialize());
		d.push(smi.initialize());
		d.push(spd.initialize());
		d.push(waa.initialize());
		
		return d;
	}
}
